package com.example.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.NewUserBO;
import com.example.lesson04.model.NewUser;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
		
	@Autowired
	private NewUserBO newUserBO;
	
	@RequestMapping("/add_user_view")
	public String addUserView() {
		
		return"lesson06/addUserView";
	}
	
	@ResponseBody
	@PostMapping("/add_user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value="email",required = false) String email,
			@RequestParam(value="introduce",required = false) String introduce
			) {
		
		//insert db
		NewUser newuser = new NewUser();
		
		newuser.setName(name);
		newuser.setYyyymmdd(yyyymmdd);
		newuser.setEmail(email);
		newuser.setIntroduce(introduce);
		
		newUserBO.addNewUser(newuser);
		
		return "입력 성공";
	}
}

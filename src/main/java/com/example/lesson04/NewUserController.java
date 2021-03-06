package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.NewUserBO;
import com.example.lesson04.model.NewUser;


@RequestMapping("/lesson04")
@Controller
public class NewUserController {
	
	@Autowired
	private NewUserBO newUserBO;
	
	
	
	//405 에러: 메소드가 불일치
	//http://localhost/lesson04/sign_up_view
	@RequestMapping(path = "/sign_up_view", method = RequestMethod.GET)
	public String signUpView() {
			
		return "lesson04/addUserView"; // view 경로 jsp
	}
	
	
	//http://localhost/lesson04/add_user
//	@RequestMapping(path="/add_user", method = RequestMethod.POST)
	@PostMapping("/add_user")
	public String addUser(
			@RequestParam("name")String name, //post방식일때는 jsp에 있는name을 가져옴
			@RequestParam("yyyymmdd")String yyyymmdd,
			@RequestParam(value="email", required=false)String email,
			@RequestParam(value="introduce", required=false)String introduce) {
		
		//db insert
		NewUser newuser = new NewUser();
		
		newuser.setName(name);
		newuser.setYyyymmdd(yyyymmdd);
		newuser.setEmail(email);
		newuser.setIntroduce(introduce);
		
		newUserBO.addNewUser(newuser);
		
		//response
		return "lesson04/afterAddUser";
		
		
	}
	
	//localhost/lesson04/last_user_view
	@GetMapping("/last_user_view")
	public String lastUserView(Model model) {
		// 가장 최근에 가입한 사람 한명 정보 가져오기 - > select db
		NewUser newUser = newUserBO.getLastNewUser();
		
		
		//결과 jsp view 에 결과 객체값을 model에 담아 넘긴다.
		model.addAttribute("result", newUser);
							//이름, 데이터
		model.addAttribute("title", "회원정보");
		
		//response
		
		return "lesson04/lastUserView";
 	}
	
	
}

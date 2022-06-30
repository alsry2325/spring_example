package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.NewStudentBO;
import com.example.lesson04.model.NewStudent;

@RequestMapping("/lesson04")
@Controller
public class NewStrudentController {

	@Autowired
	NewStudentBO newStudentBO;
	
	//localhost/lesson04/add_student_view
	@RequestMapping("/add_student_view")
	public String addStudentView() {
		
		return "lesson04/addStudentView";
	}
	
	@PostMapping("/add_student")
	public String addStudent(
			@ModelAttribute NewStudent newStudent, 
			Model model
			) { //태그에서 name속성에 일치하는 필드에 값이 들어간다
		
		//db insert => id키값
		newStudentBO.addStudent(newStudent);
		
		//db select
		//		System.out.println("#####"+newStudent.getId());
		//newStudent에 담긴 ID값을 가져옴
		newStudent	= newStudentBO.getStudentById(newStudent.getId());
		//model에 담는다
		model.addAttribute("result", newStudent);
		model.addAttribute("test", "학생정보");
		//return jsp경로
		
		return"/lesson04/afterstudentview";
		
	}
	
}

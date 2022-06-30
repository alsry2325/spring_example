package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.NewStudentDAO;
import com.example.lesson04.model.NewStudent;

@Service
public class NewStudentBO {

	@Autowired
	NewStudentDAO newStudentDAO;

	public void addStudent(NewStudent newStudent) {

		newStudentDAO.insertNewSudent(newStudent);
	}

	public NewStudent getStudentById(int id) { //id를 필수로 가져오기위해
		return newStudentDAO.selectNewStudentById(id);
	}
}

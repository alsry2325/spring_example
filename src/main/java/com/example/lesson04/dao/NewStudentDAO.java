package com.example.lesson04.dao;

import com.example.lesson04.model.NewStudent;

public interface NewStudentDAO {

	
	public void insertNewSudent(NewStudent newStudent);
	
	public NewStudent selectNewStudentById(int id);
	
}

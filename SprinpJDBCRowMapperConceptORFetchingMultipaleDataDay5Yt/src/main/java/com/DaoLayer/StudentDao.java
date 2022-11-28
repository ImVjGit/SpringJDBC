package com.DaoLayer;

import java.util.List;

import com.entity.Student;

public interface StudentDao {

	//insert value 
	public int insert(Student student);

	//Modify value 
	public int change(Student student);
	
	//Delete value 
	public int remove(int studentid);
	
	//Display one data info 
	public Student getstudent(int studID);
	
	//Display All data info
	public List<Student> getAllStudent();
	
	
}

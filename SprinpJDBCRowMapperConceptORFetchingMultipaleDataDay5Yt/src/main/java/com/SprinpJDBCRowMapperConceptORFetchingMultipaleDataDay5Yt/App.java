package com.SprinpJDBCRowMapperConceptORFetchingMultipaleDataDay5Yt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DaoLayer.StudentDao;
import com.entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

		// setting value
		System.out.println("Congratualation !!! Your Data!...");
		StudentDao stud = (StudentDao) cont.getBean("studentDao");

		List<Student> list = stud.getAllStudent();

		for (Student st : list) {
			System.out.println(st);
		}

	}

}

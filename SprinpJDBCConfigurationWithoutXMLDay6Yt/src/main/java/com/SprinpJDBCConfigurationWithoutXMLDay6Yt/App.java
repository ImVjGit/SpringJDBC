package com.SprinpJDBCConfigurationWithoutXMLDay6Yt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DoaLayer.StudentDao;
import com.Entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new AnnotationConfigApplicationContext(JdbcCondifg.class);

		// setting value
		System.out.println("Congratualation !!! Your Data!...");
		StudentDao stud = (StudentDao) cont.getBean("studentDao");

		List<Student> list = stud.getAllStudent();

		for (Student st : list) {
			System.out.println(st);
		}

	}

}

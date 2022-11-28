package Com.SprinpJDBCRowMapperConceptORFetchingDataDay4Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.DaoLayer.StudentDao;
import Com.Entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

		// setting value
		System.out.println("Congratualation !!! Your Data!...");
		StudentDao stud = (StudentDao) cont.getBean("studentDao");
		Student student = stud.getstudent(122 );
		System.out.println(student);

	}

}

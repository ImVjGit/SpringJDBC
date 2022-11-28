package Com.SprinpJDBCDeleteOperationDay3Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.DaoLayer.StudentDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

		// setting value
		
		StudentDao stud = (StudentDao) cont.getBean("studentDao");

		int result = stud.remove(456);


		System.out.println("Congratualation !!! Data Deleted!...");
	}

}

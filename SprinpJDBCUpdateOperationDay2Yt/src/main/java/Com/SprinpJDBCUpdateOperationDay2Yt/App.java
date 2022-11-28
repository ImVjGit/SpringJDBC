package Com.SprinpJDBCUpdateOperationDay2Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Dao.StudentDao;
import Com.Entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

		// setting value
		Student st = new Student();
		st.setId(15);
		st.setName("Vijay");
		st.setCity("Pune");

		StudentDao stud = (StudentDao) cont.getBean("studentDao");

		int result = stud.change(st);

		System.out.println("number of record insert : " + result);
		System.out.println("Congratualation !!! Data Modity.");
	}

}

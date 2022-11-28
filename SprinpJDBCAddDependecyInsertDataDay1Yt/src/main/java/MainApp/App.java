package MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Daolayer.StudentDao;

import Entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

		/*
		 * JdbcTemplate templet =(JdbcTemplate)cont.getBean("jdbcTemplet");
		 * 
		 * //insert query String query =
		 * "insert into student(d,name,city) values(?,?,?)";
		 */

		// setting value
		Student st = new Student();
		st.setId(122);
		st.setName("Rutika");
		st.setCity("Nashik");

		StudentDao stud = (StudentDao) cont.getBean("studentDao");
		// caling method

		int result = stud.insert(st);

		// fire the query
		// int result = templet.update(query,456,"uttam kumar","Pune");
		System.out.println("number of record insert : " + result);
		System.out.println("Congratualation !!! Data Save.");
	}

}

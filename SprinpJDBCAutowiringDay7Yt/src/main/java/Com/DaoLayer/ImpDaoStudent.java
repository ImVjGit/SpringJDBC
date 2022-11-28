package Com.DaoLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import Com.Entity.Student;

@Component("studentDao")
public class ImpDaoStudent implements StudentDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int insert(Student student) {

		// insert query
		String query = "insert into student(d,name,city) values(?,?,?)";

		int Result = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());

		return Result;
	}

	public int change(Student student) {

		String query = "update student set name=? , city=? where d=?";

		int updateQuery = this.jdbctemplate.update(query, student.getName(), student.getCity(), student.getId());
		return updateQuery;
	}

	public int remove(int studentid) {
		String query = "delete from student where d=?";
		int deleteid = this.jdbctemplate.update(query, studentid);
		return deleteid;
	}

	// Single Student data
	public Student getstudent(int studID) {
		String query = "Select * from student where d=?";
		RowMapper<Student> rowMap = (RowMapper<Student>) new RowMapperImpl();
		Student st = this.jdbctemplate.queryForObject(query, rowMap, studID);
		return st;
	}

	public List<Student> getAllStudent() {

		String query = "Select * from student";
		List<Student> list = this.jdbctemplate.query(query,new RowMapperImpl());
		return list;
	}

	
	
	
//Using anonymous class and plz remove RowMapperImp 
//	public Student getstudent(int studID) {
//		String query = "Select * from student where d=?";
//		
//		Student st = this.jdbctemplate.queryForObject(query, new RowMapper<Student>() {
//
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student stud= new Student();
//				stud.setId(rs.getInt(1));
//				stud.setName(rs.getString(2));
//				stud.setCity(rs.getString(3));
//				return stud;
//			}
//			
//			
//			
//		}, studID);
//		return st;
//	}
//	
	

}

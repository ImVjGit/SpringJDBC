package Com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import Com.Entity.Student;

public class ImpDaoStudent implements StudentDao {

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

	public int change(Com.Entity.Student student) {
		
		String query = "update student set name=? , city=? where d=?";
		
		int updateQuery = this.jdbctemplate.update(query,student.getName(),student.getCity(),student.getId());
		return updateQuery;
	}

}

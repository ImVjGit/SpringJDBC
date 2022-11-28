package com.Daolayer;

import org.springframework.jdbc.core.JdbcTemplate;

import Entity.Student;

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

}

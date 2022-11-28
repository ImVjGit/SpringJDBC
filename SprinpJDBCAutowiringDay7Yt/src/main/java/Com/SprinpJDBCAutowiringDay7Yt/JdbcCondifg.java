package Com.SprinpJDBCAutowiringDay7Yt;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Com.DaoLayer.ImpDaoStudent;
import Com.DaoLayer.StudentDao;

@Configuration
@ComponentScan(basePackages = {"Com.DaoLayer"})
public class JdbcCondifg {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("toor");
		return ds;

	}

	@Bean("jdbcTemplet")
	public JdbcTemplate getTemplet() {
		JdbcTemplate jdbcTemplet = new JdbcTemplate();
		jdbcTemplet.setDataSource(getDataSource());
		return jdbcTemplet;

	}
	@Bean("studentDao")
	public StudentDao getstudDao() {
		ImpDaoStudent imDao = new ImpDaoStudent();
		imDao.setJdbctemplate(getTemplet());
		return imDao;

	}
}
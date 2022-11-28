package Com.Dao;

import Com.Entity.Student;

public interface StudentDao {

	//insert value 
	public int insert(Student student);

	//Modify value 
	public int change(Student student);
}

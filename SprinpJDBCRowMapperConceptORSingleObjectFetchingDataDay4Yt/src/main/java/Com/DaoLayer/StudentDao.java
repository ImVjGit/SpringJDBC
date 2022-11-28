package Com.DaoLayer;

import Com.Entity.Student;

public interface StudentDao {

	//insert value 
	public int insert(Student student);

	//Modify value 
	public int change(Student student);
	
	//Delete value 
	public int remove(int studentid);
	
	//Display one data info 
	public Student getstudent(int studID);
	
}

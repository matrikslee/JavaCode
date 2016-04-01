package test;

import org.junit.Test;

import dao.StudentDao;
import domain.Student;
import exception.StudentNotExistException;

public class StudentDaoTest {

	@Test
	public void testAdd() {
		
		StudentDao dao = new StudentDao();
		Student s = new Student();
		s.setExamid("121");
		s.setGrade(89);
		s.setIdcard("121");
		s.setLocation("北京");
		s.setName("aa");
		dao.add(s);
	}
	
	@Test
	public void testFind(){
		StudentDao dao = new StudentDao();
		dao.find("121");
	}
	
	@Test
	public void testDelete() throws StudentNotExistException{
		StudentDao dao = new StudentDao();
		dao.delete("aa");
	}

}

package kodlama.io.dataAccess;

import java.util.Locale.Category;

import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

public class JdbcProductDao implements CategoryDao, CourseDao ,InstructorDao{
	
	@Override
	public void addCategory(kodlama.io.entities.Category category) {
		System.out.println("JDBC ile eklendi.");		
	}
	@Override
	public void addCourse(Course course) {
		System.out.println("JDBC ile eklendi.");	
	}
	public void addInstructor(Instructor instructor) {
		System.out.println("kişi belirlendi");
	}
}

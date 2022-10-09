package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InstructorManager;
import kodlama.io.coreLogging.DatabaseLogger;
import kodlama.io.coreLogging.FileLogger;
import kodlama.io.coreLogging.MailLogger;
import kodlama.io.dataAccess.HibernateProductDao;
import kodlama.io.dataAccess.JdbcProductDao;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;
import kodlama.io.entities.Category;

public class Main {
	public static void main(String[] args) throws Exception {
		Course course0 = new Course(10, "C#+Angular", 5);
		Course course1 = new Course(11, "JAVA+React", 10);
		Course course2 = new Course(12, "JavaScript", 15);
		Course course3 = new Course(13, ".Net", 20);
		Course course4 = new Course(14, "JAVA", 25);
		Course course5 = new Course(15, "BasicCourse", 30);
		Course course6 = new Course(16, "Bağımlılığı test etme deneme kursu", 35);

		kodlama.io.coreLogging.Logger[] loggers = { new DatabaseLogger(), new MailLogger(), new FileLogger() };

		CourseManager courseManager = new CourseManager(new HibernateProductDao(), loggers);

		courseManager.add(course0);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		courseManager.add(course6);
 ////////////////////
		Category category0 = new Category("Software Kategorisi.");
				
		CategoryManager categoryManager = new CategoryManager(new JdbcProductDao(), loggers);

		categoryManager.addCategory(category0);
/////////////////////		
		Instructor instructor0 = new Instructor("Engin", "Demirog");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcProductDao(),loggers);
        
		instructorManager.addInstructor(instructor0);
	}

}

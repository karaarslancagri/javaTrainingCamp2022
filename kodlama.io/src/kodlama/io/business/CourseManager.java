package kodlama.io.business;

import kodlama.io.coreLogging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao,kodlama.io.coreLogging.Logger[] loggers2) {
		this.courseDao = courseDao;
		this.loggers =(Logger[]) loggers2;
	}
	List<Course> courses = new ArrayList<Course>();
	
	public void add(Course course) throws Exception{
		if(course.getPrice() < 0) {
			System.out.println("Price must be at least 0");
		}
		for(Course sr : courses) {
			if(sr.getCourseName() == course.getCourseName()) {
				throw new Exception("Course name already exists");
			}
		}
		courses.add(course);
		courseDao.addCourse(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		System.out.println("**********");
	}

}

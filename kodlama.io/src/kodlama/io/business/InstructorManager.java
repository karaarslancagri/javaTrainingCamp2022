package kodlama.io.business;

import kodlama.io.coreLogging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public InstructorManager(CategoryDao categoryDao, kodlama.io.coreLogging.Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		
	}
	public void addInstructor(Instructor instructor) {
		instructor.add(instructor);
		InstructorDao.addInstructor(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName());
			logger.log(instructor.getLastName());
			System.out.println("Eğitmen");
		}
		System.out.println("**********");
	}

}

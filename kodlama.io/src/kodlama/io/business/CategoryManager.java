package kodlama.io.business;

import kodlama.io.coreLogging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, kodlama.io.coreLogging.Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	List<Category> categories = new ArrayList<Category>();

	public void addCategory(Category category) throws Exception {
		for (Category cr : categories) {
			if (cr.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Category name already exists");
			}
		}
		categories.add(category);
		categoryDao.addCategory(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		System.out.println("***************");
	}

}

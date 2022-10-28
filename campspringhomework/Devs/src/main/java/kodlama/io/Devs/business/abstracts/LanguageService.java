package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> list();
	public Language add(Language language) throws Exception;
	public void delete(int id);
	public void uptade(Language language, int id);	
	public Language getWithId(int id);
	public boolean IsNameBlankAndEmpty(Language language);
	public boolean IsNameExist(Language language);

}

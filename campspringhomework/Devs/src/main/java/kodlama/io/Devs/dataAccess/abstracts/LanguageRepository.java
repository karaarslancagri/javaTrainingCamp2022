package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	public Language add(Language language);
	public void delete(int id);
	public void uptade(Language language, int id);
		public Language getWithId(int id);

}

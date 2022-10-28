package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1, "C# Camp","C#"));
		languages.add(new Language(2, "JAVA Camp", "JAVA"));
		languages.add(new Language(3, "Python Camp","Python"));
		
	
	}

	@Override
	public Language add(Language language) {
	    languages.add(language);
		return language;
	}


	@Override
	public Language getWithId(int id) {	
		for(Language language :languages) {
			if(language.getId()==id) {
				return language;
			}			
		}
		return null;	
			
		
	}

	@Override
	public void uptade(Language language, int id) {	
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public void delete(int id) {
		languages.remove(id);	
	}

}

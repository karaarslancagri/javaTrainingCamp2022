package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguagesManager implements LanguageService {

	private LanguageRepository languageRepository;		
	
    @Autowired
	public LanguagesManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<Language> list() {
		return languageRepository.getAll();
	}

	@Override	
	public Language add(Language language) throws Exception {
      if(IsNameBlankAndEmpty(language)) {
    	  throw new Exception("Programlama dili boş geçilemez");
    	  
      }else if(IsNameExist(language)) {
    	  throw new Exception("Programlama dili tekrar edemez");
      }
      return languageRepository.add(language);
      				
	}	
			


	@Override
	public void uptade(Language language, int id) {
		languageRepository.uptade(language, id);

	}

	@Override
	public Language getWithId(int id) {	
		return languageRepository.getWithId(id);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}

	@Override
	public boolean IsNameBlankAndEmpty(Language language) {
		if(language.getName().isEmpty() || language.getName().isBlank()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean IsNameExist(Language language) {
		for(Language programmingL : languageRepository.getAll()) {
			if (programmingL.getName().equalsIgnoreCase(language.getName())) {
				return true;
			}
		}
		return false;	
	}

}

package kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.language.UptadeLanguageRequest;
import kodlama.io.Devs.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.languages.GetByIdLanguageResponse;

@RestController
@RequestMapping("api/languages")
public class LanguageController {
	
	private LanguageService languageService;
	
    @Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
    
    @GetMapping("/getAll")
    public List<GetAllLanguagesResponse> getAll(){
    	return languageService.getAll();	
    }
    
    
    @GetMapping("/getbyid")
	public GetByIdLanguageResponse getById(int id) {
		return languageService.getById(id);
	}
    
     
    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {	
    	languageService.add(createLanguageRequest);	
    }
    
    
    @PutMapping("/update")
	public void update(UptadeLanguageRequest updateLanguageRequest, int id) throws Exception {
		languageService.uptade(updateLanguageRequest, id);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteProgrammingLanguageRequest, int id) {
		languageService.delete(deleteProgrammingLanguageRequest, id);
	}
 
    
   
    
    
    

}

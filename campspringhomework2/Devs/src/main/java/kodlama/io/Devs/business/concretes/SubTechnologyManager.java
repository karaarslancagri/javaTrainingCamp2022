package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.SubTechnologyService;
import kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Devs.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Devs.business.responses.subTechnology.GetAllSubTechnologiesResponse;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.Devs.entities.concretes.Language;
import kodlama.io.Devs.entities.concretes.SubTechnologies;
@Service
public class SubTechnologyManager implements SubTechnologyService{
	
	private SubTechnologyRepository subTechnologyRepository;
	private LanguageRepository languageRepository;
	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository,LanguageRepository languageRepository) {
		this.subTechnologyRepository=subTechnologyRepository;
		this.languageRepository=languageRepository;
	}

	@Override
	public List<GetAllSubTechnologiesResponse> getAll(){
		
		List<SubTechnologies> subTechnologiess = subTechnologyRepository.findAll();
		List<GetAllSubTechnologiesResponse> getAllSubTechnologiesResponses=new ArrayList<GetAllSubTechnologiesResponse>();
		
		for(SubTechnologies subTechnologies : subTechnologiess) {
			GetAllSubTechnologiesResponse subTechnologiesResponse = new GetAllSubTechnologiesResponse();
			
			subTechnologiesResponse.setSubTechnologyName(subTechnologies.getSubTechnologyName());
			subTechnologiesResponse.setLanguageName(subTechnologies.getLanguageName());
			
			getAllSubTechnologiesResponses.add(subTechnologiesResponse);

			
			
		}
		return getAllSubTechnologiesResponses;
	}
	
	@Override
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
		SubTechnologies subTechnologies = new SubTechnologies();
		Language language = languageRepository.findById(createSubTechnologyRequest.getLanguageId()).get();
		subTechnologies.setSubTechnologyName(createSubTechnologyRequest.getSubTechnologyName());
		subTechnologies.setLanguage(language);
		subTechnologyRepository.save(subTechnologies);
	}

	@Override
	public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id) {
		
		SubTechnologies subTechnology = subTechnologyRepository.findById(id).get();
		Language programmingLanguage = languageRepository.findById(updateSubTechnologyRequest.getLanguageId()).get();
		subTechnology.setSubTechnologyName(updateSubTechnologyRequest.getSubTechnologyName());
		subTechnology.setLanguage(programmingLanguage);
	
		subTechnologyRepository.save(subTechnology);
		
	}

	@Override
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest, int id) {
		
		subTechnologyRepository.deleteById(deleteSubTechnologyRequest.getSubTechnologyId());

	
		
	}
	

	
	
	
}

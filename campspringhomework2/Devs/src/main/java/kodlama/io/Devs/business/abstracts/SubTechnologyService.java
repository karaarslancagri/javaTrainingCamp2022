package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Devs.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Devs.business.responses.subTechnology.GetAllSubTechnologiesResponse;

public interface SubTechnologyService {

	List<GetAllSubTechnologiesResponse> getAll();

	void add(CreateSubTechnologyRequest createSubTechnologyRequest);

	void update(UpdateSubTechnologyRequest updateSubTechnologyRequest, int id);

	void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest, int id);
	
	
}

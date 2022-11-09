package kodlama.io.Devs.business.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubTechnologyRequest {
	
	private int languageId;
	private String subTechnologyName;
	

}

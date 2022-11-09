package kodlama.io.Devs.business.responses.languages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesResponse {
	
	private int languageId;
	private String languageName;

}

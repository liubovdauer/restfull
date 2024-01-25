package de.dauer.rest.controllers.mapping;

import org.springframework.stereotype.Service;

import de.dauer.rest.businessServices.ModelDTO;
import de.dauer.rest.controllers.ModelAPI;

@Service
public class MapperAPIToDTO {
	
	public ModelDTO convertEnglishToGerman(ModelAPI modelAPI) {
		ModelDTO modelDTO= new ModelDTO();
		modelDTO.setVorname(modelAPI.getFirstName());
		modelDTO.setNachname(modelAPI.getLastName());
		modelDTO.setStadt(modelAPI.getCity());
		System.out.println("ModelDTO "+modelDTO);
		return modelDTO;
	}

}

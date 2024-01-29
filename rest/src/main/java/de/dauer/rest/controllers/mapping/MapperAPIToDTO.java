package de.dauer.rest.controllers.mapping;

import org.springframework.stereotype.Service;

import de.dauer.rest.businessServices.ModelDTO;
import de.dauer.rest.controllers.ModelAPI;

@Service
public class MapperAPIToDTO {
	
	public ModelDTO convertEnglishToGerman(ModelAPI modelAPI) {
		
		return ModelDTO.builder().vorname(modelAPI.getFirstName()).nachname(modelAPI.getLastName()).stadt(modelAPI.getCity()).build();
	}

}

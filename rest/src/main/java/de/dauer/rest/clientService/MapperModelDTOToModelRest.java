package de.dauer.rest.clientService;

import org.springframework.stereotype.Service;

import de.dauer.rest.businessServices.ModelDTO;

@Service
public class MapperModelDTOToModelRest {
	
	public ModelRest convertToModelRest(ModelDTO modelDTO) {
		return ModelRest.builder().vorname(modelDTO.getVorname()).nachname(modelDTO.getNachname()).stadt(modelDTO.getStadt()).build();
	}

}

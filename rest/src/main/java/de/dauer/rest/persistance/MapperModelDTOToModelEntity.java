package de.dauer.rest.persistance;

import org.springframework.stereotype.Service;

import de.dauer.rest.businessServices.ModelDTO;

@Service
public class MapperModelDTOToModelEntity {
	
	public ModelEntity convertToModelEntity(ModelDTO modelDTO) {
		

		return ModelEntity.builder().firstName(modelDTO.getVorname()).lastName(modelDTO.getNachname()).city(modelDTO.getStadt()).build();
	}

}

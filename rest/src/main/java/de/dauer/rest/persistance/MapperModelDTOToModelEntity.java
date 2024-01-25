package de.dauer.rest.persistance;

import org.springframework.stereotype.Service;

import de.dauer.rest.businessServices.ModelDTO;

@Service
public class MapperModelDTOToModelEntity {
	
	public ModelEntity convertToModelEntity(ModelDTO modelDTO) {
		
		ModelEntity modelEntity=new ModelEntity();
		modelEntity.setFirstName(modelDTO.getVorname());
		modelEntity.setLastName(modelDTO.getNachname());
		modelEntity.setCity(modelDTO.getStadt());
		System.out.println("ModelEntity "+modelEntity);
		return modelEntity;
	}

}

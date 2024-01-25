package de.dauer.rest.businessServices;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.dauer.rest.clientService.ConsumerService;
import de.dauer.rest.clientService.ModelRest;
import de.dauer.rest.controllers.ModelAPI;
import de.dauer.rest.persistance.MapperModelDTOToModelEntity;
import de.dauer.rest.persistance.ModelEntity;
import de.dauer.rest.persistance.PersistanceService;

@Service
public class BusinessService {
	
	private ConsumerService consumerService;
	private PersistanceService persistanceService;
	private ModelMapper modelMapper;
	private MapperModelDTOToModelEntity mapperToEntity;
	
	@Autowired
	public BusinessService(ConsumerService consumerService, PersistanceService persistanceService, ModelMapper modelMapper, MapperModelDTOToModelEntity mapperToEntity) {
		this.consumerService=consumerService;
		this.persistanceService=persistanceService;
		this.modelMapper=modelMapper;
		this.mapperToEntity=mapperToEntity;
	}
	
	
	public void aufrufenConsumerService(ModelDTO modelDTO) {
		
//		ModelDTO modelDTO= new ModelDTO();
//		modelDTO.setVorname(modelAPI.getFirstName());
//		modelDTO.setNachname(modelAPI.getLastName());
//		modelDTO.setStadt(modelAPI.getCity());
//		System.out.println(modelDTO);
		
		
		System.out.println("in aufrufConsumerService"+modelDTO);
//		ModelEntity modelEntity= new ModelEntity();
		ModelEntity modelEntity=mapperToEntity.convertToModelEntity(modelDTO);
		System.out.println("ModelEntity after convertung "+modelEntity);
		persistanceService.savePerson(modelEntity);
		
		
		ModelRest modelRest=modelMapper.map(modelDTO, ModelRest.class);
		consumerService.sendRestToConsumer(modelRest);
		
		         
	
	}
	
	
}

package de.dauer.rest.businessServices;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.dauer.rest.clientService.ConsumerService;
import de.dauer.rest.clientService.MapperModelDTOToModelRest;
import de.dauer.rest.clientService.ModelRest;
import de.dauer.rest.controllers.ModelAPI;
import de.dauer.rest.persistance.MapperModelDTOToModelEntity;
import de.dauer.rest.persistance.ModelEntity;
import de.dauer.rest.persistance.PersistanceService;

@Service
public class BusinessService {
	
	private ConsumerService consumerService;
	private PersistanceService persistanceService;

	private MapperModelDTOToModelEntity mapperToEntity;
	private MapperModelDTOToModelRest mapperToRest;
	
	@Autowired
	public BusinessService(ConsumerService consumerService, PersistanceService persistanceService, MapperModelDTOToModelEntity mapperToEntity, MapperModelDTOToModelRest mapperToRest) {
		this.consumerService=consumerService;
		this.persistanceService=persistanceService;
		this.mapperToEntity=mapperToEntity;
		this.mapperToRest=mapperToRest;
	}
	
	
	public void aufrufenConsumerService(ModelDTO modelDTO) {
		
		System.out.println("in aufrufConsumerService"+modelDTO);
		ModelEntity modelEntity=mapperToEntity.convertToModelEntity(modelDTO);
		System.out.println("ModelEntity after convertung "+modelEntity);
		persistanceService.savePerson(modelEntity);
		
		
		ModelRest modelRest=mapperToRest.convertToModelRest(modelDTO);
		consumerService.sendRestToConsumer(modelRest);
		
		         
	
	}
	
	
}

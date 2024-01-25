package de.dauer.rest.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import de.dauer.rest.businessServices.BusinessService;
import de.dauer.rest.businessServices.ModelDTO;
import de.dauer.rest.controllers.mapping.MapperAPIToDTO;

@RestController
@RequestMapping("/person")
public class ProviderController {
	
	private BusinessService businessService;
	private final ModelMapper modelMapper;
	private MapperAPIToDTO mapper;
	
	@Autowired
	public ProviderController(BusinessService businessService, ModelMapper modelMapper, MapperAPIToDTO mapper) {
		this.businessService=businessService;
		this.modelMapper = modelMapper; 
		this.mapper=mapper;
	}
	

	@PostMapping()
	public ResponseEntity<HttpStatus> createPerson(@RequestBody ModelAPI modelAPI) {
		
		System.out.println(modelAPI);
		//businessService.convertEnglishToGerman(modelAPI);                 
		//ModelDTO modelDTO=modelMapper.map(modelAPI, ModelDTO.class);
		
//		ModelDTO modelDTO=new ModelDTO();
		ModelDTO modelDTO=mapper.convertEnglishToGerman(modelAPI);
		
		System.out.println(modelDTO);
		businessService.aufrufenConsumerService(modelDTO);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping()
	public List<ModelAPI> getAllPeople(){
		
		
		
		return null;
	}
	
	

}

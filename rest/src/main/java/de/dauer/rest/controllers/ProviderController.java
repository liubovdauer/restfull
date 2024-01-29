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
	private MapperAPIToDTO mapper;

	@Autowired
	public ProviderController(BusinessService businessService, MapperAPIToDTO mapper) {
		this.businessService = businessService;

		this.mapper = mapper;
	}

	@PostMapping()
	public ResponseEntity<HttpStatus> createPerson(@RequestBody ModelAPI modelAPI) {

		System.out.println(modelAPI);
		ModelDTO modelDTO = mapper.convertEnglishToGerman(modelAPI);

		System.out.println(modelDTO);
		businessService.aufrufenConsumerService(modelDTO);
		return ResponseEntity.ok(HttpStatus.OK);

	}

}

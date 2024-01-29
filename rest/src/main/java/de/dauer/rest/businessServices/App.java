package de.dauer.rest.businessServices;

import org.springframework.stereotype.Service;

import de.dauer.rest.clientService.ModelRest;

@Service
public class App {
	
	public ModelDTOLombok buy(ModelRest modelRest) {
		return ModelDTOLombok.builder().firstname(modelRest.getVorname()).lastname(modelRest.getNachname()).city(modelRest.getStadt()).build();
	}

}

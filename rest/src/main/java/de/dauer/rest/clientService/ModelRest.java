package de.dauer.rest.clientService;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ModelRest {
	
	private String vorname;
	
	private String nachname;
	
	private String stadt;

}

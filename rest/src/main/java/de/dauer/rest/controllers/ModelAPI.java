package de.dauer.rest.controllers;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class ModelAPI {
	
	
	private String firstName;
	
	
	private String lastName;
	
	
	private String city;
	
	
}

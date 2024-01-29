package de.dauer.rest.businessServices;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
public class ModelDTO {

		private String vorname;
		
		private String nachname;
		
		private String stadt;
		
		
}

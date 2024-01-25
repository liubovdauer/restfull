package de.dauer.rest.persistance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.dauer.rest.businessServices.ModelDTO;
import jakarta.transaction.Transactional;

@Service
public class PersistanceService {
	
	private PersonRepository personRepository;
	
	@Autowired
	public PersistanceService(PersonRepository personRepository) {
		this.personRepository=personRepository;
	}
	

	
	@Transactional
	public void savePerson(ModelEntity modelEntity) {
		personRepository.save(modelEntity);
		
		
	}
	
	//public Optional<ModelEntity> findAll()

}

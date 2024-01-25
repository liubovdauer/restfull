package de.dauer.rest.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<ModelEntity, Integer> {

}

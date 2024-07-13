package edu.utvt.attendance.persistence.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import edu.utvt.attendance.persistence.entities.Career;

public interface CareerService {
	
Career save(Career career);
    
public Career update(Long id, Career career);
    
public List<Career> findAll();
    
public Optional<Career> findById(Long id);
    
public ResponseEntity<Career> deleteById(Long id);
    
public Page<Career> get(Integer page, Integer size);
    
public Page<Career> findAll(Integer page, Integer size);

public List<Career> getAll();

public Page<Career> getCareers(Integer page, Integer size);

	static Optional<Career> getCareerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

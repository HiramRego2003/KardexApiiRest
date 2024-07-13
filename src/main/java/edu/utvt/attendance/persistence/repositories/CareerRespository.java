package edu.utvt.attendance.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.attendance.persistence.entities.Career;

public interface CareerRespository extends JpaRepository<Career, Long> {

}

package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}

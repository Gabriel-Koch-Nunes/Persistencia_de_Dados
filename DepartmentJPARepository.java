package com.exemplo.tarefas.repository;

import org.springframework.data.JPA.repository.JpaRepository;
import com.banco.model.DepartmentJPA;

public interface DepartmentJpaRepository extends JpaRepository<DepartmentJPA, Long> {  
}
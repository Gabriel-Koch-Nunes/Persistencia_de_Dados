package com.exemplo.tarefas.service;

import com.exemplo.tarefas.model.Tarefa;
import com.exemplo.tarefas.repository.TarefaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceJPA {

    @Autowired
    private DepartmentJPARepository departmentJPARepository;

    public List<DepartmentJPA> findAll() {
        return departmentJPARepository.findAll();
    }

    public Optional<DepartmentJPA> findById(Long id) {
        return departmentJPARepository.findById(id);
    }

    public DepartmentJPA save(DepartmentJPA department) {
        return departmentJPARepository.save(department);
    }

    public void deleteById(Long id) {
        departmentJPARepository.deleteById(id);
    }
}
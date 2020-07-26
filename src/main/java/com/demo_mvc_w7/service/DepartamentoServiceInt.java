package com.demo_mvc_w7.service;

import com.demo_mvc_w7.domain.Departamento;
import java.util.List;

public interface DepartamentoServiceInt {

    void saveService(Departamento departamento);

    void updateService(Departamento departamento);

    void deleteService(Long id);

    Departamento findByIdService(Long id);

    List<Departamento> findAllService();

}

package com.demo_mvc_w7.dao;

import java.util.List;
import com.demo_mvc_w7.domain.Departamento;

public interface DepartamentoDaoInt {

    void saveDao(Departamento departamento);

    void updateDao(Departamento departamento);

    void deleteDao(Long id);

    Departamento findByIdDao(Long id);

    List<Departamento> findAllDao();

}

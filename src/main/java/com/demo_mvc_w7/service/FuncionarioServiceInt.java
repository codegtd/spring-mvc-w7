package com.demo_mvc_w7.service;

import com.demo_mvc_w7.domain.FuncionarioDomain;
import java.util.List;

public interface FuncionarioServiceInt {

    void saveService(FuncionarioDomain funcionario);

    void updateService(FuncionarioDomain funcionario);

    void deleteService(Long id);

    FuncionarioDomain findByIdService(Long id);

    List<FuncionarioDomain> findAllService();
}

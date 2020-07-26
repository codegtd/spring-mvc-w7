
package com.demo_mvc_w7.dao;

import com.demo_mvc_w7.domain.FuncionarioDomain;
import java.util.List;

public interface FuncionarioDaoInt {
    void saveDao(FuncionarioDomain funcionario);

    void updateDao(FuncionarioDomain funcionario);

    void deleteDao(Long id);

    FuncionarioDomain findByIdDao(Long id);

    List<FuncionarioDomain> findAllDao();
}
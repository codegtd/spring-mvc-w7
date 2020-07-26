package com.demo_mvc_w7.dao;

import com.demo_mvc_w7.domain.CargoDomain;
import java.util.List;

public interface CargoDaoInt {

    void saveDao(CargoDomain cargo);

    void updateDao(CargoDomain cargo);

    void deleteDao(Long id);

    CargoDomain findByIdDao(Long id);

    List<CargoDomain> findAllDao();
}

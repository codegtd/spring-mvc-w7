package com.demo_mvc_w7.service;

import com.demo_mvc_w7.domain.CargoDomain;
import java.util.List;

public interface CargoServiceInt {

    void saveService(CargoDomain cargo);

    void updateService(CargoDomain cargo);

    void deleteService(Long id);

    CargoDomain findByIdService(Long id);

    List<CargoDomain> findAllService();

}

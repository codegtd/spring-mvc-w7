package com.demo_mvc_w7.service;

import com.demo_mvc_w7.dao.CargoDaoInt;
import com.demo_mvc_w7.domain.CargoDomain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoServiceInt {

    @Autowired
    private CargoDaoInt dao;
    
    @Override
    public void saveService(CargoDomain cargo)
    {
        dao.saveDao(cargo);
    }

    @Override
    public void updateService(CargoDomain cargo)
    {
        dao.updateDao(cargo);
    }

    @Override
    public void deleteService(Long id)
    {
        dao.deleteDao(id);
    }

    @Transactional(readOnly = true)
    @Override
    public CargoDomain findByIdService(Long id)
    {
        return dao.findByIdDao(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<CargoDomain> findAllService()
    {
        return dao.findAllDao();
    }
    

}

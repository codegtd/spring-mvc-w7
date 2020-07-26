package com.demo_mvc_w7.service;

import com.demo_mvc_w7.dao.DepartamentoDaoInt;
import com.demo_mvc_w7.domain.Departamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoServiceInt {

    @Autowired
    private DepartamentoDaoInt dao;

    @Override
    public void saveService(Departamento departamento)
    {
        dao.saveDao(departamento);
    }

    @Override
    public void updateService(Departamento departamento)
    {
        dao.updateDao(departamento);
    }

    @Override
    public void deleteService(Long id)
    {
        dao.deleteDao(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Departamento findByIdService(Long id)
    {
        return dao.findByIdDao(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Departamento> findAllService()
    {
        return dao.findAllDao();
    }

}

package com.demo_mvc_w7.service;

import com.demo_mvc_w7.dao.FuncionarioDaoInt;
import com.demo_mvc_w7.domain.FuncionarioDomain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioServiceInt {

    @Autowired
    FuncionarioDaoInt dao;

    @Override
    public void saveService(FuncionarioDomain funcionario)
    {
        dao.saveDao(funcionario);
    }

    @Override
    public void updateService(FuncionarioDomain funcionario)
    {
        dao.updateDao(funcionario);
    }

    @Override
    public void deleteService(Long id)
    {
        dao.deleteDao(id);
    }

    @Transactional(readOnly = true)
    @Override
    public FuncionarioDomain findByIdService(Long id)
    {
        return dao.findByIdDao(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<FuncionarioDomain> findAllService()
    {
        return dao.findAllDao();
    }

}

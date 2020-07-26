package com.demo_mvc_w7.controller;

import com.demo_mvc_w7.domain.Departamento;
import com.demo_mvc_w7.service.DepartamentoServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
   
    @Autowired
    DepartamentoServiceInt service;
    
    @GetMapping("/cadastrar")
    public String cadastrar(Departamento departamento)
    {
        return "departamento/cadastro";
    }
    
    @GetMapping("/listar")
    public String listar()
    {
        return "departamento/lista";
    }
    
    @PostMapping("/salvar")
    public String salvar(Departamento departamento)
    {
        service.saveService(departamento);
        return "redirect:/departamentos/cadastrar";
    }

}

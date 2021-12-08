package com.Caso1Backend.back.security.service;

import java.util.List;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public <S extends Cliente> S save(S entity) {
        return clienteRepository.save(entity);
    }
    
}

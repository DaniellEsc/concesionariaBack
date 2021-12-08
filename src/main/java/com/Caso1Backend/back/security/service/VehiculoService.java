package com.Caso1Backend.back.security.service;

import java.util.List;

import com.Caso1Backend.back.security.models.Vehiculo;
import com.Caso1Backend.back.security.repository.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {
    
    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> findAll() {
        return vehiculoRepository.findAll();
    }
}

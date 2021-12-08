package com.Caso1Backend.back.security.controller;

import java.util.List;

import com.Caso1Backend.back.security.models.Vehiculo;
import com.Caso1Backend.back.security.service.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculos/")
public class VehiculoController {
    
    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping()
    private ResponseEntity<List<Vehiculo>> getAllVehiculos(){
        return ResponseEntity.ok(vehiculoService.findAll());
    }
}

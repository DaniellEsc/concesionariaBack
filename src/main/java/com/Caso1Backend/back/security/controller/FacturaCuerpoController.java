package com.Caso1Backend.back.security.controller;

import java.net.URI;
import java.util.List;

import com.Caso1Backend.back.security.models.FacturaCuerpo;
import com.Caso1Backend.back.security.service.FacturaCuerpoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/facturacuerpo/")
public class FacturaCuerpoController {
    
    @Autowired
    FacturaCuerpoService facturaCuerpoService;

    @GetMapping()
    private ResponseEntity<List<FacturaCuerpo>> getAllCotizaciones(){
        return ResponseEntity.ok(facturaCuerpoService.findAll());
    }

    @PostMapping()
    private ResponseEntity<FacturaCuerpo> saveCotizacion(@RequestBody FacturaCuerpo facturaCuerpo){
        try {
            FacturaCuerpo facturaCuerpoGuardada = facturaCuerpoService.save(facturaCuerpo);
            return ResponseEntity.created(new URI("/facturacuerpo/"+ facturaCuerpoGuardada.getId_cuerpo())).body(facturaCuerpoGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("guardar/")
    public FacturaCuerpo guardar(@RequestBody FacturaCuerpo facturaCuerpo){
        return facturaCuerpoService.registrar(facturaCuerpo);
    }
}

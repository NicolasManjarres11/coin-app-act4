package com.ibero.nmanja.coin_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibero.nmanja.coin_app.model.Gastos;
import com.ibero.nmanja.coin_app.service.GastosService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/gastos")
@RequiredArgsConstructor

public class GastosController {
    
    private final GastosService gastosService;

    @GetMapping
    public List<Gastos> getGastos() {
        return gastosService.getGastos();
    }

    @PostMapping
    public Gastos saveGasto(@RequestBody Gastos gasto) {
        
        return gastosService.saveGastos(gasto);
    }
    
    
}

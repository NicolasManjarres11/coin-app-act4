package com.ibero.nmanja.coin_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibero.nmanja.coin_app.model.Gastos;
import com.ibero.nmanja.coin_app.service.GastosService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/gastos")
@RequiredArgsConstructor

public class GastosController {
    
    private final GastosService gastosService;

    @GetMapping
    public List<Gastos> getGastos() {
        return gastosService.getGastos();
    }
    
}

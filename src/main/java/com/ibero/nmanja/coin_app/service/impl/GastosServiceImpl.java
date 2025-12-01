package com.ibero.nmanja.coin_app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibero.nmanja.coin_app.model.Gastos;
import com.ibero.nmanja.coin_app.repository.GastosRepository;
import com.ibero.nmanja.coin_app.service.GastosService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class GastosServiceImpl implements GastosService{

    private final GastosRepository gastosRepository;

    @Override
    public List<Gastos> getGastos() {
        return gastosRepository.findAll();
    }

    @Override
    public Gastos saveGastos(Gastos gasto) {
        return gastosRepository.save(gasto);
    }

    
    
}

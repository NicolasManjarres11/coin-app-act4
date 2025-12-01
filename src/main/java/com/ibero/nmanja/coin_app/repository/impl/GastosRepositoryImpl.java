package com.ibero.nmanja.coin_app.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibero.nmanja.coin_app.model.Gastos;
import com.ibero.nmanja.coin_app.repository.GastosRepository;

@Repository
public class GastosRepositoryImpl implements GastosRepository{

    private List<Gastos> gastos = new ArrayList<>();
    private Long id = 1L;

    @Override
    public List<Gastos> findAll() {
        
        return gastos;
    }

    @Override
    public Gastos save(Gastos gasto) {
        gasto.setId(id++);
        gastos.add(gasto);
        
        return gasto;
    }

    
}

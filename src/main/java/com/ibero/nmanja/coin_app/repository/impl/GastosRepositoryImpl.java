package com.ibero.nmanja.coin_app.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibero.nmanja.coin_app.model.Gastos;
import com.ibero.nmanja.coin_app.repository.GastosRepository;

@Repository
public class GastosRepositoryImpl implements GastosRepository{

    private List<Gastos> gastos;

    @Override
    public List<Gastos> findAll() {
        
        return gastos;
    }

    
}

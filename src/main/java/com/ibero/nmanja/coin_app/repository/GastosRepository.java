package com.ibero.nmanja.coin_app.repository;

import java.util.List;

import com.ibero.nmanja.coin_app.model.Gastos;

public interface GastosRepository {

    List<Gastos> findAll();
    Gastos save(Gastos gastos);
    Gastos update(Long id, Gastos gasto);
    
}

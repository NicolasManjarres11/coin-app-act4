package com.ibero.nmanja.coin_app.service;

import java.util.List;

import com.ibero.nmanja.coin_app.model.Gastos;

public interface GastosService {

    List<Gastos> getGastos();
    Gastos saveGastos(Gastos gasto);
    Gasttos update(Long id, Gastos gasto);
    
}

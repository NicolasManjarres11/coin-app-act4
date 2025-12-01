package com.ibero.nmanja.coin_app.service;

import java.util.List;

import com.ibero.nmanja.coin_app.model.Gastos;

public interface GastosService {

    List<Gastos> getGastos();
    Gastos saveGastos(Gastos gasto);
    Gastos update(Long id, Gastos gasto);
    void delete(Long id);
    List<Gastos> getByDateRange(LocalDate fromDate, LocalDate toDate);
    
}

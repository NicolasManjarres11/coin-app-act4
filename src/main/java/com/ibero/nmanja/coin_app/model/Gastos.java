package com.ibero.nmanja.coin_app.model;

import java.time.LocalDate;

import lombok.Data;


@Data
public class Gastos {

    private Long id;
    private String cuenta;
    private Double monto;
    private LocalDate fecha;
    
}

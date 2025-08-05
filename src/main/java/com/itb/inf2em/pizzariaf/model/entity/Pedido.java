package com.itb.inf2em.pizzariaf.model.entity;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private double valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private String status;

    public boolean isCodStatus() {
        return codStatus;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public Long getId() {
        return id;
    }

    private boolean codStatus;

}

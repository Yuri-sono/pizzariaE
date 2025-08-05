package com.itb.inf2em.pizzariaf.model.entity;

public class ItemPedido {
    private Long id;
    private int quantidadeItem;
    private double valorUnitario;
    private boolean codStatus;

    public boolean isCodStatus() {
        return codStatus;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public Long getId() {
        return id;
    }
}

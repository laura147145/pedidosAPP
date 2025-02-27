package com.example.pedidosAPP.modelos;

public class Entrega {
    private Integer idPedidos;
    private Integer idEntrega;
    private Integer idRepartidor;
    private String fechaEntrega;
    private Integer estadoEntrega;

    public Entrega() {
    }

    public Entrega(Integer idPedidos, Integer idEntrega, Integer idRepartidor, String fechaEntrega, Integer estadoEntrega) {
        this.idPedidos = idPedidos;
        this.idEntrega = idEntrega;
        this.idRepartidor = idRepartidor;
        this.fechaEntrega = fechaEntrega;
        this.estadoEntrega = estadoEntrega;
    }

    public Integer getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(Integer idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Integer idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Integer getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(Integer idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(Integer estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }
}

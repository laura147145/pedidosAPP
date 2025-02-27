package com.example.pedidosAPP.modelos;

public class Pedido {
    private Integer idPedido;
    private Integer idUsuario;
    private Integer idtienda;
     private  String fechaPedido;
     private String estado;
     private String total;

    public Pedido() {
    }

    public Pedido(Integer idPedido, Integer idUsuario, Integer idtienda, String fechaPedido, String estado, String total) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.idtienda = idtienda;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.total = total;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(Integer idtienda) {
        this.idtienda = idtienda;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}

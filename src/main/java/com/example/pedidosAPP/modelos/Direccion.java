package com.example.pedidosAPP.modelos;

public class Direccion {
    private Integer idDireccion;
    private Integer idUsuario;
    private  String calle;
    private  String codigoPostal;
    private String ciudad;
    private String pais;

    public Direccion() {
    }

    public Direccion(Integer idDireccion, Integer idUsuario, String calle, String codigoPostal, String ciudad, String pais) {
        this.idDireccion = idDireccion;
        this.idUsuario = idUsuario;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

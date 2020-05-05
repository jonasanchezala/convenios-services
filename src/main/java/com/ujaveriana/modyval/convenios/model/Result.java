package com.ujaveriana.modyval.convenios.model;

public class Result {

    private int idFactura;
    private String mensaje;

    public Result() {
    }

    public Result(int id, String message) {
        this.idFactura = id;
        this.mensaje = message;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

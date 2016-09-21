package com.example.gerardo.apidatos.modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Gerardo on 21/09/2016.
 */
public class Imei {

    @SerializedName("bloqueado_por")
    public String bloqueadoPor;
    @SerializedName("estado")
    public String estado;
    @SerializedName("fecha_consulta")
    public String fechaConsulta;
    @SerializedName("fecha_denuncia")
    public String fechaDenuncia;
    @SerializedName("imei")
    public String imei;
    @SerializedName("marca")
    public String marca;
    @SerializedName("modelo")
    public String modelo;
    @SerializedName("motivo")
    public String motivo;

    public Imei() {
    }

    public String getBloqueadoPor() {
        return bloqueadoPor;
    }

    public void setBloqueadoPor(String bloqueadoPor) {
        this.bloqueadoPor = bloqueadoPor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getFechaDenuncia() {
        return fechaDenuncia;
    }

    public void setFechaDenuncia(String fechaDenuncia) {
        this.fechaDenuncia = fechaDenuncia;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}

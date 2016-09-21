package com.example.gerardo.apidatos.modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Gerardo on 21/09/2016.
 */
public class Patente {
    @SerializedName("chasis")
    public String chasis;
    @SerializedName("color")
    public String color;
    @SerializedName("comuna")
    public String comuna;
    @SerializedName("direccion")
    public String direccion;
    @SerializedName("dv")
    public String dv;
    @SerializedName("encargo_robo")
    public String encargoRobo;
    @SerializedName("marca")
    public String marca;
    @SerializedName("modelo")
    public String modelo;
    @SerializedName("motor")
    public String motor;
    @SerializedName("multas_anotadas")
    public String multasAnotadas;
    @SerializedName("propietario")
    public String propietario;
    @SerializedName("region")
    public String region;
    @SerializedName("rut")
    public String rut;
    @SerializedName("tag")
    public String tag;
    @SerializedName("tipo")
    public String tipo;
    @SerializedName("total_multas")
    public Integer totalMultas;
    @SerializedName("year")
    public String year;

    public Patente() {
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getEncargoRobo() {
        return encargoRobo;
    }

    public void setEncargoRobo(String encargoRobo) {
        this.encargoRobo = encargoRobo;
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

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMultasAnotadas() {
        return multasAnotadas;
    }

    public void setMultasAnotadas(String multasAnotadas) {
        this.multasAnotadas = multasAnotadas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTotalMultas() {
        return totalMultas;
    }

    public void setTotalMultas(Integer totalMultas) {
        this.totalMultas = totalMultas;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

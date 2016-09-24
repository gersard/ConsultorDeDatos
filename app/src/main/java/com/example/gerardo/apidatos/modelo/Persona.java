package com.example.gerardo.apidatos.modelo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Gerardo on 21/09/2016.
 */
public class Persona {

    @SerializedName("edad")
    public String edad;

    @SerializedName("circunscripcion")
    public String circunscripcion;

    @SerializedName("provincia")
    public String provincia;

    @SerializedName("comuna")
    public String comuna;

    @SerializedName("region")
    public String region;

    @SerializedName("direccion")
    public String direccion;

    @SerializedName("pais")
    public String pais;

    @SerializedName("nombre")
    public String nombre;

    @SerializedName("sexo")
    public String sexo;

    @SerializedName("cedula")
    public String cedula;

    @SerializedName("fechanacimiento")
    public String fechanacimiento;

    public Persona() {
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCircunscripcion() {
        return circunscripcion;
    }

    public void setCircunscripcion(String circunscripcion) {
        this.circunscripcion = circunscripcion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

}

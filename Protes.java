/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author PC
 */
public class Protes {
    private String marca;
    private String precio;
        private double proteinaporservicio;
        private String fuente;
    private String contenido;
    
    public Protes(){
        
    }

    public Protes(String marca, String precio, double proteinaporservicio, String fuente, String contenido) {
        this.marca = marca;
        this.precio = precio;
        this.proteinaporservicio = proteinaporservicio;
        this.fuente = fuente;
        this.contenido = contenido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public double getProteinaporservicio() {
        return proteinaporservicio;
    }

    public void setProteinaporservicio(double proteinaporservicio) {
        this.proteinaporservicio = proteinaporservicio;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Protes{" + "marca=" + marca + ", precio=" + precio + ", proteinaporservicio=" + proteinaporservicio + ", fuente=" + fuente + ", contenido=" + contenido + '}';
    }

   }
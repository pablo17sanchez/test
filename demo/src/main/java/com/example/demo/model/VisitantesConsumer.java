package com.example.demo.model;


public class VisitantesConsumer {
    private Integer id;

    private String nombre;

    private String sexo;

    private String ciudad;

    public VisitantesConsumer(Integer id, String nombre, String sexo, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.ciudad = ciudad;
    }

    public VisitantesConsumer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }



}

package org.cliente.gestionvehiculos.conductor;

import javax.persistence.*;

@Entity
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String primerApellido;

    @Column(nullable = false)
    private String segundoApellido;

    @Column(nullable = false)
    private String carnet;

    @Column(nullable = false)
    private Integer anyosCarnet;


    public Conductor() {
    }

    public Conductor(Integer id, String nombre, String primerApellido, String segundoApellido, String carnet, Integer anyosCarnet) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.carnet = carnet;
        this.anyosCarnet = anyosCarnet;
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

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Integer getAnyosCarnet() {
        return anyosCarnet;
    }

    public void setAnyosCarnet(Integer anyosCarnet) {
        this.anyosCarnet = anyosCarnet;
    }
}

package org.cliente.gestionvehiculos;

import javax.persistence.*;
import java.util.List;

@Entity
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCoche;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String matricula;
    @Column(nullable = false)
    private float kilometraje;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String tipoVehiculo;
    @OneToMany(mappedBy = "coche")
    private List<Servicio> servicioList;



    public int getIdCoche() {
        return idCoche;
    }

    public void setIdCoche(int idCoche) {
        this.idCoche = idCoche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public List<Servicio> getServicioList() {
        return servicioList;
    }

    public void setServicioList(List<Servicio> serviciosList) {
        this.servicioList = servicioList;
    }
}

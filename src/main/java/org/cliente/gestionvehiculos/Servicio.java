package org.cliente.gestionvehiculos;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;

    @Column
    private Date fechaInicio;

    @Column
    private Date fechaFin;

    @Column
    private float kilometraje;

    @Column
    private float costeServicio;

    @Column
    private boolean finalizado;

    @ManyToOne
    @JoinColumn(name = "idConductor")
    private Conductor conductor;

    @ManyToOne
    @JoinColumn(name = "idCoche")
    private Coche coche;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public float getCosteServicio() {
        return costeServicio;
    }

    public void setCosteServicio(float costeServicio) {
        this.costeServicio = costeServicio;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}

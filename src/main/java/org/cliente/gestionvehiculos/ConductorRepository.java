package org.cliente.gestionvehiculos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ConductorRepository extends JpaRepository<Conductor, Integer> {

    // Método para registrar un nuevo conductor
    void saveConductor(Conductor conductor);

    // Método para modificar los datos de un conductor
    @Modifying
    @Transactional
    @Query("UPDATE Conductor c SET c.nombre = :nombre, c.primerApellido = :primerApellido, c.segundoApellido = :segundoApellido, c.carnet = :carnet, c.anyosCarnet = :anyosCarnet WHERE c.id = :id")
    void updateConductor(Integer id, String nombre, String primerApellido, String segundoApellido, String carnet, Integer anyosCarnet);

    // Método para consultar la lista de conductores disponibles
    @Query("SELECT c FROM Conductor c")
    List<Conductor> findAllDrivers();
}

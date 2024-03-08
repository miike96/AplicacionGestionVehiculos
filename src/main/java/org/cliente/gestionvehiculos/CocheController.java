package org.cliente.gestionvehiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class CocheController {
    @Autowired
    private CocheRepository cocheRepository;

    @GetMapping("/coche/")
    public List<Coche> allCoches() {
        return cocheRepository.findAll();
    }

    @PutMapping("/coche/{id}")
    public ResponseEntity<Coche> updateCoche(@PathVariable int id, @RequestBody Coche updatedCoche) {
        // Comprobar si el coche existe
        Optional<Coche> existingCocheOptional = cocheRepository.findById(id);

        if (existingCocheOptional.isPresent()) {
            Coche existingCoche = existingCocheOptional.get();

            // Update los campos que el usuario necesite
            existingCoche.setMarca(updatedCoche.getMarca());
            existingCoche.setMatricula(updatedCoche.getMatricula());
            existingCoche.setKilometraje(updatedCoche.getKilometraje());
            existingCoche.setModelo(updatedCoche.getModelo());
            existingCoche.setTipoVehiculo(updatedCoche.getTipoVehiculo());

            // Guardar los cambios del coche
            Coche updatedCocheEntity = cocheRepository.save(existingCoche);

            return new ResponseEntity<>(updatedCocheEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

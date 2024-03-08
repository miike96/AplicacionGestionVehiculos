package org.cliente.gestionvehiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class CocheController {
    @Autowired
    private CocheRepository cocheRepository;

    @GetMapping("/coche/")
    public List<Coche> allCoches(){return cocheRepository.findAll();}


}

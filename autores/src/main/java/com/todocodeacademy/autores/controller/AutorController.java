package com.todocodeacademy.autores.controller;

import com.todocodeacademy.autores.model.Autor;
import com.todocodeacademy.autores.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private IAutorService autorService;

    @PostMapping("/crear")
    public String crearLibro(@RequestBody Autor autor){
        autorService.saveAutor(autor);
        return "Autor creado correctamente";
    }

    @GetMapping("/traer/{isbn}")
    public List<Autor> getAutores(@PathVariable String isbn){
       return autorService.getAutoresByLibro(isbn);

    }
}

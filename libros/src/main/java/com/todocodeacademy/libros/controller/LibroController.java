package com.todocodeacademy.libros.controller;


import com.todocodeacademy.libros.dto.LibroDTO;
import com.todocodeacademy.libros.model.Libro;
import com.todocodeacademy.libros.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private ILibroService libroService;

    @PostMapping("/crear")
    public String crearLibro(@RequestBody LibroDTO libroDTO){
        libroService.saveLibro(libroDTO.getIsbn(),libroDTO.getTitulo(),libroDTO.getAnioPublicacion(),libroDTO.getDescripcion());
        return "Libro creado correctamente";
    }
}

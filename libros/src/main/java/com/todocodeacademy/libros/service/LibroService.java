package com.todocodeacademy.libros.service;

import com.todocodeacademy.libros.dto.AutorDTO;
import com.todocodeacademy.libros.model.Libro;
import com.todocodeacademy.libros.repository.IAutoresAPIClient;
import com.todocodeacademy.libros.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService implements ILibroService{
    @Autowired
    ILibroRepository libroRepository
            ;
    @Autowired
    IAutoresAPIClient autoresAPICliente;

    @Override
    public void saveLibro(Long isbn, String titulo, String anioPublicacion, String descripcion) {
        Libro libro = new Libro();
        List<String> autoresAnio = new ArrayList<String>();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnioPublicacion(anioPublicacion);
        libro.setDescripcion(descripcion);
        List<AutorDTO> listaAutoresAnio = autoresAPICliente.getAutores(isbn);
        for (AutorDTO autorDTO : listaAutoresAnio) {
            autoresAnio.add(autorDTO.getNombreCompleto() + " " + autorDTO.getNacionalidad());
        }
        libro.setAutores(autoresAnio);
        libroRepository.save(libro);

    }
}

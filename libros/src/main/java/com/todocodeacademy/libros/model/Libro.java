package com.todocodeacademy.libros.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_libro;
    private Long isbn;
    private String titulo;
    private String anioPublicacion;
    private String descripcion;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> autores;
}

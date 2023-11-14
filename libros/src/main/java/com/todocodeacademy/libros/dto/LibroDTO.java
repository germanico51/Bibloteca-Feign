package com.todocodeacademy.libros.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LibroDTO {
    private Long isbn;
    private String titulo;
    private String anioPublicacion;
    private String descripcion;
}

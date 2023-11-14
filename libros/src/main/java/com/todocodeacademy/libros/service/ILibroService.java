package com.todocodeacademy.libros.service;

public interface ILibroService {

    void saveLibro(Long isbn, String titulo, String anioPublicacion, String descripcion);
}

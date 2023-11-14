package com.todocodeacademy.autores.service;

import com.todocodeacademy.autores.model.Autor;

import java.util.List;

public interface IAutorService {
    void saveAutor(Autor autor);

    public List<Autor> getAutoresByLibro(String isbn);
}

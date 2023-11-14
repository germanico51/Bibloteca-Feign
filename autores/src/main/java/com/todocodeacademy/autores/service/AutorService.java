package com.todocodeacademy.autores.service;

import com.todocodeacademy.autores.model.Autor;
import com.todocodeacademy.autores.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements IAutorService{

    @Autowired
    IAutorRepository autorRepository;
    @Override
    public void saveAutor(Autor autor) {
        autorRepository.save(autor);
    }

    @Override
    public List<Autor> getAutoresByLibro(String isbn) {
        return autorRepository.findByLibro(isbn);
    }

}

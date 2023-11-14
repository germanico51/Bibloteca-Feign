package com.todocodeacademy.libros.repository;

import com.todocodeacademy.libros.dto.AutorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "autoresapi",url="http://localhost:9006/autores")
public interface IAutoresAPIClient {

    @GetMapping("/traer/{isbn}")
    public List<AutorDTO> getAutores(@PathVariable("isbn") Long isbn);
}

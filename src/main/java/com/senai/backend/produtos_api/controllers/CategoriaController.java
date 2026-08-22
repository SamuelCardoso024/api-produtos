package com.senai.backend.produtos_api.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.produtos_api.models.Categoria;
import com.senai.backend.produtos_api.repositories.CategoriaRepository;

@RestController
@RequestMapping
public class CategoriaController {
    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository)  {
        this.categoriaRepository = categoriaRepository;
    }   

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    };

    @GetMapping
    public Categoria listarTodos() {
        return categoriaRepository.findAll();
    };
}

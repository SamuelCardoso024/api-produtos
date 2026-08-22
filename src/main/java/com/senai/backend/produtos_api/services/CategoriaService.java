package com.senai.backend.produtos_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.backend.produtos_api.models.Categoria;
import com.senai.backend.produtos_api.repositories.CategoriaRepository;

@Service
public class CategoriaService {

     private final CategoriaRepository categoriaRepository;

     public CategoriaService(CategoriaRepository categoriaRepository)  {
        this.categoriaRepository = categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarTodos() {
        
    };

    
}

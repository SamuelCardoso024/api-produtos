package com.senai.backend.produtos_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.backend.produtos_api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
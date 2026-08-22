package com.senai.backend.produtos_api.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.senai.backend.produtos_api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("""
            SELECT 
            FROM Produto p 
            WHERE p.categoria.id = :categoriaId
            """)
    List<Produto> buscarPorCategoria(@Param("categoriaId") Long categoriaId);


    @Query("""
            SELECT 
            FROM Produto p 
            WHERE p.preco BETWEEN :min AND :max
            """)
    List<Produto> buscarPorFaixaDePreco(@Param("min") BigDecimal min, @Param("max") BigDecimal max);
}

package com.senai.backend.produtos_api.exceptions;

public class ProdutoNotFoundException extends RuntimeException {

    public ProdutoNotFoundException(Long id){
        super("Produto não encontrado com id: " + id);
    }
    
}

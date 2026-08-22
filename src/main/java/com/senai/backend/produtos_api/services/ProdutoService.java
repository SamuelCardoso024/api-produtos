package com.senai.backend.produtos_api.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.backend.produtos_api.models.Produto;
import com.senai.backend.produtos_api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Retorna todos os produtos cadastrados no banco
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Retorna um produto pelo id
    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não encontrado com id: " + id));
    }

    //Cria um novo produto
    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }

    //Atualiza um produto existente
    public Produto atualizar(Long id, Produto produtoAtualizando){
        Produto produto = buscarPorId(id);

        produto.setNome(produtoAtualizando.getNome());
        produto.setDescricao(produtoAtualizando.getDescricao());
        produto.setPreco(produtoAtualizando.getPreco());
        produto.setCategoria(produtoAtualizando.getCategoria());
        return produtoRepository.save(produto);
    }

    //Remove um produto pelo id
    public void deletar(Long id){
        produtoRepository.deleteById(id);
        
    }

    public List<Produto> buscarPorCategoria(Long categoriaId) {
        return produtoRepository.buscarPorCategoria(categoriaId);
    }

    public List<Produto> buscarPorFaixaDePreco(BigDecimal min, BigDecimal max) {
        return produtoRepository.buscarPorFaixaDePreco(min, max);
    };
}
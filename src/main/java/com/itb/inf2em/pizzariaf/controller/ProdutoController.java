package com.itb.inf2em.pizzariaf.controller;


import com.itb.inf2em.pizzariaf.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<Produto>();


@GetMapping
    public List<Produto> findAllProdutos(){


        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabresa");
        p1.setDescricao("Calabresa com muita cebola");
        p1.setValorVenda(59.90);

        Produto p2 = new Produto();
        p2.setNome("Pizza de Frango com Catupiry");
        p2.setDescricao("Frango desfiado com catupiry");
        p2.setValorVenda(62.90);

        produtos.add(p1);
        produtos.add(p2);

        return produtos;
    }







}

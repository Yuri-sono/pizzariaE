package com.itb.inf2em.pizzariaf.controller;

import com.itb.inf2em.pizzariaf.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    private List<Categoria> categorias = new ArrayList<>();

    @GetMapping
    public List<Categoria> findAll() {
        Categoria c1 = new Categoria();
        c1.setNome("Pizza");
        c1.setDescricao("Todas as pizzas");

        Categoria c2 = new Categoria();
        c2.setNome("Bebida");
        c2.setDescricao("Refrigerantes e sucos");

        categorias.add(c1);
        categorias.add(c2);

        return categorias;
    }
}

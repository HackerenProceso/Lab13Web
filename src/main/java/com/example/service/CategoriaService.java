package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Categoria;
import com.example.repository.ICategoria;

@Service
public class CategoriaService {

    @Autowired
    private ICategoria categoriaRepo;

    public Categoria save(Categoria categoria) {
        return categoriaRepo.save(categoria);
    }

    public List<Categoria> findAll() {
        return categoriaRepo.findAll();
    }

    public Categoria findById(Long id) {
        return categoriaRepo.findById(id).orElse(null);
    }
}

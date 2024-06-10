package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Producto;
import com.example.repository.IProducto;

@Service
public class ProductoService {

    @Autowired
    private IProducto productoRepo;

    public Producto save(Producto producto) {
        return productoRepo.save(producto);
    }

    public List<Producto> findAll() {
        return productoRepo.findAll();
    }

    public List<Producto> findByCategoriaId(Long categoriaId) {
        return productoRepo.findByCategoriaId(categoriaId);
    }
}

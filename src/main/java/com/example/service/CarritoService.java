package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Carrito;
import com.example.repository.ICarrito;

@Service
public class CarritoService {

    @Autowired
    private ICarrito carritoRepo;

    public Carrito save(Carrito carrito) {
        return carritoRepo.save(carrito);
    }

    public List<Carrito> findAll() {
        return carritoRepo.findAll();
    }

    public Carrito findById(Long id) {
        return carritoRepo.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        carritoRepo.deleteById(id);
    }
}

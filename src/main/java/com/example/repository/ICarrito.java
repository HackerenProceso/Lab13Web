package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Carrito;

public interface ICarrito extends JpaRepository<Carrito, Long> {
}

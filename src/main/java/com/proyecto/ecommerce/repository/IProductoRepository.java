package com.proyecto.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.ecommerce.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}

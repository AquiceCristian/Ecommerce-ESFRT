package com.proyecto.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.ecommerce.model.Producto;
import com.proyecto.ecommerce.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private IProductoRepository repo;

	@Override
	public Producto save(Producto producto) {
		return repo.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		return repo.findById(id);
	}

	@Override
	public void update(Producto producto) {
		repo.save(producto);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Producto> findAll() {
		return repo.findAll();
	}

}

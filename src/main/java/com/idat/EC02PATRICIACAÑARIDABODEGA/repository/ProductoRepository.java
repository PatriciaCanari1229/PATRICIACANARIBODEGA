package com.idat.EC02PATRICIACAÑARIBODEGA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC02PATRICIACAÑARIBODEGA.model.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos,Integer>{
	


}

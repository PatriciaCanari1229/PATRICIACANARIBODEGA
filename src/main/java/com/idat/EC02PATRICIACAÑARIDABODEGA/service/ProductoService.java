package com.idat.EC02PATRICIACAÑARIBODEGA.service;

import java.util.List;

import com.idat.EC02PATRICIACAÑARIBODEGA.dto.ProductoDTORequest;
import com.idat.EC02PATRICIACAÑARIBODEGA.dto.ProductoDTOResponse;

public interface ProductoService {
	
	
	void guardarProducto(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);

}

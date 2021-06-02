package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Videoclub {

	private String nOMBRE_VIDEOCLUB;
	private List<Productos> productos = new ArrayList<>();
	
	public Videoclub(String nOMBRE_VIDEOCLUB) {
	this.nOMBRE_VIDEOCLUB = nOMBRE_VIDEOCLUB;
	}

	public void agregarProducto(Productos nuevoProducto) {
		this.productos.add(nuevoProducto);
	}

	public Productos buscarProducto(Productos nuevoProducto) {
		for (Productos productosEncontrado : productos) {
			if(productosEncontrado.equals(nuevoProducto))
			{
				return productosEncontrado;
			}
		}
		return null;
	}

	
	
	
	
}

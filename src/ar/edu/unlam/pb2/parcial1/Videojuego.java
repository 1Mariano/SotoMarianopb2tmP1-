package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Productos implements Alquilable {

	private TipoDeConsola tipo;
	
	private Double pRECIO_ALQUILER;
	
	public Videojuego(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, TipoDeConsola tipo) {
		super(cODIGO_ESPERADO, dESCRIPCION_ESPERADA);
		this.tipo = tipo;
		this.pRECIO_ALQUILER = 0.0;
	}


	public TipoDeConsola getTipo() {
		return this.tipo;
	}


	@Override
	public void setPrecioAlquiler(Double pRECIO_ALQUILER) {
		this.pRECIO_ALQUILER = pRECIO_ALQUILER;
		
	}


	@Override
	public Double getPrecioAlquiler() {
		return this.pRECIO_ALQUILER;
	}
	
	
}

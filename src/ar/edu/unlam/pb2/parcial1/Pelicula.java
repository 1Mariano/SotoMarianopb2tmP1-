package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Productos implements Vendible {
	
	

	private List<Pelicula> pelicula = new ArrayList<>();
	private Genero gENERO_ESPERADO;
	private Integer aNO_DE_ESTRENO_ESPERADO;
	private String dIRECTOR_ESPERADO;
	
	private Double pRECIO_VENTA;
	
	public Pelicula(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, Genero gENERO_ESPERADO,
			Integer aNO_DE_ESTRENO_ESPERADO, String dIRECTOR_ESPERADO) {
		super(cODIGO_ESPERADO, dESCRIPCION_ESPERADA);
		this.gENERO_ESPERADO = gENERO_ESPERADO;
		this.aNO_DE_ESTRENO_ESPERADO = aNO_DE_ESTRENO_ESPERADO;
		this.dIRECTOR_ESPERADO = dIRECTOR_ESPERADO;
		this.pRECIO_VENTA = 0.0;
		
	}

	

	public void agregarActor(String aCTOR_1_ESPERADO) {
		Actor a1 = new Actor(aCTOR_1_ESPERADO);
		a1.agregarActores(a1);
	}

	

	public Genero getGenero() {
		return this.gENERO_ESPERADO;
	}

	public Integer getAnoDeEstreno() {
		return this.aNO_DE_ESTRENO_ESPERADO;
	}

	public String getDirector() {
		return this.dIRECTOR_ESPERADO;
	}



	public Boolean actua(String aCTOR_1_ESPERADO) {
		Actor actua = new Actor(aCTOR_1_ESPERADO);
		return actua.buscarActores(aCTOR_1_ESPERADO);
	}



	@Override
	public void setPrecioVenta(Double pRECIO_VENTA) {
		this.pRECIO_VENTA = pRECIO_VENTA;
		
	}



	@Override
	public Double getPrecioVenta() {
		return this.pRECIO_VENTA;
	}

	
	
	
	

	
}

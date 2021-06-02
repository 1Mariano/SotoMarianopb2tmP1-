package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Libro extends Productos {

	private String AUTOR_ESPERADO;
	private String EDITORIAL_ESPERADA;
	

	public Libro(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA,String AUTOR_ESPERADO,String EDITORIAL_ESPERADA) {
		super(cODIGO_ESPERADO, dESCRIPCION_ESPERADA);
		this.AUTOR_ESPERADO = AUTOR_ESPERADO;
		this.EDITORIAL_ESPERADA = EDITORIAL_ESPERADA;
		
	}
	

	public String getAutor() {
		return this.AUTOR_ESPERADO;
	}

	public String getEditorial() {
		return this.EDITORIAL_ESPERADA;
	}

	
	

}

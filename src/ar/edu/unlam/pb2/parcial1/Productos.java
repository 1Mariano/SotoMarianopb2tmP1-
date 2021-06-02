package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Productos {


	private Integer cODIGO_ESPERADO;
	private String dESCRIPCION_ESPERADA;
	
	public Productos(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA) {
		this.cODIGO_ESPERADO = cODIGO_ESPERADO;
		this.dESCRIPCION_ESPERADA = dESCRIPCION_ESPERADA;
	}
	
	

	public Integer getCodigo() {
		return this.cODIGO_ESPERADO;
	}

	public String getDescripcion() {
		return this.dESCRIPCION_ESPERADA;
	}

	
	
	
	
	
}

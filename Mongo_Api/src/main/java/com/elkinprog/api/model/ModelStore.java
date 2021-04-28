package com.elkinprog.api.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection= "Apitienda")
public class ModelStore {
	
	
	@Id
	private String _Id;
	private String producto;
	private int documento;
	private String direccion;
	
	
	
	public ModelStore(String Id, String producto, int documento, String direccion) {
		super();
		this._Id= Id;
		this.producto = producto;
		this.documento = documento;
		this.direccion = direccion;
	}

	
	public String getId() {
		return _Id;
	}

	public void setId(String id) {
		_Id = id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ModelStore() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

}

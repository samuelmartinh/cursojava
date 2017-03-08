package com.javarevolutions.curso1.cmps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.javarevolutions.curso1.vo.VOCliente;

public class ImplCliente implements IfaceCliente {

	public void guardar(VOCliente obj) {
		System.out.println("Id a guardar : " + obj.getId());
		
	}

	public void borrar(VOCliente obj) {
		System.out.println("Id a borrar : " + obj.getId());
	}

	public void actualizar(VOCliente obj) {
		System.out.println("Id a actualizar : " + obj.getId());
	}

	public VOCliente consultar(VOCliente obj) {
		VOCliente nuevo = new VOCliente();
		
		nuevo.setId(obj.getId());
		obj.setNombre("Samuel");
		obj.setApp("Martin");
		obj.setEdad(30);
		
		return nuevo;
	}

	public List<VOCliente> obtnerLista() {
		//Frameworks colecctions
		Collection col = new ArrayList<VOCliente>();
		List<VOCliente> lista = new ArrayList<VOCliente>();
		Map<String,VOCliente> mapa = new HashMap<String,VOCliente>();
		Set<String> set = new HashSet<String>();
		
		for(int i = 0; i < 5; i++){
			VOCliente nuevo = new VOCliente();
			
			nuevo.setId(i+1);
			nuevo.setNombre("Samuel " +  nuevo.getId());
			nuevo.setApp("Martin " +  nuevo.getId());
			nuevo.setEdad(30 + nuevo.getId());
			
			lista.add(nuevo);
		}
		
		return lista;
	}
}

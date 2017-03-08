package com.javarevolutions.curso1.cmps;

import com.javarevolutions.curso1.vo.VOCliente;
import java.util.List;

public interface IfaceCliente {
	void guardar(VOCliente obj);
	void borrar(VOCliente obj);
	void actualizar(VOCliente obj);
	VOCliente consultar(VOCliente obj);
	List<VOCliente> obtnerLista();
}

package com.dania.pm;

import java.util.List;

public class PruebaCliente {


	public static void main(String[] args) {
		RegistroApiClient cliente = new RegistroApiClient();
		
		Registro nuevoRegistro = new Registro();
		nuevoRegistro.setNombre("Dania Cliente");
		cliente.Insertar(nuevoRegistro);
//		
		
//		List<Registro> respuesta = cliente.consulta();
//		for(Registro a: respuesta) {
//			System.out.println(a.getNombre());
//		}
		
//		nuevoRegistro.setNombre("Diego Cliente");
//		cliente.actualizar(nuevoRegistro, 1001);
		
//		cliente.eliminar(1001);
		
//		List<Registro> respuestaNombre = cliente.buscar("Diego Cliente");
//		for(Registro a: respuestaNombre) {
//			System.out.println(a.getNombre());
//		}
		
//		Registro respuestaId = cliente.buscarId(1001);
//		System.out.println(respuestaId.getNombre());
	}
}

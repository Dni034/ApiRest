package com.dania.pm;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

public class RegistroApiClient {
	private final RestClient restClient; 
	
	public RegistroApiClient(){
		this.restClient = RestClient.create("http://localhost:25666");
	}
	
	public Registro Insertar(Registro registro){
		return restClient.post()
				.uri("/insertar")
				.contentType(MediaType.APPLICATION_JSON)
				.body(registro).retrieve().body(Registro.class);
	}
	
	public List<Registro> consulta(){
		return restClient.get()
				.retrieve().body(new ParameterizedTypeReference<List<Registro>>() {});
	}
	
	public Registro actualizar(Registro registro, int id){
		return restClient.put()
				.uri("/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.body(registro).retrieve().body(Registro.class);
	}
	
	public void eliminar(int id) {
		restClient.delete().uri("/{id}", id).retrieve().toBodilessEntity();
	}
	
	public List<Registro> buscar(String nombre){
		return restClient.get().uri(uriBuilder -> uriBuilder.path("/buscar")
				.queryParam("nombre", nombre).build()).retrieve()
				.body(new ParameterizedTypeReference<List<Registro>>() {});
	}
	
	public Registro buscarId(int id){
		return restClient.get().uri("/{id}", id).retrieve().body(Registro.class);
	}

}

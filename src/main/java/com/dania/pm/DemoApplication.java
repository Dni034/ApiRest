package com.dania.pm;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Autowired
	private RegistroRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/") // Regresa todos los registros.
	public List<Registro> listar(){
		return repo.findAll();
	}
	@GetMapping("/{id}")
    public ResponseEntity<Registro> obtenerUsuario(@PathVariable int id) {
        return repo.findById(id)
                .map(registro -> ResponseEntity.ok(registro))
                .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/insertar")
	public Registro agregar(@RequestBody Registro r) {
		return repo.save(r);
	}
	
	//GET http://localhost:25666/buscar?nombre=cesar
	@GetMapping("/buscar")
	public List<Registro> buscarNombre(@RequestParam String nombre){
		return repo.findByNombre(nombre);
	}
	
	// PUT: actualizar existente 
	@PutMapping("/{id}") 
	public Registro actualizar(@PathVariable int id, @RequestBody Registro r) { 
		r.setId(id); 
		return repo.save(r); 
	}
	
	// DELETE: eliminar por id 
	@DeleteMapping("/{id}") 
		public void eliminar(@PathVariable int id) { 
		repo.deleteById(id); 
	}
}

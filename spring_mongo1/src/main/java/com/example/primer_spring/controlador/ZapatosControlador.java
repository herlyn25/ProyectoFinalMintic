package com.example.primer_spring.controlador;

import com.example.primer_spring.modelos.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.primer_spring.repositorios.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins="*",methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api/zapatos")
public class ZapatosControlador {
    @Autowired
    private ZapatosRepositorio repository;
    
    @PostMapping("/crear")
    public Zapatos crearUsuario(@RequestBody @Validated Zapatos p){
        return repository.insert(p);
    }
    @GetMapping("/buscar")
    public List <Zapatos> buscarTodos(){
        return repository.findAll();
    }
    
    /// No me funciona /////////////////////////////////////
    @PutMapping("/actualizar/{id}")
    public Zapatos actualizarUsuario(@PathVariable (value="id") String ced, @RequestBody @Validated Zapatos p){
        return repository.save(p);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable (value="id") String ced){
         repository.deleteById(ced);
    }
    @GetMapping("/buscarIndividual/{id}")
    public Optional <Zapatos> buscarPorId(@PathVariable (value="id") String ced){
        return repository.findById(ced);
    }
}

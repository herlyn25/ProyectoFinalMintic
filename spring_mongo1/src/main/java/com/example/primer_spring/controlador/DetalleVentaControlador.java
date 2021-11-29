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
@RequestMapping("/api/detalleventas")
public class DetalleVentaControlador {
    @Autowired
    private DetalleVentaRepositorio repository;
    
    @PostMapping("/crear")
    public DetalleVenta crearDetalleVenta(@RequestBody @Validated DetalleVenta p){
        return repository.insert(p);
    }
    @GetMapping("/buscar")
    public List <DetalleVenta> buscarTodas(){
        return repository.findAll();
    }
    @PutMapping("/actualizar/{id}")
    public DetalleVenta actualizarDetalleVenta(@PathVariable (value="id") String ced, @RequestBody @Validated DetalleVenta p){
        return repository.save(p);
    }  
   
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable (value="id") String ced){
         repository.deleteById(ced);
    }
    @GetMapping("/buscarIndividual/{id}")
    public Optional <DetalleVenta> buscarPorId(@PathVariable (value="id") String ced){
        return repository.findById(ced);
    }
}

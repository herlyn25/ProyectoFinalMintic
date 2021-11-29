package com.example.primer_spring.controlador;

import com.example.primer_spring.modelos.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.primer_spring.repositorios.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins="*",methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api/ventas")
public class VentaControlador {
    @Autowired
    private VentaRepositorio repository;
    
    @PostMapping("/crear")
    public Venta crearVenta(@RequestBody @Validated Venta p){
        return repository.insert(p);
    }
    @GetMapping("/buscar")
    public List <Venta> buscarTodos(){
        return repository.findAll();
    }
    @PutMapping("/actualizar/{id}")
    public Venta actualizarUsuario(@PathVariable (value="id") String ced, @RequestBody @Validated Venta p){
        return repository.save(p);
    }  
}

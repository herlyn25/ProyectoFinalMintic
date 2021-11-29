package com.example.primer_spring.controlador;

import com.example.primer_spring.modelos.Usuarios;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.primer_spring.repositorios.UsuarioRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@RestController
@CrossOrigin(origins="*",methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api/usuarios")
public class UsuariosControlador {
    @Autowired private UsuarioRepositorio repository;
    @Autowired private MongoTemplate mt;
    
    @PostMapping("/crear")
    public Usuarios crearUsuario(@RequestBody @Validated Usuarios p){
        return repository.insert(p);
    }
    @GetMapping("/buscar")
    public List <Usuarios> buscarTodos(){
        return repository.findAll();
    }
    
    /// No me funciona /////////////////////////////////////
    @PutMapping("/actualizar/{id}")
    public Usuarios actualizarUsuario(@PathVariable (value="id") String ced, @RequestBody @Validated Usuarios p){
        return repository.save(p);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable (value="id") String ced){
         repository.deleteById(ced);
    }
    @GetMapping("/buscarIndividual/{id}")
    public Optional <Usuarios> buscarPorId(@PathVariable (value="id") String ced){
        return repository.findById(ced);
    }
    @GetMapping("/buscarLogin/{username}/{password}")
    public List<Usuarios> loginUsuario(@PathVariable (value="username") String usuario,@PathVariable (value="password") String password ){
        Query q=new Query();
        q.addCriteria(Criteria.where("username").is(usuario).and("password").is(password));
        return mt.find(q,Usuarios.class);
    }


}

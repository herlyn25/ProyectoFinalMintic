package com.example.primer_spring.repositorios;

import com.example.primer_spring.modelos.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends MongoRepository<Usuarios, String>{
    
}

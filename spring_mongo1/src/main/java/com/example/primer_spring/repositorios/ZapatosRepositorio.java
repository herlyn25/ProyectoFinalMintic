package com.example.primer_spring.repositorios;

import com.example.primer_spring.modelos.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZapatosRepositorio extends MongoRepository<Zapatos, String>{
    
}

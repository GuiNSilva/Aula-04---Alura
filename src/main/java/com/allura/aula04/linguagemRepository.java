package com.allura.aula04;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface linguagemRepository extends MongoRepository<Linguagem, String> {
    
}

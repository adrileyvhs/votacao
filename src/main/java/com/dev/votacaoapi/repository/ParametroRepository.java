package com.dev.votacaoapi.repository;

import com.dev.votacaoapi.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<ParametroModel,String> {
}


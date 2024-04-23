package com.dev.votacaoapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("parametros")
public class ParametroModel  {
    @Id
    private  String chave;
    private  String valor;
}

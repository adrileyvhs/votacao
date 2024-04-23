package com.dev.votacaoapi.controller;

import com.dev.votacaoapi.model.ParametroModel;
import com.dev.votacaoapi.repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametros")
public class ParametroController {

/* injeção de dependecia não usa mais o * @Autowired*/

    private ParametroRepository repository;
    public ParametroController(ParametroRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<ParametroModel> salvar(@RequestBody ParametroModel parametroModel){
        ParametroModel entidade = repository.save(parametroModel);
        return  ResponseEntity.ok(entidade);
    }

    @GetMapping("/consulta")
    public ResponseEntity<ParametroModel>consulta(@RequestParam String chave ){
        Optional<ParametroModel> optparametro = repository.findById(chave);
        if(optparametro.isEmpty()){
            return  ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optparametro.get());
    }
}

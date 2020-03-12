package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.rd.exerciciospring.repository.CupomRepository;



public class CupomController {

    @GetMapping("//{}")
    public Cupom findById(@PathVariable("id") Long id) {
        return repository.findById(id).get();
    }


}

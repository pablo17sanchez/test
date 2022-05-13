package com.example.api.controller;


import com.example.api.model.Visitantes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/visitantes")
public class VisitantesController {

    @GetMapping
    public ResponseEntity<List<Visitantes>> getVisitantes() {

        List<Visitantes> visitantes = new ArrayList<Visitantes>();
        IntStream.range(0, 10)
                .forEach(i ->  visitantes.add(new Visitantes(i, "nombre" + i, "m", "Santo Domingo")));


        return new ResponseEntity<>(visitantes, HttpStatus.OK);

    }





}

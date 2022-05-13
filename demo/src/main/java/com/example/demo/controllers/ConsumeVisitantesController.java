package com.example.demo.controllers;

import com.example.demo.model.VisitantesConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/visitantes")
public class ConsumeVisitantesController {

    final String uri = "http://localhost:9191/visitantes";

    @GetMapping
    public ResponseEntity<List<VisitantesConsumer>> getVisitantes() {

        RestTemplate plantilla = new RestTemplate();
        VisitantesConsumer[] facturas = plantilla.getForObject(uri, VisitantesConsumer[].class);
        List<VisitantesConsumer> lista = Arrays.asList(facturas);

        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}

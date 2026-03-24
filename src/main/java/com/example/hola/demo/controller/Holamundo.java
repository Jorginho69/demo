package com.example.hola.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v3")
public class Holamundo {

    @GetMapping("/hola")
    public String holaMundo(){
        return  "Hola mundo....!!!!";
    }

    @GetMapping("/hi")
    public String helloWorld(){
        return  "Hello World....!!!!";
    }
    @PostMapping("/despedida")
    public ResponseEntity<String> recibirSaludo(@RequestBody Map<String, String> body){
        String nombre = body.get("nombre");
        return ResponseEntity.ok("Hola, "+ nombre + " mensaje recibido");
    }
}

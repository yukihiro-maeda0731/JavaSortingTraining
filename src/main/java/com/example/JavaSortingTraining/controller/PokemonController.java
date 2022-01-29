package com.example.JavaSortingTraining.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class PokemonController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void showPokemon(@RequestBody String base64CapturedImg) throws IOException {
//        RestTemplate rest = new RestTemplate();
//        String url = "https://pokeapi.co/api/v2/pokemon/pikachu/";
//
//        ResponseEntity<String> response = rest.getForEntity(url, String.class);
//
//        String json = response.getBody();
//
//         System.out.println(json);
    }
}

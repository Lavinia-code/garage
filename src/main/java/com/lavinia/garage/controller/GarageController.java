package com.lavinia.garage.controller;

import com.lavinia.garage.model.Carro;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/carro")
public class GarageController {

    @GetMapping
    public Carro findAll() {
        Carro carro = new Carro();
        carro.setCor("preto");
        carro.setNome("Ford");
        carro.setNacionalidade("EUA");
        carro.setAno(1929);
        carro.setAssentos(4);
        carro.setMaterialBancos("couro");
        carro.setCombustivel("Gasolina");

        return carro;
    }

    @PostMapping
    public void create (@RequestBody Carro carro){
        System.out.println(carro);
    }

    @GetMapping(value = "ok")
    public String carro() {
        return "ok";
    }
}

package com.lavinia.garage.controller;

import com.lavinia.garage.model.Carro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/carro")
public class GarageController {
    @GetMapping()
    public Carro teste1() {
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

    @GetMapping(value = "ok")
    public String carro() {
        return "ok";
    }
}

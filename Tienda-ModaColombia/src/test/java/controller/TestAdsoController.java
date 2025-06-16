package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-adso")
public class TestAdsoController {

    public String holaMundoAdso(){
        return "Hola esto es un saludo desde un WS - SpringBoot  yuly";
    }
}

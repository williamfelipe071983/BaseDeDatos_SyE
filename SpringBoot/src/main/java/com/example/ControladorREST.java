
package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class ControladorREST {
    
    @GetMapping("/")
    
    public String comienzo(){
    
        log.info("Estoy ejecutando el controlador REST");
        log.debug("Mas informacion");
        return "Spring en Sena";

    }
    
}

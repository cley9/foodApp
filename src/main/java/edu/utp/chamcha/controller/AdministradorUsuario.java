package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministradorUsuario {
    
    @GetMapping("/administrador/adminUsuario")
    public String adminUsuario(){
        return "administrador/administracionUsuario";
    }
}

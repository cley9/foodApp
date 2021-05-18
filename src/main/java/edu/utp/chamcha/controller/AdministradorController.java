package edu.utp.chamcha.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AdministradorController {
            private static final String ADMIN ="Administrador/Administrador"; 

        @GetMapping("/Administrador/Administrador")
        public String index(Model model) {
            return ADMIN;
        }   
    }


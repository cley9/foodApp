package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
private static String CHAT ="cliente/Chat";
@GetMapping("/cliente/Chat")
public String index(Model model) {
    return CHAT;
}    
}



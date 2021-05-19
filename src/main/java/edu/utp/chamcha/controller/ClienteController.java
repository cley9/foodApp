package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import edu.utp.chamcha.model.Cliente;
import edu.utp.chamcha.repository.ClienteRepository;
import edu.utp.chamcha.repository.UsuarioRepository;

import javax.validation.Valid;

@Controller
public class ClienteController {
    
    private static final String INDEX ="cliente/create"; 
    private static String MODEL_CONTACT="client";
    private final ClienteRepository clientsData;
    private final UsuarioRepository usuariosData;

    public ClienteController(ClienteRepository clientsData,
        UsuarioRepository usuariosData    
        ){
        this.clientsData = clientsData;
        this.usuariosData = usuariosData;
    }      

    @GetMapping("/cliente/create")
    public String index(Model model) {
        model.addAttribute(MODEL_CONTACT, new Cliente());
        return INDEX;
    }    

    @PostMapping("/cliente/create")
    public String createSubmitForm(Model model, 
        @Valid Cliente objCliente, BindingResult result ){
        if(result.hasFieldErrors()) {
            model.addAttribute("mensaje", "No se registro un cliente");
        }else{
            this.usuariosData.save(objCliente.getUser());
            this.usuariosData.flush();
            this.clientsData.save(objCliente);
            model.addAttribute(MODEL_CONTACT, objCliente);
            model.addAttribute("mensaje", "Se registro un cliente");
        }
        return INDEX;
    }

}


package edu.utp.chamcha.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;

import edu.utp.chamcha.model.Contacto;
import edu.utp.chamcha.repository.ContactoRepository;

import java.util.List;
@Controller
public class ContactoController{
    private static final String VIEW_INDEX ="contacto/index";
    private static final String VIEW_CREATE="contacto/create"; 
    private static final String VIEW_EDIT="contacto/edit"; 
    private static String MODEL_CONTACT="contact";

    private final ContactoRepository contactsData;

    public ContactoController(ContactoRepository contactsData){
        this.contactsData = contactsData;
    }    


    @GetMapping("/contacto/index")
    public String index(Model model){
        List<Contacto> listContacto = this.contactsData.findAll();
        model.addAttribute("contacto",listContacto);
        return VIEW_INDEX;
    }    
 


    @GetMapping("/contacto/create")
    public String create(Model model) {
        model.addAttribute(MODEL_CONTACT, new Contacto());
        return VIEW_CREATE;
    }  
    
    @PostMapping("/contacto/create")
    public String createSubmitForm(Model model, 
        @Valid Contacto objContact, BindingResult result ){
        if(result.hasFieldErrors()) {
            model.addAttribute("mensaje", "No se registro un contacto");
        }else{
            this.contactsData.save(objContact);
            model.addAttribute(MODEL_CONTACT, objContact);
            model.addAttribute("mensaje", "Se registro un contacto");
        }
        return VIEW_CREATE;
    }
/*** -------------------------------------------------------------- */




@GetMapping("/contacto/edit/{id}")
public String edit(@PathVariable("id")  Integer id, 
    Model model){
        Contacto contact = this.contactsData.getOne(id);
    model.addAttribute(MODEL_CONTACT, contact);
    return VIEW_EDIT;
}  

@PostMapping("/contacto/edit")
public String update(
        @Valid Contacto objContact,
        BindingResult bindingResult
        ){
    if(bindingResult.hasFieldErrors()) {
        return "redirect:/contacto/edit/{id}";
    }
    this.contactsData.save(objContact);
    return VIEW_EDIT;
}


}

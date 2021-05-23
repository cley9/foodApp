package edu.utp.chamcha.controller;
import edu.utp.chamcha.model.Cupon;
import edu.utp.chamcha.repository.CuponRepository;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CuponController {
    public static String CUPOM="cliente/cupon";
    private static String MODEL_CUPON="cupon";
    private final CuponRepository cuponsData;
    
    public CuponController (CuponRepository cuponsData){
        this.cuponsData = cuponsData;
    }


    @GetMapping("/cliente/cupon")
    public String index(Model model) {
        model.addAttribute(MODEL_CUPON,new Cupon());
        //return CUPOM;
        return CUPOM;
    } 
    
    @PostMapping("/cliente/cupon") /* para insert a db*/
    public String createSubmitForm(Model model, 
        @Valid Cupon objCupon, BindingResult result ){
        if(result.hasFieldErrors()) {
            model.addAttribute("mensaje", "No se registro el cupon");
        }else{
            this.cuponsData.save(objCupon);
            model.addAttribute(MODEL_CUPON, objCupon);
            model.addAttribute("mensaje", "Se registro el cupon ");
        }
        return CUPOM;
    }

}

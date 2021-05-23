

package edu.utp.chamcha.controller;
import java.util.List;
import edu.utp.chamcha.repository.ProductoRepository;
import edu.utp.chamcha.model.Producto;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;



@Controller
public class CartaController {
    


    private static final String INDEX_A ="cliente/carta"; 
    private final ProductoRepository productsData;
    
    
    public CartaController(ProductoRepository productsData
        ){
        this.productsData = productsData;
        
    }  
/*
    @GetMapping("cliente/carta")
    public String carta(){         
        return "cliente/carta";
    }

*/

    

    @GetMapping("/cliente/carta")
    public String index(Model model){
        List<Producto> listProducto = this.productsData.getAllActiveProductos();
        model.addAttribute("productos",listProducto);
        return INDEX_A;
    }    

    
}

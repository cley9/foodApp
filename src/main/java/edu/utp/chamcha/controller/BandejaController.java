
package edu.utp.chamcha.controller;
import java.util.List;
import edu.utp.chamcha.repository.ProductoRepository;
import edu.utp.chamcha.model.Producto;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;


@Controller
public class BandejaController {
    private static final String INDEX ="cliente/bandeja"; 
    private final ProductoRepository productsData;
    

    public BandejaController(ProductoRepository productsData
        ){
        this.productsData = productsData;
        
    }      

    @GetMapping("/cliente/bandeja")
    public String index(Model model){
        List<Producto> listProducto = this.productsData.getAllActiveProductos();
        model.addAttribute("productos",listProducto);
        return INDEX;
    }    
/*
    @GetMapping("/catalogo/add/{id}")
    public String add(@PathVariable("id") int id, 
        Model model){
        return INDEX;
    }  */
    
}

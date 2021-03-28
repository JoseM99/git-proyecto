package com.mantenimiento.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.mantenimiento.Model.*;

@Controller
public class ContactoController {
  
	
	@GetMapping("/contact")
	public String metodocontacto(Model model){
		person p = new person();
        p.setNombre("Jose Manuel Fajardo Gutierrez");        
        model.addAttribute("people",p);
     
        return "index1";
	}
}

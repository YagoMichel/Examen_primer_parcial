package com.yago.Examen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class clientesPotenciales {

    @GetMapping("/ClientesPO")
    public String clientes_potenciales_table() {
        return "clientesPO/clientes-potenciales";
    }
    @GetMapping("/ClientesPO/editar")
    public String clientes_potenciaciales_editar_get() {
        return "clientesPO/clientesPO-edit";
    }
    @GetMapping("/ClientesPO/eliminar")
    public String clientes_potenciaciales_eliminar_get() {
        return "clientesPO/clientesPO-del";
    }
    @GetMapping("/ClientesPO/añadir")
    public String clientes_potenciaciales_añadir_get() {
        return "clientesPO/clientesPO-add";
    }
    
    
}

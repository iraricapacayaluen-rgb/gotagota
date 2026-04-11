package com.senati.gotagota.controller;


import com.senati.gotagota.entity.Cliente;
import com.senati.gotagota.service.ClienteService;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@RestController Indica que esta clase maneja peticiones HTTP y Devuelven JSON
@RestController
//Define la url base de todos los END-POINT de esta clase
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "*")
//Esta anotacion permite que el frontend puede llamar a esta API
//Au no ponemos eso, el navegador bloquea las peticiones por politicas CORS
public class ClienteController {
    //DECLARAMOS UNA VARIABLE DEFINIDA

    //Inyectamos el servicio para acceder a la logica del negocio
        private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }


    //GET /api/clientes -> devuelve todos los clientes en formato JSON
    @GetMapping
    public List<Cliente> listar(){return clienteService.listarTodos();}

    //DELETE
    @DeleteMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> eliminarCliente(@PathVariable Long id) {
        // Paso 2: Ahora sí borra el cliente;
        clienteService.eliminarCliente(id);
        return ResponseEntity.ok("Cliente eliminado");
    }


}
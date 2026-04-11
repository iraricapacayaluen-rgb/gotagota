package com.senati.gotagota.service;


import com.senati.gotagota.entity.Cliente;
import com.senati.gotagota.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    //Inyectamos el repositorio para acceder a la base de datos
    private final ClienteRepository clienteRepository;

    //Construcctor: Spring inyecta automaticamente el repositorio
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository  = clienteRepository;
    }

    //Retorna o recibe la lista de todos los clientes
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    //Eliminamos el Cliete
    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }



}

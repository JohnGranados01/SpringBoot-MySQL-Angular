package com.apirest.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.apirest.entity.Cliente;
import com.apirest.apirest.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
         return clienteRepository.findAll();
    }
    
    public Cliente save(Cliente cliente){
         return clienteRepository.save(cliente);
    }

    public Cliente getById(Integer id){
         return clienteRepository.findById(id).get();
    }
    
    public void delete(Integer id){
        clienteRepository.deleteById(id);
    }
}

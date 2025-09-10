package com.cancha.bootcamp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cancha.bootcamp.models.Cliente;
import com.cancha.bootcamp.ClienteService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/create")
    public Cliente create(@Valid @RequestBody Cliente cliente) {
        return this.clienteService.guardarCliente(cliente);
    }

    @GetMapping("/readAll")
    public List<Cliente> read() {
        return this.clienteService.obtenerClientes();
    }

    @GetMapping("/seach/{id}")
    public Cliente getValue(@PathVariable int id) {
        return this.clienteService.obtenerClientePorId(id);
    }

    @PatchMapping("/update/{id}")
    public Cliente update(@PathVariable int id, @Valid @RequestBody Cliente cliente) {
        return this.clienteService.actualizarCliente(id, cliente);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return this.clienteService.eliminarCliente(id);
    }
}

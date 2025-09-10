package com.cancha.bootcamp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cancha.bootcamp.models.Administrador;
import com.cancha.bootcamp.AdministradorService;

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
@RequestMapping("/administrador")
public class AdministradorController {

    private final AdministradorService administradorService;

    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    @PostMapping("/create")
    public Administrador create(@Valid @RequestBody Administrador administrador) {
        return this.administradorService.guardarAdministrador(administrador);
    }

    @GetMapping("/readAll")
    public List<Administrador> read() {
        return this.administradorService.obtenerAdministradores();
    }

    @GetMapping("/seach/{id}")
    public Administrador getValue(@PathVariable int id) {
        return this.administradorService.obtenerAdministradorPorId(id);
    }

    @PatchMapping("/update/{id}")
    public Administrador update(@PathVariable int id, @Valid @RequestBody Administrador administrador) {
        return this.administradorService.actualizarAdministrador(id, administrador);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return this.administradorService.eliminarAdministrador(id);
    }
}

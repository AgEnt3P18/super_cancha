package com.cancha.bootcamp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cancha.bootcamp.models.Cancha;
import com.cancha.bootcamp.CanchaService;

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
@RequestMapping("/cancha")
public class CanchaController {

    private final CanchaService canchaService;

    public CanchaController(CanchaService canchaService) {
        this.canchaService = canchaService;
    }

    @PostMapping("/create")
    public Cancha create(@Valid @RequestBody Cancha cancha) {
        return this.canchaService.guardarCancha(cancha);
    }

    @GetMapping("/readAll")
    public List<Cancha> read() {
        return this.canchaService.obtenerCanchas();
    }

    @GetMapping("/seach/{id}")
    public Cancha getValue(@PathVariable int id) {
        return this.canchaService.obtenerCanchaPorId(id);
    }

    @PatchMapping("/update/{id}")
    public Cancha update(@PathVariable int id, @Valid @RequestBody Cancha cancha) {
        return this.canchaService.actualizarCancha(id, cancha);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return this.canchaService.eliminarCancha(id);
    }
}

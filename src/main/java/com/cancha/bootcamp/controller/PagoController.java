package com.cancha.bootcamp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cancha.bootcamp.models.Pago;
import com.cancha.bootcamp.PagoService;

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
@RequestMapping("/pago")
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping("/create")
    public Pago create(@Valid @RequestBody Pago pago) {
        return this.pagoService.guardarPago(pago);
    }

    @GetMapping("/readAll")
    public List<Pago> read() {
        return this.pagoService.obtenerPagos();
    }

    @GetMapping("/seach/{id}")
    public Pago getValue(@PathVariable int id) {
        return this.pagoService.obtenerPagoPorId(id);
    }

    @PatchMapping("/update/{id}")
    public Pago update(@PathVariable int id, @Valid @RequestBody Pago pago) {
        return this.pagoService.actualizarPago(id, pago);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return this.pagoService.eliminarPago(id);
    }
}

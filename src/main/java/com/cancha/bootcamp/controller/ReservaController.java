package com.cancha.bootcamp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cancha.bootcamp.models.Reserva;
import com.cancha.bootcamp.ReservaService;

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
@RequestMapping("/reserva")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping("/create")
    public Reserva create(@Valid @RequestBody Reserva reserva) {
        return this.reservaService.guardarReserva(reserva);
    }

    @GetMapping("/readAll")
    public List<Reserva> read() {
        return this.reservaService.obtenerReservas();
    }

    @GetMapping("/seach/{id}")
    public Reserva getValue(@PathVariable int id) {
        return this.reservaService.obtenerReservaPorId(id);
    }

    @PatchMapping("/update/{id}")
    public Reserva update(@PathVariable int id, @Valid @RequestBody Reserva reserva) {
        return this.reservaService.actualizarReserva(id, reserva);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return this.reservaService.eliminarReserva(id);
    }
}

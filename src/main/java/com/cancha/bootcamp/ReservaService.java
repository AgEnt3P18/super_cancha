package com.cancha.bootcamp;

import org.springframework.stereotype.Service;
import java.util.List;
import com.cancha.bootcamp.models.Reserva;
import com.cancha.bootcamp.repository.ReservaRepository;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    // Obtener todas las reservas
    public List<Reserva> obtenerReservas() {
        return reservaRepository.mostrarReservas();
    }

    // Guardar una nueva reserva
    public Reserva guardarReserva(Reserva reserva) {
        return reservaRepository.agregarReserva(reserva);
    }

    // Obtener reserva por ID
    public Reserva obtenerReservaPorId(int id) {
        return reservaRepository.getReservaById(id);
    }

    // Actualizar reserva
    public Reserva actualizarReserva(int id, Reserva reserva) {
        return reservaRepository.actualizarReserva(id, reserva);
    }

    // Eliminar reserva
    public boolean eliminarReserva(int id) {
        return reservaRepository.borrarReserva(id);
    }
}

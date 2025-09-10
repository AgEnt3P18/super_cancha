package com.cancha.bootcamp;

import org.springframework.stereotype.Service;
import java.util.List;
import com.cancha.bootcamp.models.Pago;
import com.cancha.bootcamp.repository.PagoRepository;

@Service
public class PagoService {

    private final PagoRepository pagoRepository;

    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    // Obtener todos los pagos
    public List<Pago> obtenerPagos() {
        return pagoRepository.mostrarPagos();
    }

    // Guardar un nuevo pago
    public Pago guardarPago(Pago pago) {
        return pagoRepository.agregarPago(pago);
    }

    // Obtener pago por ID
    public Pago obtenerPagoPorId(int id) {
        return pagoRepository.getPagoById(id);
    }

    // Actualizar pago
    public Pago actualizarPago(int id, Pago pago) {
        return pagoRepository.actualizarPago(id, pago);
    }

    // Eliminar pago
    public boolean eliminarPago(int id) {
        return pagoRepository.borrarPago(id);
    }
}

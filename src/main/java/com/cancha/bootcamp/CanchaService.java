package com.cancha.bootcamp;

import org.springframework.stereotype.Service;
import java.util.List;
import com.cancha.bootcamp.models.Cancha;
import com.cancha.bootcamp.repository.CanchaRepository;

@Service
public class CanchaService {

    private final CanchaRepository canchaRepository;

    public CanchaService(CanchaRepository canchaRepository) {
        this.canchaRepository = canchaRepository;
    }

    // Obtener todas las canchas
    public List<Cancha> obtenerCanchas() {
        return canchaRepository.mostrarCanchas();
    }

    // Guardar una nueva cancha
    public Cancha guardarCancha(Cancha cancha) {
        return canchaRepository.agregarCancha(cancha);
    }

    // Obtener cancha por ID
    public Cancha obtenerCanchaPorId(int id) {
        return canchaRepository.getCanchaById(id);
    }

    // Actualizar cancha
    public Cancha actualizarCancha(int id, Cancha cancha) {
        return canchaRepository.actualizarCancha(id, cancha);
    }

    // Eliminar cancha
    public boolean eliminarCancha(int id) {
        return canchaRepository.borrarCancha(id);
    }
}

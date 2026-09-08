package com.clinicaveterinaria.huellitas.service;
import com.clinicaveterinaria.huellitas.model.Mascota;
import com.clinicaveterinaria.huellitas.repository.MascotaRepository;
import com.clinicaveterinaria.huellitas.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaRepository MascotaRepository;

    @Override
    public List<Mascota> obtenerTodas() {
        return MascotaRepository.findAll();
    }

    @Override
    public Optional<Mascota> obtenerPorId(Long id) {
        return MascotaRepository.findById(id);
    }

    @Override
    public Mascota guardar(Mascota mascota) {
        return MascotaRepository.save(mascota);
    }
    @Override
    public Mascota actualizar(Long id, Mascota mascota) {
        return MascotaRepository.findById(id).map(m -> {
            m.setNombre(mascota.getNombre());
            m.setTipo(mascota.getTipo());
            m.setEdad(mascota.getEdad());
            return MascotaRepository.save(m);
        }).orElseThrow(() -> new RuntimeException("Mascota no encontrada con el id: " + id));
    }

    @Override
    public void eliminar(Long id) {
        MascotaRepository.deleteById(id);
    }
}
package com.clinicaveterinaria.huellitas.repository;

import com.clinicaveterinaria.huellitas.enums.TIPO;
import com.clinicaveterinaria.huellitas.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    List<Mascota> findByTipo(TIPO tipo);
}
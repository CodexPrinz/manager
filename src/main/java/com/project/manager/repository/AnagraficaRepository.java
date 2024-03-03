package com.project.manager.repository;

import com.project.manager.entity.Anagrafica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnagraficaRepository extends JpaRepository<Anagrafica, Long> {

    @Query("SELECT a FROM Anagrafica a WHERE a.codiceFiscale = :cf")
    List<Anagrafica> findByCF(@Param("cf") String cf);

    @Query("SELECT a FROM Anagrafica a WHERE a.partitaIva = :pIva")
    List<Anagrafica> findByPIva(@Param("pIva") String pIva);

}

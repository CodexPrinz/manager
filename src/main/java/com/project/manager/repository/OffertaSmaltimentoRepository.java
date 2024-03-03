package com.project.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.manager.entity.OffertaSmaltimento;

import java.util.List;

@Repository
public interface OffertaSmaltimentoRepository extends  JpaRepository<OffertaSmaltimento, Long>{

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.idAnag = :idAnag")
    List<OffertaSmaltimento> getOffertaSmaltimentoByAnagId(@Param("idAnag") Long anagId);

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.codiceFiscale = :cf")
    List<OffertaSmaltimento> getOffertaSmaltimentoByCf(@Param("cf") String cf);

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.partitaIva = :pIva")
    List<OffertaSmaltimento> getOffertaSmaltimentoByPIva(@Param("pIva") String pIva);

}

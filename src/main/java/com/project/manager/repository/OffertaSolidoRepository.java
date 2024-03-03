package com.project.manager.repository;

import com.project.manager.entity.OffertaSmaltimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.manager.entity.OffertaSolido;

import java.util.List;

@Repository
public interface OffertaSolidoRepository extends  JpaRepository<OffertaSolido, Long>{

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.idAnag = :idAnag")
    List<OffertaSolido> getOffertaAnalisiByAnagId(@Param("idAnag") Long anagId);

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.codiceFiscale = :cf")
    List<OffertaSolido> getOffertaAnalisiByCf(@Param("cf") String cf);

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.partitaIva = :pIva")
    List<OffertaSolido> getOffertaAnalisiByPIva(@Param("pIva") String pIva);
}

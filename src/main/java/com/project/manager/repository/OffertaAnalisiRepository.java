package com.project.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.manager.entity.OffertaAnalisi;

import java.util.List;

@Repository
public interface OffertaAnalisiRepository extends  JpaRepository<OffertaAnalisi, Long>{

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.idAnag = :idAnag")
    List<OffertaAnalisi> getOffertaAnalisiByAnagId(@Param("idAnag") Long anagId);

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.codiceFiscale = :cf")
    List<OffertaAnalisi> getOffertaAnalisiByCf(@Param("cf") String cf);

    @Query("SELECT o FROM OffertaAnalisi o WHERE o.partitaIva = :pIva")
    List<OffertaAnalisi> getOffertaAnalisiByPIva(@Param("pIva") String pIva);

}

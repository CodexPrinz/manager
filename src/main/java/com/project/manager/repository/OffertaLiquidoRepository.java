package com.project.manager.repository;

import com.project.manager.entity.OffertaAnalisi;
import com.project.manager.entity.OffertaLiquido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OffertaLiquidoRepository extends JpaRepository<OffertaLiquido, Long> {

    @Query("SELECT o FROM OffertaLiquido o WHERE o.idAnag = :idAnag")
    List<OffertaLiquido> getOffertaAnalisiByAnagId(@Param("idAnag") Long anagId);

    @Query("SELECT o FROM OffertaLiquido o WHERE o.codiceFiscale = :cf")
    List<OffertaLiquido> getOffertaAnalisiByCf(@Param("cf") String cf);

    @Query("SELECT o FROM OffertaLiquido o WHERE o.partitaIva = :pIva")
    List<OffertaLiquido> getOffertaAnalisiByPIva(@Param("pIva") String pIva);
}

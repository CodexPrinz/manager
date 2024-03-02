package com.project.manager.repository;

import com.project.manager.entity.OffertaLiquido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffertaLiquidoRepository extends JpaRepository<OffertaLiquido, Long> {
}

package com.project.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.manager.entity.OffertaSmaltimento;

@Repository
public interface OffertaSmaltimentoRepository extends  JpaRepository<OffertaSmaltimento, Long>{

}

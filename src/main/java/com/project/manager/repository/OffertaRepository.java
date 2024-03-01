package com.project.manager.repository;

import com.project.manager.entity.Offerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffertaRepository extends JpaRepository<Offerta, Long> {
}

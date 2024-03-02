package com.project.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.manager.entity.OffertaAnalisi;

@Repository
public interface OffertaAnalisiRepository extends  JpaRepository<OffertaAnalisi, Long>{

}

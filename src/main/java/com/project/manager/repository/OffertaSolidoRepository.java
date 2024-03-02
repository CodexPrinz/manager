package com.project.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.manager.entity.OffertaSolido;

@Repository
public interface OffertaSolidoRepository extends  JpaRepository<OffertaSolido, Long>{

}

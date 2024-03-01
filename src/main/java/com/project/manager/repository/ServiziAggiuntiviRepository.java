package com.project.manager.repository;

import com.project.manager.entity.ServiziAggiuntivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiziAggiuntiviRepository extends JpaRepository<ServiziAggiuntivi, Long> {
}

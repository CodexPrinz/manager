package com.project.manager.repository;

import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

    @Query("SELECT a FROM Attachment a where a.idAnag = :idAnag")
    List<Attachment> getAttachmentByAnagId(@Param("idAnag") Anagrafica idAnag);
//    @Query("SELECT a FROM Attachment a where a.idAnag = :idAnag")
//    List<Attachment> getAttachmentByCF(String cf);
//    List<Attachment> getAttachmentByPIva(String pIva);

}

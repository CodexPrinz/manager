package com.project.manager.service;

import com.project.manager.dto.AttachmentDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.Attachment;
import com.project.manager.entity.OffertaAnalisi;

import java.util.List;

public interface AttachmentService {

    Attachment getAttachmentById(Long id);
    List<Attachment> getAll();
    List<Attachment> getAttachmentByAnagId(Anagrafica idAnag);
//    List<Attachment> getAttachmentByCF(String cf);
//    List<Attachment> getAttachmentByPIva(String pIva);
    void deleteAttachmentById(Long id);
    Attachment saveAttachment(AttachmentDto attachmentDto);
    Attachment updateAttachment(Attachment attachment);

}

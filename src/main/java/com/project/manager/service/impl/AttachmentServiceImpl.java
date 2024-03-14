package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.AttachmentDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.Attachment;
import com.project.manager.repository.AttachmentRepository;
import com.project.manager.service.AttachmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
@Service
public class AttachmentServiceImpl implements AttachmentService {

    private AttachmentRepository attachmentRepository;
    private ModelMapper mapper;


    public AttachmentServiceImpl(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;

    }

    @Override
    public Attachment getAttachmentById(Long id) {
        return attachmentRepository.findById(id).orElseThrow(()->new RuntimeException( MessageConst.RECORD_DOES_NOT_EXIST+id));
    }

    @Override
    public List<Attachment> getAll() {
        return attachmentRepository.findAll();
    }

    @Override
    public List<Attachment> getAttachmentByAnagId(AnagraficaDto anagId) {
        mapper = new ModelMapper();
        Anagrafica anag = mapper.map(anagId, Anagrafica.class);
        return attachmentRepository.getAttachmentByAnagId(anag);
    }

//    @Override
//    public List<Attachment> getAttachmentByCF(String cf) {
//        return attachmentRepository.getAttachmentByCF(cf);
//    }
//
//    @Override
//    public List<Attachment> getAttachmentByPIva(String pIva) {
//        return attachmentRepository.getAttachmentByPIva(pIva);
//    }

    @Override
    public void deleteAttachmentById(Long id) {
        attachmentRepository.deleteById(id);
    }

    @Override
    public Attachment saveAttachment(AttachmentDto attachmentDto) {
        // TODO: test
        String fileName = StringUtils.cleanPath(attachmentDto.getFileName());
   /*     Attachment attachment = new Attachment();
        attachment.setDownloadUrl(attachmentDto.getDownloadUrl());
        attachment.setFileContent(attachmentDto.getFileContent());
        attachment.setFileName(attachmentDto.getFileName());
        attachment.setFileSize(attachmentDto.getFileSize());
*/
        mapper = new ModelMapper();
        Attachment attachment = mapper.map(attachmentDto, Attachment.class);
        return attachmentRepository.save(attachment);
    }

    @Override
    public Attachment updateAttachment(AttachmentDto attachment) {
        // TODO
        Attachment attachment1 = mapper.map(attachment, Attachment.class);
        return null;
    }
}

package com.project.manager.controller;

import com.project.manager.dto.AttachmentDto;
import com.project.manager.service.AttachmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping(path = "/api/v1")
public class FileUploadController {
    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);
    private static String UPLOAD_DIR = "uploads/";

    private AttachmentService attachmentService;

    public FileUploadController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @PostMapping(path = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> upload(@RequestParam(name = "file", required = true)MultipartFile file){
        try {
            AttachmentDto dto = new AttachmentDto();
            dto.setFileName(file.getOriginalFilename());
            float fileSize = file.getSize();
            dto.setFileSize(fileSize);
            dto.setFileContent(file.getBytes());
            dto.setFileType("");

            //TODO: test
            String fileDownLoadUrl= ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path(UPLOAD_DIR)
                    .path(dto.getFileName())
                    .toUriString();

            dto.setDownloadUrl(fileDownLoadUrl);

//            Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
//            Files.write(path, fileContent);

            attachmentService.saveAttachment(dto);

            return new ResponseEntity<>("File uploaded successfully. Stored at:" + file.getOriginalFilename(), HttpStatus.ACCEPTED);
        } catch (Exception ex){
            logger.error("File upload failed");
            logger.info(ex.getMessage());
        }
        return null;
    }


}

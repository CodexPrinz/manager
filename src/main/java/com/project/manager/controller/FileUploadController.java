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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

            //TODO: test, also what are the file types acceptable
            String fileDownLoadUrl= ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path(UPLOAD_DIR)
                    .path(dto.getFileName())
                    .toUriString();

            dto.setDownloadUrl(fileDownLoadUrl);


            // TODO: attachmentService.saveAttachment(dto);
            String location = UPLOAD_DIR + file.getOriginalFilename();
            File f = new File(location);
            if (f.exists()){
                location+=" "+ LocalDateTime.now();
            }
            boolean bool = f.createNewFile();
//            if (bool){
                try (FileOutputStream out = new FileOutputStream(f)) {
                    out.write(file.getBytes());
                    out.close();
                    logger.info("File location {}", location);

                    attachmentService.saveAttachment(dto);
                }  catch (IOException e) {
                    throw new RuntimeException(e);
                }
 //           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new ResponseEntity<>("File uploaded successfully. Stored at:" + file.getOriginalFilename(), HttpStatus.ACCEPTED);
    }


}

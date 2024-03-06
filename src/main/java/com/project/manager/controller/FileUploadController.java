package com.project.manager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping(path = "/api/v1")
public class FileUploadController {
    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);
    private static String UPLOAD_DIR = "uploads/";


    @PostMapping(path = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> upload(@RequestParam(name = "file", required = true)MultipartFile file){
        try {
            String fileName = file.getOriginalFilename();
            long fileSize = file.getSize();
            byte[] fileContent = file.getBytes();

            Path path = Paths.get(UPLOAD_DIR + fileName);
            Files.write(path, fileContent);
            return new ResponseEntity<>("File uploaded successfully. Stored at:" + fileName, HttpStatus.ACCEPTED);
        } catch (Exception ex){
            logger.error("File upload failed");
            logger.info(ex.getMessage());
        }
        return null;
    }


}

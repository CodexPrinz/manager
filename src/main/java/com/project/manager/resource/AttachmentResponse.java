package com.project.manager.resource;

import com.project.manager.entity.Anagrafica;
import jakarta.persistence.Column;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;


public class AttachmentResponse implements Serializable {


    private String fileName;

    private String fileType;

    private byte[] fileContent;

    private Float fileSize;
    private String downloadUrl;
    private Anagrafica idAnag;
    private LocalDateTime dataInserimento;

    public AttachmentResponse() {
    }

    public LocalDateTime getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(LocalDateTime dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public Float getFileSize() {
        return fileSize;
    }

    public void setFileSize(Float fileSize) {
        this.fileSize = fileSize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Anagrafica getIdAnag() {
        return idAnag;
    }

    public void setIdAnag(Anagrafica idAnag) {
        this.idAnag = idAnag;
    }

    @Override
    public String toString() {
        return "AttachmentResponse{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileContent=" + Arrays.toString(fileContent) +
                ", fileSize=" + fileSize +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", idAnag=" + idAnag +
                ", dataInserimento=" + dataInserimento +
                '}';
    }
}

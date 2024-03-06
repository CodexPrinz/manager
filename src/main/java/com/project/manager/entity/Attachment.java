package com.project.manager.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Arrays;

@Entity
@Table(name = "Attachment")
public class Attachment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FILE_NAME")
    private String fileName;
    @Column(name = "FILE_TYPE")
    private String fileType;
    @Column(name = "FILE")
    private byte[] fileContent;
    @Column(name = "FILE_SIZE")
    private Float fileSize;
    @Column(name = "DOWNLOAD_URL")
    private String downloadUrl;
    @JoinColumn(name = "ID_ANAGRAFICA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Anagrafica idAnag;

    public Attachment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Anagrafica getIdAnag() {
        return idAnag;
    }

    public void setIdAnag(Anagrafica idAnag) {
        this.idAnag = idAnag;
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

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileContent=" + Arrays.toString(fileContent) +
                ", fileSize=" + fileSize +
                ", idAnag=" + idAnag +
                '}';
    }
}

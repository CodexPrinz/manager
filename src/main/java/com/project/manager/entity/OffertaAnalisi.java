package com.project.manager.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "OFFERTE_ANALISI")
public class OffertaAnalisi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ANAGRAFICA")
    @NotNull
    private Anagrafica idAnag;
    @Column(name = "CODICE_FISCALE")
    private String codiceFiscale;
    @Column(name = "PARTITA_IVA")
    private String partitaIva;
    @Column(name = "CODICE_EER_CER")
    private String codiceEER;
    @Column(name = "DESCRIZIONE_RIFIUTI")
    private String descrizioneRifiuto;
    @Column(name = "VALIDITA_OFFERTA")
    private Date validitaOfferta;
    @Column(name = "CONDIZIONI_DI_PAGAMENTO")
    private String condizioniDiPagamento;
    @Column(name = "ANALISI_DI_CLASSIFCAZIONE")
    private String analisiDiClassificazione;
    @Column(name = "DATA_FIRMA")
    private Date dataFirma;
    @Column(name = "FIRMA_DIGITALE")
    private String firmaDigitale;
    @Column(name = "DATA_INSERIMENTO")
    private LocalDateTime dataInserimento;

    public OffertaAnalisi() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodiceEER() {
        return codiceEER;
    }

    public void setCodiceEER(String codiceEER) {
        this.codiceEER = codiceEER;
    }

    public String getDescrizioneRifiuto() {
        return descrizioneRifiuto;
    }

    public void setDescrizioneRifiuto(String descrizioneRifiuto) {
        this.descrizioneRifiuto = descrizioneRifiuto;
    }

    public Date getValiditaOfferta() {
        return validitaOfferta;
    }

    public void setValiditaOfferta(Date validitaOfferta) {
        this.validitaOfferta = validitaOfferta;
    }

    public String getCondizioniDiPagamento() {
        return condizioniDiPagamento;
    }

    public void setCondizioniDiPagamento(String condizioniDiPagamento) {
        this.condizioniDiPagamento = condizioniDiPagamento;
    }

    public Date getDataFirma() {
        return dataFirma;
    }



    public void setDataFirma(Date dataFirma) {
        this.dataFirma = dataFirma;
    }

    public String getFirmaDigitale() {
        return firmaDigitale;
    }

    public void setFirmaDigitale(String firmaDigitale) {
        this.firmaDigitale = firmaDigitale;
    }

    public LocalDateTime getDataInserimento() {
        return dataInserimento;
    }
    @PrePersist
    public void setDataInserimento() {
        this.dataInserimento = LocalDateTime.now();
    }

    public String getAnalisiDiClassificazione() {
        return analisiDiClassificazione;
    }

    public void setAnalisiDiClassificazione(String analisiDiClassificazione) {
        this.analisiDiClassificazione = analisiDiClassificazione;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public Anagrafica getIdAnag() {
        return idAnag;
    }

    public void setIdAnag(Anagrafica idAnag) {
        this.idAnag = idAnag;
    }

    @Override
    public String toString() {
        return "OffertaAnalisi{" +
                "id=" + id +
                ", idAnag=" + idAnag +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", codiceEER='" + codiceEER + '\'' +
                ", descrizioneRifiuto='" + descrizioneRifiuto + '\'' +
                ", validitaOfferta=" + validitaOfferta +
                ", condizioniDiPagamento='" + condizioniDiPagamento + '\'' +
                ", analisiDiClassificazione='" + analisiDiClassificazione + '\'' +
                ", dataFirma=" + dataFirma +
                ", firmaDigitale='" + firmaDigitale + '\'' +
                ", dataInserimento=" + dataInserimento +
                '}';
    }
}

package com.project.manager.resource;

import com.project.manager.entity.Anagrafica;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OffertaAnalisiResponse{

    private Anagrafica idAnag;

    private String codiceFiscale;

    private String partitaIva;

    private String codiceEER;
    private String descrizioneRifiuto;
    private LocalDate validitaOfferta;
    private String condizioniDiPagamento;
    private String analisiDiClassificazione;
    private LocalDate dataFirma;
    private String firmaDigitale;
    private LocalDateTime dataInserimento;

    public OffertaAnalisiResponse() {
    }

    @Override
    public String toString() {
        return "OffertaAnalisiResponse{" +
                "idAnag=" + idAnag +
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

    public LocalDateTime getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(LocalDateTime dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public Anagrafica getIdAnag() {
        return idAnag;
    }

    public void setIdAnag(Anagrafica idAnag) {
        this.idAnag = idAnag;
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

    public LocalDate getValiditaOfferta() {
        return validitaOfferta;
    }

    public void setValiditaOfferta(LocalDate validitaOfferta) {
        this.validitaOfferta = validitaOfferta;
    }

    public String getCondizioniDiPagamento() {
        return condizioniDiPagamento;
    }

    public void setCondizioniDiPagamento(String condizioniDiPagamento) {
        this.condizioniDiPagamento = condizioniDiPagamento;
    }

    public String getAnalisiDiClassificazione() {
        return analisiDiClassificazione;
    }

    public void setAnalisiDiClassificazione(String analisiDiClassificazione) {
        this.analisiDiClassificazione = analisiDiClassificazione;
    }

    public LocalDate getDataFirma() {
        return dataFirma;
    }

    public void setDataFirma(LocalDate dataFirma) {
        this.dataFirma = dataFirma;
    }

    public String getFirmaDigitale() {
        return firmaDigitale;
    }

    public void setFirmaDigitale(String firmaDigitale) {
        this.firmaDigitale = firmaDigitale;
    }

}

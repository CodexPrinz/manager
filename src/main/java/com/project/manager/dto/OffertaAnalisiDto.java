package com.project.manager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.manager.entity.Anagrafica;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class OffertaAnalisiDto {

    private Long id;
    @JsonProperty(value = "ID_ANAGRAFICA", required = true)
    @NotNull
    private Anagrafica idAnag;
    @JsonProperty(value = "CODICE_FISCALE", required = true)
    private String codiceFiscale;
    @JsonProperty("PARTITA_IVA")
    private String partitaIva;
    @JsonProperty("CODICE_EER_CER")
    private String codiceEER;
    @JsonProperty("DESCRIZIONE_RIFIUTI")
    private String descrizioneRifiuto;
    @JsonProperty("VALIDITA_OFFERTA")
    private Date validitaOfferta;
    @JsonProperty("CONDIZIONI_DI_PAGAMENTO")
    private String condizioniDiPagamento;
    @JsonProperty("ANALISI_DI_CLASSIFCAZIONE")
    private String analisiDiClassificazione;
    @JsonProperty(value = "DATA_FIRMA", required = true)
    private Date dataFirma;
    @JsonProperty("FIRMA_DIGITALE")
    private String firmaDigitale;

    public OffertaAnalisiDto() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAnalisiDiClassificazione() {
        return analisiDiClassificazione;
    }

    public void setAnalisiDiClassificazione(String analisiDiClassificazione) {
        this.analisiDiClassificazione = analisiDiClassificazione;
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
}

package com.project.manager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.manager.entity.Anagrafica;
import java.time.LocalDate;
import java.util.Date;

public class OffertaSmaltimentoDto {
    private Long id;
    @JsonProperty("ID_ANAGRAFICA")
    private Anagrafica idAnag;
    @JsonProperty("CODICE_FISCALE")
    private String codiceFiscale;
    @JsonProperty("DATA_INSERIMENTO")
    private LocalDate dataInserimento;
    @JsonProperty("PARTITA_IVA")
    private String partitaIva;
    @JsonProperty("CODICE_EER_CER")
    private String codiceEER;
    @JsonProperty("DESCRIZIONE_RIFIUTI")
    private String descrizioneRifiuto;
    @JsonProperty("SMALTIMENTO")
    private String smaltimento;
    @JsonProperty("TRASPORTO_CON_MOTRICE")
    private String trasportoConMotrice;
    @JsonProperty("TRASPORTO_CON_AUTOTRENO_BILICO")
    private String trasportoConAutotrenoBilico;
    @JsonProperty("EXTRA_SOSTA_DOPO_PRIMA_ORA_CARICO")
    private String extraSostaDopoLaPrimaOraDiCarico;
    @JsonProperty("QUOATA_MINIMA_FATTURABILE_FORMULARIO")
    private String quotaMinimaFatturabileFormulario;
    @JsonProperty("COMPILAZIONE_GESTIONE_FORMULARIO")
    private String compilazioneGestioneFormulario;
    @JsonProperty("ANALISI_DI_CLASSIFICAZIONE")
    private String analisiDiClassificazione;
    @JsonProperty("VALIDITA_OFFERTA")
    private Date validitaOfferta;
    @JsonProperty("CONDIZIONI_DI_PAGAMENTO")
    private String condizioniDiPagamento;
    @JsonProperty("DATA_FIRMA")
    private Date dataFirma;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("FIRMA_DIGITALE")
    private String firmaDigitale;

    public OffertaSmaltimentoDto() {
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

    public LocalDate getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(LocalDate dataInserimento) {
        this.dataInserimento = dataInserimento;
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

    public String getSmaltimento() {
        return smaltimento;
    }

    public void setSmaltimento(String smaltimento) {
        this.smaltimento = smaltimento;
    }

    public String getTrasportoConMotrice() {
        return trasportoConMotrice;
    }

    public void setTrasportoConMotrice(String trasportoConMotrice) {
        this.trasportoConMotrice = trasportoConMotrice;
    }

    public String getTrasportoConAutotrenoBilico() {
        return trasportoConAutotrenoBilico;
    }

    public void setTrasportoConAutotrenoBilico(String trasportoConAutotrenoBilico) {
        this.trasportoConAutotrenoBilico = trasportoConAutotrenoBilico;
    }

    public String getExtraSostaDopoLaPrimaOraDiCarico() {
        return extraSostaDopoLaPrimaOraDiCarico;
    }

    public void setExtraSostaDopoLaPrimaOraDiCarico(String extraSostaDopoLaPrimaOraDiCarico) {
        this.extraSostaDopoLaPrimaOraDiCarico = extraSostaDopoLaPrimaOraDiCarico;
    }

    public String getQuotaMinimaFatturabileFormulario() {
        return quotaMinimaFatturabileFormulario;
    }

    public void setQuotaMinimaFatturabileFormulario(String quotaMinimaFatturabileFormulario) {
        this.quotaMinimaFatturabileFormulario = quotaMinimaFatturabileFormulario;
    }

    public String getCompilazioneGestioneFormulario() {
        return compilazioneGestioneFormulario;
    }

    public void setCompilazioneGestioneFormulario(String compilazioneGestioneFormulario) {
        this.compilazioneGestioneFormulario = compilazioneGestioneFormulario;
    }

    public String getAnalisiDiClassificazione() {
        return analisiDiClassificazione;
    }

    public void setAnalisiDiClassificazione(String analisiDiClassificazione) {
        this.analisiDiClassificazione = analisiDiClassificazione;
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
}

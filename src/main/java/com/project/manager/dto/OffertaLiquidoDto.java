package com.project.manager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.manager.entity.Anagrafica;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class OffertaLiquidoDto {
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

    @JsonProperty("TRASPORTO_CON_MOTRICE_CISTERNA")
    private String trasportoConMotriceCisterna;
    @JsonProperty("TRASPORTO_CON_AUTOTRENO_BILICO")
    private String trasportoConAutotrenoBilico;
    @JsonProperty("EXTRA_SOSTA_DOPO_PRIMA_ORA_CARICO")
    private String extraSostaDopoLaPrimaOraDiCarico;
    @JsonProperty("UTILIZZO_CANAL_JET")
    private String utilizzoCanalJet;
    @JsonProperty("IMPIEGO_SECONDO_OPERATORE")
    private String impiegoSecondoOperatore;
    @JsonProperty("QUOATA_MINIMA_FATTURABILE")
    private String quotaMinimaFatturabile;
    @JsonProperty("COMPILAZIONE_GESTIONE_FORMULARIO")
    private String compilazioneGestioneFormulario;
    @JsonProperty("ANALISI_DI_OMOLOGO")
    private String analisiDiOmologo;
    @JsonProperty("VALIDITA_OFFERTA")
    private Date validitaOfferta;
    @JsonProperty("CONDIZIONI_DI_PAGAMENTO")
    private String condizioniDiPagamento;
    @JsonProperty("ANALISI_DI_OMOLOGA")
    private String analisiDiOmologa;
    @JsonProperty(value = "DATA_FIRMA", required = true)
    private Date dataFirma;
    @JsonProperty("FIRMA_DIGITALE")
    private String firmaDigitale;

    public OffertaLiquidoDto() {
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

    public String getTrasportoConMotriceCisterna() {
        return trasportoConMotriceCisterna;
    }

    public void setTrasportoConMotriceCisterna(String trasportoConMotriceCisterna) {
        this.trasportoConMotriceCisterna = trasportoConMotriceCisterna;
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

    public String getUtilizzoCanalJet() {
        return utilizzoCanalJet;
    }

    public void setUtilizzoCanalJet(String utilizzoCanalJet) {
        this.utilizzoCanalJet = utilizzoCanalJet;
    }

    public String getImpiegoSecondoOperatore() {
        return impiegoSecondoOperatore;
    }

    public void setImpiegoSecondoOperatore(String impiegoSecondoOperatore) {
        this.impiegoSecondoOperatore = impiegoSecondoOperatore;
    }

    public String getQuotaMinimaFatturabile() {
        return quotaMinimaFatturabile;
    }

    public void setQuotaMinimaFatturabile(String quotaMinimaFatturabile) {
        this.quotaMinimaFatturabile = quotaMinimaFatturabile;
    }

    public String getCompilazioneGestioneFormulario() {
        return compilazioneGestioneFormulario;
    }

    public void setCompilazioneGestioneFormulario(String compilazioneGestioneFormulario) {
        this.compilazioneGestioneFormulario = compilazioneGestioneFormulario;
    }

    public String getAnalisiDiOmologo() {
        return analisiDiOmologo;
    }

    public void setAnalisiDiOmologo(String analisiDiOmologo) {
        this.analisiDiOmologo = analisiDiOmologo;
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

    public String getAnalisiDiOmologa() {
        return analisiDiOmologa;
    }

    public void setAnalisiDiOmologa(String analisiDiOmologa) {
        this.analisiDiOmologa = analisiDiOmologa;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.project.manager.resource;

import com.project.manager.entity.Anagrafica;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OffertaLiquidoResponse  {


    private Anagrafica idAnag;
    private String codiceFiscale;
    private String partitaIva;
    private String codiceEER;
    private String descrizioneRifiuto;
    private LocalDateTime dataInserimento;
    private String trasportoConMotriceCisterna;
    private String trasportoConAutotrenoBilico;
    private String extraSostaDopoLaPrimaOraDiCarico;
    private String utilizzoCanalJet;
    private String impiegoSecondoOperatore;
    private String quotaMinimaFatturabile;
    private String compilazioneGestioneFormulario;
    private String analisiDiOmologo;
    private LocalDate validitaOfferta;
    private String condizioniDiPagamento;
    private String analisiDiOmologa;
    private LocalDate dataFirma;
    private String firmaDigitale;

    public OffertaLiquidoResponse() {
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

    public String getAnalisiDiOmologa() {
        return analisiDiOmologa;
    }

    public void setAnalisiDiOmologa(String analisiDiOmologa) {
        this.analisiDiOmologa = analisiDiOmologa;
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

    @Override
    public String toString() {
        return "OffertaLiquidoResponse{" +
                "idAnag=" + idAnag +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", codiceEER='" + codiceEER + '\'' +
                ", descrizioneRifiuto='" + descrizioneRifiuto + '\'' +
                ", dataInserimento=" + dataInserimento +
                ", trasportoConMotriceCisterna='" + trasportoConMotriceCisterna + '\'' +
                ", trasportoConAutotrenoBilico='" + trasportoConAutotrenoBilico + '\'' +
                ", extraSostaDopoLaPrimaOraDiCarico='" + extraSostaDopoLaPrimaOraDiCarico + '\'' +
                ", utilizzoCanalJet='" + utilizzoCanalJet + '\'' +
                ", impiegoSecondoOperatore='" + impiegoSecondoOperatore + '\'' +
                ", quotaMinimaFatturabile='" + quotaMinimaFatturabile + '\'' +
                ", compilazioneGestioneFormulario='" + compilazioneGestioneFormulario + '\'' +
                ", analisiDiOmologo='" + analisiDiOmologo + '\'' +
                ", validitaOfferta=" + validitaOfferta +
                ", condizioniDiPagamento='" + condizioniDiPagamento + '\'' +
                ", analisiDiOmologa='" + analisiDiOmologa + '\'' +
                ", dataFirma=" + dataFirma +
                ", firmaDigitale='" + firmaDigitale + '\'' +
                '}';
    }
}

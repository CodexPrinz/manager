package com.project.manager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.manager.entity.Anagrafica;

import java.time.LocalDate;
import java.util.Date;

public class OffertaSolidoDto {
    private Long id;
    private Anagrafica idAnag;
    private String codiceFiscale;
    private String partitaIva;
    private String codiceEER;
    private String descrizioneRifiuto;
    private String extraSostaDopoLaPrimaOraDiCarico;
    private String quotaMinimaFatturabileFormulario;
    private String compilazioneGestioneFormulario;
    private LocalDate validitaOfferta;
    private String condizioniDiPagamento;
    private String analisiDiOmologa;
    private LocalDate dataFirma;
    private String firmaDigitale;

    public OffertaSolidoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

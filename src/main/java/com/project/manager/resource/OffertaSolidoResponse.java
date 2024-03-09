package com.project.manager.resource;


import com.project.manager.entity.Anagrafica;
import jakarta.persistence.Column;

import java.util.Date;

public class OffertaSolidoResponse  {
    private Anagrafica idAnag;
    private String codiceFiscale;
    private String partitaIva;
    private String codiceEER;
    private String descrizioneRifiuto;
    private String extraSostaDopoLaPrimaOraDiCarico;
    private String quotaMinimaFatturabileFormulario;
    private String compilazioneGestioneFormulario;
    private Date validitaOfferta;
    private String condizioniDiPagamento;
    private String analisiDiOmologa;
    @Column(name = "DATA_FIRMA")
    private Date dataFirma;



    public OffertaSolidoResponse() {
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

    @Override
    public String toString() {
        return "OffertaSolidoResponse{" +
                "idAnag=" + idAnag +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", codiceEER='" + codiceEER + '\'' +
                ", descrizioneRifiuto='" + descrizioneRifiuto + '\'' +
                ", extraSostaDopoLaPrimaOraDiCarico='" + extraSostaDopoLaPrimaOraDiCarico + '\'' +
                ", quotaMinimaFatturabileFormulario='" + quotaMinimaFatturabileFormulario + '\'' +
                ", compilazioneGestioneFormulario='" + compilazioneGestioneFormulario + '\'' +
                ", validitaOfferta=" + validitaOfferta +
                ", condizioniDiPagamento='" + condizioniDiPagamento + '\'' +
                ", analisiDiOmologa='" + analisiDiOmologa + '\'' +
                ", dataFirma=" + dataFirma +
                '}';
    }
}

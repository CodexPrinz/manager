package com.project.manager.resource;


import com.project.manager.entity.Anagrafica;

import java.time.LocalDate;
import java.util.Date;

public class OffertaSmaltimentoResponse  {


    private Long id;
    private Anagrafica idAnag;
    private String codiceFiscale;
    private LocalDate dataInserimento;
    private String partitaIva;
    private String codiceEER;
    private String descrizioneRifiuto;
    private String smaltimento;
    private String trasportoConMotrice;
    private String trasportoConAutotrenoBilico;
    private String extraSostaDopoLaPrimaOraDiCarico;
    private String quotaMinimaFatturabileFormulario;
    private String compilazioneGestioneFormulario;
    private String analisiDiClassificazione;
    private Date validitaOfferta;
    private String condizioniDiPagamento;
    private Date dataFirma;

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
    public LocalDate getDataInserimento() {
        return dataInserimento;
    }
    public void setDataInserimento(LocalDate dataInserimento) {
        this.dataInserimento = dataInserimento;
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

    public Anagrafica getIdAnag() {
        return idAnag;
    }
    public void setIdAnag(Anagrafica idAnag) {
        this.idAnag = idAnag;
    }
    public Date getDataFirma() {
        return dataFirma;
    }
    public void setDataFirma(Date dataFirma) {
        this.dataFirma = dataFirma;
    }

    public OffertaSmaltimentoResponse() {
    }

    @Override
    public String toString() {
        return "OffertaSmaltimentoResponse{" +
                "id=" + id +
                ", idAnag=" + idAnag +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", dataInserimento=" + dataInserimento +
                ", partitaIva='" + partitaIva + '\'' +
                ", codiceEER='" + codiceEER + '\'' +
                ", descrizioneRifiuto='" + descrizioneRifiuto + '\'' +
                ", smaltimento='" + smaltimento + '\'' +
                ", trasportoConMotrice='" + trasportoConMotrice + '\'' +
                ", trasportoConAutotrenoBilico='" + trasportoConAutotrenoBilico + '\'' +
                ", extraSostaDopoLaPrimaOraDiCarico='" + extraSostaDopoLaPrimaOraDiCarico + '\'' +
                ", quotaMinimaFatturabileFormulario='" + quotaMinimaFatturabileFormulario + '\'' +
                ", compilazioneGestioneFormulario='" + compilazioneGestioneFormulario + '\'' +
                ", analisiDiClassificazione='" + analisiDiClassificazione + '\'' +
                ", validitaOfferta=" + validitaOfferta +
                ", condizioniDiPagamento='" + condizioniDiPagamento + '\'' +
                ", dataFirma=" + dataFirma +
                '}';
    }
}

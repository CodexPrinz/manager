package com.project.manager.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFFERTA_SMALTIMENTO")
public class OffertaSmaltimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ID_ANAGRAFICA")
    private Long id_anag;
    @Column(name = "CODICE_EER_CER")
    private String codiceEER;
    @Column(name = "DESCRIZIONE_RIFIUTI")
    private String descrizioneRifiuto;
    @Column(name = "SMALTIMENTO")
    private String smaltimento;
    @Column(name = "TRASPORTO_CON_MOTRICE")
    private String trasportoConMotrice;
    @Column(name = "TRASPORTO_CON_AUTOTRENO_BILICO")
    private String trasportoConAutotrenoBilico;
    @Column(name = "EXTRA_SOSTA_DOPO_PRIMA_ORA_CARICO")
    private String extraSostaDopoLaPrimaOraDiCarico;
    @Column(name = "QUOATA_MINIMA_FATTURABILE_FORMULARIO")
    private String quotaMinimaFatturabileFormulario;
    @Column(name = "COMPILAZIONE_GESTIONE_FORMULARIO")
    private String compilazioneGestioneFormulario;
    @Column(name = "ANALISI_DI_CLASSIFICAZIONE")
    private String analisiDiClassificazione;
    @Column(name = "VALIDITA_OFFERTA")
    private Date validitaOfferta;
    @Column(name = "CONDIZIONI_DI_PAGAMENTO")
    private String condizioniDiPagamento;
    @Column(name = "DATA_FIRMA")
    private Date dataFirma;
    @Column(name = "FIRMA_DIGITALE")
    private String firmaDigitale;
    @Column(name = "DATA_INSERIMENTO")
    private Date dataInserimento;
    
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
    public Date getDataInserimento() {
        return dataInserimento;
    }
    public void setDataInserimento(Date dataInserimento) {
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
    
    @Override
    public String toString() {
        return "OffertaSmaltimento [id=" + id + ", id_anag=" + id_anag + ", codiceEER=" + codiceEER
                + ", descrizioneRifiuto=" + descrizioneRifiuto + ", smaltimento=" + smaltimento
                + ", trasportoConMotrice=" + trasportoConMotrice + ", trasportoConAutotrenoBilico="
                + trasportoConAutotrenoBilico + ", extraSostaDopoLaPrimaOraDiCarico=" + extraSostaDopoLaPrimaOraDiCarico
                + ", quotaMinimaFatturabileFormulario=" + quotaMinimaFatturabileFormulario
                + ", compilazioneGestioneFormulario=" + compilazioneGestioneFormulario + ", analisiDiClassificazione="
                + analisiDiClassificazione + ", validitaOfferta=" + validitaOfferta + ", condizioniDiPagamento="
                + condizioniDiPagamento + ", dataFirma=" + dataFirma + ", firmaDigitale=" + firmaDigitale
                + ", dataInserimento=" + dataInserimento + "]";
    }
    public Long getId_anag() {
        return id_anag;
    }
    public void setId_anag(Long id_anag) {
        this.id_anag = id_anag;
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
    public OffertaSmaltimento() {
    }
    
    
}

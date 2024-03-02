package com.project.manager.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "OFFERTE_SOLIDO")
public class OffertaSolido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODICE_EER_CER")
    private String codiceEER;
    @Column(name = "DESCRIZIONE_RIFIUTI")
    private String descrizioneRifiuto;
    @Column(name = "EXTRA_SOSTA_DOPO_PRIMA_ORA_CARICO")
    private String extraSostaDopoLaPrimaOraDiCarico;
    @Column(name = "QUOATA_MINIMA_FATTURABILE_FORMULARIO")
    private String quotaMinimaFatturabileFormulario;
    @Column(name = "COMPILAZIONE_GESTIONE_FORMULARIO")
    private String compilazioneGestioneFormulario;
    @Column(name = "VALIDITA_OFFERTA")
    private Date validitaOfferta;
    @Column(name = "CONDIZIONI_DI_PAGAMENTO")
    private String condizioniDiPagamento;
    @Column(name = "ANALISI_DI_OMOLOGA")
    private String analisiDiOmologa;
    @Column(name = "DATA_FIRMA")
    private Date dataFirma;
    @Column(name = "FIRMA_DIGITALE")
    private String firmaDigitale;
    @Column(name = "DATA_INSERIMENTO")
    private Date dataInserimento;
    

    public OffertaSolido() {
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

    @Override
    public String toString() {
        return "OffertaSolido [id=" + id + ", codiceEER=" + codiceEER + ", descrizioneRifiuto=" + descrizioneRifiuto
                + ", extraSostaDopoLaPrimaOraDiCarico=" + extraSostaDopoLaPrimaOraDiCarico
                + ", quotaMinimaFatturabileFormulario=" + quotaMinimaFatturabileFormulario
                + ", compilazioneGestioneFormulario=" + compilazioneGestioneFormulario + ", validitaOfferta="
                + validitaOfferta + ", condizioniDiPagamento=" + condizioniDiPagamento + ", analisiDiOmologa="
                + analisiDiOmologa + ", dataFirma=" + dataFirma + ", firmaDigitale=" + firmaDigitale
                + ", dataInserimento=" + dataInserimento + "]";
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

    public Date getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(Date dataInserimento) {
        this.dataInserimento = dataInserimento;
    }
}

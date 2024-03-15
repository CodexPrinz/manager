package com.project.manager.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "OFFERTA_SMALTIMENTO")
public class OffertaSmaltimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "ID_ANAGRAFICA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Anagrafica idAnag;
    @Column(name = "CODICE_FISCALE")
    private String codiceFiscale;
    @Column(name = "DATA_INSERIMENTO")
    private LocalDateTime dataInserimento;
    @Column(name = "PARTITA_IVA")
    private String partitaIva;
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

    @Override
    public String toString() {
        return "OffertaSmaltimento{" +
                "id=" + id +
                ", id_anag=" + idAnag +
                ", codiceFiscale='" + codiceFiscale + '\'' +
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
                ", firmaDigitale='" + firmaDigitale + '\'' +
                ", dataInserimento=" + dataInserimento +
                '}';
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
    public LocalDateTime getDataInserimento() {
        return dataInserimento;
    }
    public void setDataInserimento() {
        this.dataInserimento = LocalDateTime.now();
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
    public String getFirmaDigitale() {
        return firmaDigitale;
        
    }
    public void setFirmaDigitale(String firmaDigitale) {
        this.firmaDigitale = firmaDigitale;
    }
    public OffertaSmaltimento() {
    }
    
    
}

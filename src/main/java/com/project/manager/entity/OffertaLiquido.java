package com.project.manager.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "OFFERTE_LIQUIDO")
public class OffertaLiquido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "ID_ANAGRAFICA")
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Anagrafica idAnag;
    @Column(name = "CODICE_FISCALE")
    private String codiceFiscale;
    @Column(name = "PARTITA_IVA")
    private String partitaIva;
    @Column(name = "CODICE_EER_CER")
    private String codiceEER;
    @Column(name = "DESCRIZIONE_RIFIUTI")
    private String descrizioneRifiuto;

    @Column(name = "TRASPORTO_CON_MOTRICE_CISTERNA")
    private String trasportoConMotriceCisterna;
    @Column(name = "TRASPORTO_CON_AUTOTRENO_BILICO")
    private String trasportoConAutotrenoBilico;
    @Column(name = "EXTRA_SOSTA_DOPO_PRIMA_ORA_CARICO")
    private String extraSostaDopoLaPrimaOraDiCarico;
    @Column(name = "UTILIZZO_CANAL_JET")
    private String utilizzoCanalJet;
    @Column(name = "IMPIEGO_SECONDO_OPERATORE")
    private String impiegoSecondoOperatore;
    @Column(name = "QUOATA_MINIMA_FATTURABILE")
    private String quotaMinimaFatturabile;
    @Column(name = "COMPILAZIONE_GESTIONE_FORMULARIO")
    private String compilazioneGestioneFormulario;
    @Column(name = "ANALISI_DI_OMOLOGO")
    private String analisiDiOmologo;
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
    @CreatedDate
    private LocalDate dataInserimento;

    public OffertaLiquido() {
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

    @Override
    public String toString() {
        return "OffertaLiquido{" +
                "id=" + id +
                ", id_anag=" + idAnag +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", codiceEER='" + codiceEER + '\'' +
                ", descrizioneRifiuto='" + descrizioneRifiuto + '\'' +
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
                ", dataInserimento=" + dataInserimento +
                '}';
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

    public String getFirmaDigitale() {
        return firmaDigitale;
    }

    public void setFirmaDigitale(String firmaDigitale) {
        this.firmaDigitale = firmaDigitale;
    }

    public LocalDate getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(LocalDate dataInserimento) {
        this.dataInserimento = dataInserimento;
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Anagrafica getIdAnag() {
        return idAnag;
    }

    public void setIdAnag(Anagrafica idAnag) {
        this.idAnag = idAnag;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }
}

package com.project.manager.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ANAGRAFICHE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Anagrafica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODICE_FISCALE")
    @NotBlank
    private String codiceFiscale;
    @Column(name = "PARTITA_IVA")
    private String partitaIva;
    @Column(name = "RAGIONE_SOCIALE")
    private String ragioneSociale;
    @Column(name = "SEDE_LEGALE")
    private String sedeLegale;
    @Column(name = "TELEFONO")
    @NotBlank(message = "Manco il numero telefono")
    private Integer telefone;
    @Column(name = "PERSONA_DI_RIFERIMENTO")
    private String perosnaDiRiferimento;
    @Column(name = "EMAIL")
    @Email
    @NotBlank(message = "Manca l'indirizzo mail")
    private String email;
    @Column(name = "INDIRIZZO_PEC")
    @Email
    private String indirizzoPec;
    @Column(name = "CODICE_UNIVOCO")
    @NotBlank
    private String codiceUnivoco;
    @Column(name = "CODICE_ATECO")
    private String codiceAteco;
    @Column(name = "MODALIATA_DI_PAGAMENTO")
    private String modalitaDiPagamento;
    @Column(name = "SCADENZA")
    private Date scadenza;
    @Column(name = "BANCA")
    private String banca;
    @Column(name = "ABI")
    private Integer abi;
    @Column(name = "CAB")
    private Integer cab;
    @Column(name = "DATA_INSERIMENTO")
    @CreatedDate
    private LocalDate dataInserimento;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "idAnag")
    @Column(name = "analisi")
    private List<OffertaAnalisi> offertaAnalisiList;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "idAnag")
    @Column(name = "liquido")
    private List<OffertaLiquido> offertaLiquidoList;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "idAnag")
    @Column(name = "solido")
    private List<OffertaSolido> offertaSolidoList;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "idAnag")
    @Column(name = "smaltimento")
    private List<OffertaSmaltimento> offertaSmaltimentoList;

    public Anagrafica() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getSedeLegale() {
        return sedeLegale;
    }

    public void setSedeLegale(String sedeLegale) {
        this.sedeLegale = sedeLegale;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getPerosnaDiRiferimento() {
        return perosnaDiRiferimento;
    }

    public void setPerosnaDiRiferimento(String perosnaDiRiferimento) {
        this.perosnaDiRiferimento = perosnaDiRiferimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndirizzoPec() {
        return indirizzoPec;
    }

    public void setIndirizzoPec(String indirizzoPec) {
        this.indirizzoPec = indirizzoPec;
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

    public String getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public void setCodiceUnivoco(String codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public String getCodiceAteco() {
        return codiceAteco;
    }

    public void setCodiceAteco(String codiceAteco) {
        this.codiceAteco = codiceAteco;
    }

    public String getModalitaDiPagamento() {
        return modalitaDiPagamento;
    }

    public void setModalitaDiPagamento(String modalitaDiPagamento) {
        this.modalitaDiPagamento = modalitaDiPagamento;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public String getBanca() {
        return banca;
    }

    public void setBanca(String banca) {
        this.banca = banca;
    }

    public Integer getAbi() {
        return abi;
    }

    public void setAbi(Integer abi) {
        this.abi = abi;
    }

    public Integer getCab() {
        return cab;
    }

    public void setCab(Integer cab) {
        this.cab = cab;
    }

    public LocalDate getDataInserimento() {
        return dataInserimento;
    }

    public List<OffertaAnalisi> getOffertaAnalisiList() {
        return offertaAnalisiList;
    }

    public void setOffertaAnalisiList(List<OffertaAnalisi> offertaAnalisiList) {
        this.offertaAnalisiList = offertaAnalisiList;
    }

    public void setDataInserimento(LocalDate dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public List<OffertaLiquido> getOffertaLiquidoList() {
        return offertaLiquidoList;
    }

    @Override
    public String toString() {
        return "Anagrafica{" +
                "id=" + id +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", ragioneSociale='" + ragioneSociale + '\'' +
                ", sedeLegale='" + sedeLegale + '\'' +
                ", telefone=" + telefone +
                ", perosnaDiRiferimento='" + perosnaDiRiferimento + '\'' +
                ", email='" + email + '\'' +
                ", indirizzoPec='" + indirizzoPec + '\'' +
                ", codiceUnivoco='" + codiceUnivoco + '\'' +
                ", codiceAteco='" + codiceAteco + '\'' +
                ", modalitaDiPagamento='" + modalitaDiPagamento + '\'' +
                ", scadenza=" + scadenza +
                ", banca='" + banca + '\'' +
                ", abi=" + abi +
                ", cab=" + cab +
                ", dataInserimento=" + dataInserimento +
                ", offertaAnalisiList=" + offertaAnalisiList +
                ", offertaLiquidoList=" + offertaLiquidoList +
                ", offertaSolidoList=" + offertaSolidoList +
                ", offertaSmaltimentoList=" + offertaSmaltimentoList +
                '}';
    }

    public void setOffertaLiquidoList(List<OffertaLiquido> offertaLiquidoList) {
        this.offertaLiquidoList = offertaLiquidoList;
    }

    public List<OffertaSolido> getOffertaSolidoList() {
        return offertaSolidoList;
    }

    public void setOffertaSolidoList(List<OffertaSolido> offertaSolidoList) {
        this.offertaSolidoList = offertaSolidoList;
    }

    public List<OffertaSmaltimento> getOffertaSmaltimentoList() {
        return offertaSmaltimentoList;
    }

    public void setOffertaSmaltimentoList(List<OffertaSmaltimento> offertaSmaltimentoList) {
        this.offertaSmaltimentoList = offertaSmaltimentoList;
    }
}

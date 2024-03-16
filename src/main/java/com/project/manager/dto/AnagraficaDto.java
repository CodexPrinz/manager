package com.project.manager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Date;


public class AnagraficaDto {
    @Column(name = "ID")
    private Long id;
    @JsonProperty(value = "CODICE_FISCALE", required = true)
    private String codiceFiscale;
    @JsonProperty("PARTITA_IVA")
    private String partitaIva;
    @JsonProperty("RAGIONE_SOCIALE")
    private String ragioneSociale;
    @JsonProperty("SEDE_LEGALE")
    private String sedeLegale;
    @JsonProperty(value = "TELEFONO", required = true)
    @NotBlank(message = "Manco il numero telefono")
    private Integer telefone;
    @JsonProperty(value = "PERSONA_DI_RIFERIMENTO", required = true)
    private String perosnaDiRiferimento;
    @JsonProperty(value = "EMAIL", required = true)
    @Email
    @NotBlank(message = "Manca l'indirizzo mail")
    private String email;
    @JsonProperty("INDIRIZZO_PEC")
    @Email
    private String indirizzoPec;
    @JsonProperty(value = "CODICE_UNIVOCO", required = true)
    @NotBlank
    private String codiceUnivoco;
    @JsonProperty("CODICE_ATECO")
    private String codiceAteco;
    @JsonProperty("MODALIATA_DI_PAGAMENTO")
    private String modalitaDiPagamento;
    @JsonProperty("SCADENZA")
    private LocalDate scadenza;
    @JsonProperty("BANCA")
    private String banca;
    @JsonProperty("ABI")
    private Integer abi;
    @JsonProperty("CAB")
    private Integer cab;

    public AnagraficaDto() {
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

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

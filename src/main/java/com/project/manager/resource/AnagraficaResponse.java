package com.project.manager.resource;

import com.project.manager.entity.*;
;
import java.time.LocalDate;
import java.util.List;

public class AnagraficaResponse {
    private String codiceFiscale;
    private String partitaIva;
    private String ragioneSociale;
    private String sedeLegale;
    private Integer telefone;
    private String perosnaDiRiferimento;
    private String email;
    private String indirizzoPec;
    private String codiceUnivoco;
    private String codiceAteco;
    private String modalitaDiPagamento;
    private LocalDate scadenza;
    private String banca;
    private Integer abi;
    private Integer cab;
    private List<OffertaAnalisi> offertaAnalisiList;

    private List<OffertaLiquido> offertaLiquidoList;

    private List<OffertaSolido> offertaSolidoList;

    private List<OffertaSmaltimento> offertaSmaltimentoList;

    private List<Attachment> attachmentList;

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

    public List<OffertaAnalisi> getOffertaAnalisiList() {
        return offertaAnalisiList;
    }

    public void setOffertaAnalisiList(List<OffertaAnalisi> offertaAnalisiList) {
        this.offertaAnalisiList = offertaAnalisiList;
    }

    public List<OffertaLiquido> getOffertaLiquidoList() {
        return offertaLiquidoList;
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

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<Attachment> attachmentList) {
        this.attachmentList = attachmentList;
    }

    @Override
    public String toString() {
        return "anagraficaResponse{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
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
                ", offertaAnalisiList=" + offertaAnalisiList +
                ", offertaLiquidoList=" + offertaLiquidoList +
                ", offertaSolidoList=" + offertaSolidoList +
                ", offertaSmaltimentoList=" + offertaSmaltimentoList +
                ", attachmentList=" + attachmentList +
                '}';
    }
}

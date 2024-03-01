package com.project.manager.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "OFFERTE")
public class Offerta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODICE_EER_CER")
    private String codiceEER;
    @Column(name = "DESCRIZIONE_RIFIUTI")
    private String descrizioneRifiuto;
    @Column(name = "SERVIZI_AGGIUNTIVI")
    private List<ServiziAggiuntivi> serviziAggiuntiviList;
    @Column(name = "VALIDITA_OFFERTA")
    private Date validitaOfferta;
    @Column(name = "CONDIZIONI_DI_PAGAMENTO")
    private String condizioniDiPagamento;

    public Offerta() {
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

    public List<ServiziAggiuntivi> getServiziAggiuntiviList() {
        return serviziAggiuntiviList;
    }

    public void setServiziAggiuntiviList(List<ServiziAggiuntivi> serviziAggiuntiviList) {
        this.serviziAggiuntiviList = serviziAggiuntiviList;
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
        return "Offerta{" +
                "id=" + id +
                ", codiceEER='" + codiceEER + '\'' +
                ", descrizioneRifiuto='" + descrizioneRifiuto + '\'' +
                ", serviziAggiuntiviList=" + serviziAggiuntiviList +
                ", validitaOfferta=" + validitaOfferta +
                ", condizioniDiPagamento='" + condizioniDiPagamento + '\'' +
                '}';
    }
}

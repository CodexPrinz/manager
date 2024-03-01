package com.project.manager.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "SERVIZI_AGGIUNTIVI")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ServiziAggiuntivi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ANALISI_DI_CLASSIFICAZIONE")
    private String analisiDiClassificazione;
    @Column(name = "UNITA_MISURA")
    private  String unitaDiMisura;

    public ServiziAggiuntivi() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnalisiDiClassificazione() {
        return analisiDiClassificazione;
    }

    public void setAnalisiDiClassificazione(String analisiDiClassificazione) {
        this.analisiDiClassificazione = analisiDiClassificazione;
    }

    public String getUnitaDiMisura() {
        return unitaDiMisura;
    }

    public void setUnitaDiMisura(String unitaDiMisura) {
        this.unitaDiMisura = unitaDiMisura;
    }

    @Override
    public String toString() {
        return "ServiziAggiuntivi{" +
                "id=" + id +
                ", analisiDiClassificazione='" + analisiDiClassificazione + '\'' +
                ", unitaDiMisura='" + unitaDiMisura + '\'' +
                '}';
    }
}

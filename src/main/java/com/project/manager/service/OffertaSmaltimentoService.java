package com.project.manager.service;

import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaLiquido;
import com.project.manager.entity.OffertaSmaltimento;

import java.util.List;

public interface OffertaSmaltimentoService {

    OffertaSmaltimento getOffertaSmaltimentoById(Long id);

    List<OffertaSmaltimento> getOffertaSmaltimentoByAnagId(Anagrafica anag);

    List<OffertaSmaltimento> getOffertaSmaltimentoByCF(String cf);

    List<OffertaSmaltimento> getOffertaSmaltimentoByPIva(String pIva);
    List<OffertaSmaltimento> getAll();
    void deleteOffertaSmaltimentoById(Long id);
    OffertaSmaltimento createOffertaSmaltimentoo(OffertaSmaltimento offertaSmaltimento);
    OffertaSmaltimento updateOffertaSmaltimento(OffertaSmaltimento offertaSmaltimento);
}

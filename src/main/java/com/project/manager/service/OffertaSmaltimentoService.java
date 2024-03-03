package com.project.manager.service;

import com.project.manager.entity.OffertaLiquido;
import com.project.manager.entity.OffertaSmaltimento;

import java.util.List;

public interface OffertaSmaltimentoService {

    OffertaSmaltimento getOffertaSmaltimentoById(Long id);

    List<OffertaSmaltimento> getOffertaSmaltimentoByAnagId(Long anagId);

    List<OffertaSmaltimento> getOffertaSmaltimentoByCF(String cf);

    List<OffertaSmaltimento> getOffertaSmaltimentoByPIva(String pIva);
    List<OffertaSmaltimento> getAll();
}

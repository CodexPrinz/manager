package com.project.manager.service;

import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaSmaltimentoDto;
import com.project.manager.resource.OffertaSmaltimentoResponse;

import java.util.List;

public interface OffertaSmaltimentoService {

    OffertaSmaltimentoResponse getOffertaSmaltimentoById(Long id);

    List<OffertaSmaltimentoResponse> getOffertaSmaltimentoByAnagId(AnagraficaDto anag);

    List<OffertaSmaltimentoResponse> getOffertaSmaltimentoByCF(String cf);

    List<OffertaSmaltimentoResponse> getOffertaSmaltimentoByPIva(String pIva);
    List<OffertaSmaltimentoResponse> getAll();
    void deleteOffertaSmaltimentoById(Long id);
    OffertaSmaltimentoResponse createOffertaSmaltimentoo(OffertaSmaltimentoDto offertaSmaltimento);
    OffertaSmaltimentoResponse updateOffertaSmaltimento(OffertaSmaltimentoDto offertaSmaltimento);
}

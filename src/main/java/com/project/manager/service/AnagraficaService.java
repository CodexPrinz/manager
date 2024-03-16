package com.project.manager.service;

import com.project.manager.dto.AnagraficaDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.resource.AnagraficaResponse;

import java.util.List;

public interface AnagraficaService {

    AnagraficaResponse getAnagraficaById(Long id);

    List<AnagraficaResponse> getAnagraficabyCF(String cf);

    List<AnagraficaResponse> getAnagraficaPIva(String pIva);

    AnagraficaResponse createAnagrafica(AnagraficaDto anagrafica);

    AnagraficaResponse updateAnagrafica(AnagraficaDto anagrafica);

    void deleteAnagraficaByid(Long id);

    List<AnagraficaResponse> getAll();
}

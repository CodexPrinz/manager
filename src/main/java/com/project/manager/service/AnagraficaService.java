package com.project.manager.service;

import com.project.manager.entity.Anagrafica;

import java.util.List;

public interface AnagraficaService {

    Anagrafica getAnagraficaById(Long id);

    List<Anagrafica> getAnagraficabyCF(String cf);

    List<Anagrafica> getAnagraficaPIva(String pIva);

    Anagrafica createAnagrafica(Anagrafica anagrafica);

    Anagrafica updateAnagrafica(Anagrafica anagrafica);

    void deleteAnagraficaByid(Long id);

    List<Anagrafica> getAll();
}

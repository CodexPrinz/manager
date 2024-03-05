package com.project.manager.service;

import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaSmaltimento;
import com.project.manager.entity.OffertaSolido;

import java.util.List;

public interface OffertaSolidaService {
    OffertaSolido getOffertaSolidoById(Long id);
    List<OffertaSolido> getOffertaSolidoByPIva(String pIva);
    List<OffertaSolido> getOffertaSolidoByCF(String cf);
    List<OffertaSolido> getOffertaSolidoByAnagId(Anagrafica anag);
    List<OffertaSolido> getAll();
    void deleteOffertaSolidoById(Long id);
    OffertaSolido createOffertaSolido(OffertaSolido offertaSolido);
    OffertaSolido updateOffertaSolido(OffertaSolido offertaSolido);

}

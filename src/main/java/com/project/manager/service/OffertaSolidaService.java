package com.project.manager.service;

import com.project.manager.entity.OffertaSolido;

import java.util.List;

public interface OffertaSolidaService {
    OffertaSolido getOffertaSolidoById(Long id);
    List<OffertaSolido> getOffertaSolidoByPIva(String pIva);
    List<OffertaSolido> getOffertaSolidoByCF(String cf);
    List<OffertaSolido> getOffertaSolidoByAnagId(Long anagId);
    List<OffertaSolido> getAll();

}

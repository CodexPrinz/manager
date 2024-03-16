package com.project.manager.controller;

import com.project.manager.controller.AnagraficaController;
import com.project.manager.dto.AnagraficaDto;
import com.project.manager.resource.AnagraficaResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AnagraficaControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private AnagraficaController controller;
    private AnagraficaDto dto;
    @BeforeEach
    public void createAnagrafica(){
        dto = new AnagraficaDto();
        dto.setCodiceFiscale("ABCDEF12G34H567I");
        dto.setPartitaIva("01234567890");
        dto.setRagioneSociale("Example Srl");
        dto.setSedeLegale("Via Roma, 1, 00100 Roma RM");
        dto.setTelefone(1234567890);
        dto.setPerosnaDiRiferimento("Mario Rossi");
        dto.setEmail("example@example.com");
        dto.setIndirizzoPec("example@pec.it");
        dto.setCodiceUnivoco("UNIVOCO123");
        dto.setCodiceAteco("ATECO123");
        dto.setModalitaDiPagamento("Bonifico bancario");
        dto.setScadenza(LocalDate.parse("2024-03-15"));
        dto.setBanca("Banca Example");
        dto.setAbi(12345);
        dto.setCab(67890);


    }

    @Test
    public void testCreateAnagrafica(){
        ResponseEntity<AnagraficaResponse> reponse = controller.createAnagrafica(dto);
        System.out.println(reponse.toString());
    }

    @Test
    public void testCreateAnagrafica2(){
        String anagraficaJson = "{\n" +
                "  \"id\": 1,\n" +
                "  \"codiceFiscale\": \"ABCDEF12G34H567I\",\n" +
                "  \"partitaIva\": \"01234567890\",\n" +
                "  \"ragioneSociale\": \"Example Srl\",\n" +
                "  \"sedeLegale\": \"Via Roma, 1, 00100 Roma RM\",\n" +
                "  \"telefone\": 1234567890,\n" +
                "  \"perosnaDiRiferimento\": \"Mario Rossi\",\n" +
                "  \"email\": \"example@example.com\",\n" +
                "  \"indirizzoPec\": \"example@pec.it\",\n" +
                "  \"codiceUnivoco\": \"UNIVOCO123\",\n" +
                "  \"codiceAteco\": \"ATECO123\",\n" +
                "  \"modalitaDiPagamento\": \"Bonifico bancario\",\n" +
                "  \"scadenza\": \"2024-03-15\",\n" +
                "  \"banca\": \"Banca Example\",\n" +
                "  \"abi\": 12345,\n" +
                "  \"cab\": 67890,\n" +
                "  \"dataInserimento\": \"2024-03-15T20:48:20\",\n" +
                "  \"offertaAnalisiList\": [],\n" +
                "  \"offertaLiquidoList\": [],\n" +
                "  \"offertaSolidoList\": [],\n" +
                "  \"offertaSmaltimentoList\": [],\n" +
                "  \"attachmentList\": []\n" +
                "}";

        try {
            mockMvc.perform(MockMvcRequestBuilders
                            .post("/api/v1/anagrafica/")
                            .content(anagraficaJson)
                            .contentType(MediaType.APPLICATION_JSON_VALUE)
                            .accept(MediaType.APPLICATION_JSON_VALUE))
                    .andExpect(status().isCreated());


            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}

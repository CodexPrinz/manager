package controller;

import com.project.manager.controller.AnagraficaController;
import com.project.manager.dto.AnagraficaDto;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class AnagraficaControllerTest {

    @Autowired
    private AnagraficaController controller;

    @BeforeAll
    public static void createAnagrafica(){
        AnagraficaDto dto = new AnagraficaDto();
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

}

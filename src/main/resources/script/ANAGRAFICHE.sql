CREATE TABLE ANAGRAFICHE (
    ID INT AUTO_INCREMENT,
    CODICE_FISCALE VARCHAR(255) NOT NULL,
    PARTITA_IVA VARCHAR(255),
    RAGIONE_SOCIALE VARCHAR(255),
    SEDE_LEGALE VARCHAR(255),
    TELEFONO INT NOT NULL,
    PERSONA_DI_RIFERIMENTO VARCHAR(255),
    EMAIL VARCHAR(255) NOT NULL,
    INDIRIZZO_PEC VARCHAR(255),
    CODICE_UNIVOCO VARCHAR(255) NOT NULL,
    CODICE_ATECO VARCHAR(255),
    MODALIATA_DI_PAGAMENTO VARCHAR(255),
    SCADENZA DATE,
    BANCA VARCHAR(255),
    ABI INT,
    CAB INT,
    DATA_INSERIMENTO DATE,
    PRIMARY KEY (ID)
);

INSERT INTO ANAGRAFICHE (CODICE_FISCALE, TELEFONO, EMAIL, CODICE_UNIVOCO) VALUES ('CF1', 1234567890, 'email1@example.com', 'CU1');
INSERT INTO ANAGRAFICHE (CODICE_FISCALE, TELEFONO, EMAIL, CODICE_UNIVOCO) VALUES ('CF2', 2345678901, 'email2@example.com', 'CU2');
INSERT INTO ANAGRAFICHE (CODICE_FISCALE, TELEFONO, EMAIL, CODICE_UNIVOCO) VALUES ('CF3', 3456789012, 'email3@example.com', 'CU3');
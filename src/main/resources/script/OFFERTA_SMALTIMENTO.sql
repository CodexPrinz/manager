CREATE TABLE OFFERTA_SMALTIMENTO (
    ID INT AUTO_INCREMENT,
    ID_ANAGRAFICA INT,
    CODICE_FISCALE VARCHAR(255),
    DATA_INSERIMENTO DATE,
    PRIMARY KEY (ID)
);

INSERT INTO OFFERTA_SMALTIMENTO (ID_ANAGRAFICA, CODICE_FISCALE) VALUES (1, 'CF1');
INSERT INTO OFFERTA_SMALTIMENTO (ID_ANAGRAFICA, CODICE_FISCALE) VALUES (2, 'CF2');
INSERT INTO OFFERTA_SMALTIMENTO (ID_ANAGRAFICA, CODICE_FISCALE) VALUES (3, 'CF3');

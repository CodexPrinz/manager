package com.project.manager.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    String pattern = "^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$";
    public String codiceFiscale(String codice){
        if (codice.length() != 16) {
            return "Errore: Il codice fiscale deve essere lungo 16 caratteri.";
        }
        for (char c : codice.toCharArray()) {
            if (!Character.isUpperCase(c) && !Character.isDigit(c)) {
                return "Errore: Il codice fiscale può contenere solo lettere maiuscole e numeri.";
            }
        }

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(codice);

        if (m.find())
            return codice;
        else
            return "Errore: Il codice fiscale non è valido.";

    }
}

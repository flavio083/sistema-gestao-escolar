package utils;

import exceptions.NotaInvalidaException;

public class Validador {

    public static void validarNota(double nota)
            throws NotaInvalidaException {

        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException(
                    "Nota deve estar entre 0 e 10"
            );
        }
    }
}
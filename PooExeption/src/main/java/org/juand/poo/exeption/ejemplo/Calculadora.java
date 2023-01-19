package org.juand.poo.exeption.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int dividendo) throws DivisionPorZeroException {
        if (dividendo == 0){
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return (double) numerador/ (double) dividendo;
    }
}

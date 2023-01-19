package org.juand.poo.exeption.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorZeroException {
        if (divisor == 0){
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return (double) numerador/ (double) divisor;
    }

    public double dividir(String numerador, String divisor)
            throws DivisionPorZeroException, NumeroFormatoException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        }catch (NumberFormatException e){
            throw new NumeroFormatoException("Debe ingresar un numero en el numerador y divisor");
        }
    }
}

package Seccion12;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLenguaje = 0;

        claseLenguaje = new double[7];
        claseHistoria = new double[7];
        claseMatematicas = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese 7 notas de los estudiantes para Matematicas");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("ingrese 7 notas de los estudiantes para Historia");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("ingrese 7 notas de los estudiantes para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }
        double promedioMatematicas = (sumaNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumaNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumaNotasLenguaje / claseLenguaje.length);
        double promedioCurso = (promedioLenguaje + promedioHistoria + promedioMatematicas) / 3;

        System.out.println("Promedio de la clase de matematicas: " + promedioMatematicas);
        System.out.println("Promedio de la clase de Historia: " + promedioHistoria);
        System.out.println("Promedio de la clase de Lenguaje: " + promedioLenguaje);
        System.out.println("Promedio del curso es: " + promedioCurso);

        //Pedimos notas de un solo alumno
        System.out.println("Ingrese el identificador del alumno (de 0 - 6)");
        int id = scanner.nextInt();

        double notaMatematicas = claseMatematicas[id];
        double notaHistoria = claseHistoria[id];
        double notaLenguaje = claseLenguaje[id];
        double promedioAlumno = (claseMatematicas[id] + claseLenguaje[id] + claseHistoria[id]) / 3;

        System.out.println("Las notas de cada materia del estudiante " + id + " son:");
        System.out.println("Matematicas: " + notaMatematicas);
        System.out.println("Historia: " + notaHistoria);
        System.out.println("Lenguaje: " + notaLenguaje);
        System.out.println("El promedio del alumno es: " + promedioAlumno);




    }
}

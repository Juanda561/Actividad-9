/*
1. Se necesita implementar un sistema en el que se puedan cargar alumnos, a los cuales los caracterizan el nombre y 
apellido, el padrón, el sexo, condición (regular o condicional) y la nota final. Estos alumnos se deben cargar en una 
asignatura, llamada Algoritmos y Programacion III. 

Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación: 

a. Mostrar en pantalla todos los alumnos que se encuentren en la asignatura. 
b. Mostrar en pantalla los alumnos que se encuentren como condicional y su cantidad. 
c. Ordenar los alumnos de acuerdo a su nota (de mayor a menor) y mostrarlo en pantalla. 
d. Ordenar los alumnos de acuerdo a su nota (de menor a mayor) y mostrarlo en pantalla. 
e. Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla.
*/
package Ej1_Alumnos.vista;

import Ej1_Alumnos.modelo.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    
    public static void main(String[] args) {
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        Alumno a1 = new Alumno("Juan David", "Ayala", "Transver 28 #14-12", 'M' , "regular", 3);
        Alumno a2 = new Alumno("María Antonieta", "Manjarréz", "Calle 15 #14b14", 'F' , "condicional", 4);
        Alumno a3 = new Alumno("Loretha", "Mendez", "Calle 15 #14b14", 'F' , "condicional", 2);
        Alumno a4 = new Alumno("Laura", "Lopez", "Calle 13 #15b14", 'M' , "condicional", 4);
        Alumno a5 = new Alumno("Kairina", "Angarita", "Diagonal 15 #14b12", 'M' , "regular", 5);
        
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        
        imprimir(alumnos);
                
    }
    
    public static void imprimir(ArrayList list){
        //imprime todos los objetos que hay en el ArrayList
        System.out.println("*****Todos los alumnos de Programación II*****");
        for (Object aux: list) {
            System.out.println(aux);
        }
        System.out.println("----------------------------------");
        
        //Imprime los objetos del ArrayList, que su Condicion sea solamente condicional
        System.out.println("*****Alumnos en condicional*****");
        for (int i = 0; i <list.size(); i++) {
            condicional((Alumno) list.get(i));
        }
        System.out.println("----------------------------------");
        
        //Imprime todos los Objetos, pero ordenados de mayor a menor
        System.out.println("*****Ordenados por Nota, de mayor a menor*****");
        Collections.sort(list,Collections.reverseOrder());
        for (Object aux: list) {
            System.out.println(aux);
        }
        System.out.println("----------------------------------");
        
        //Imprime todos los Objetos, pero ordenados de menor a mayor
        System.out.println("*****Ordenados por Nota, de menor a mayor*****");
        Collections.sort(list);
        for (Object aux: list) {
            System.out.println(aux);
        }
        System.out.println("----------------------------------");
        
        //Imprime todos los objetos ordenados por nombre
        System.out.println("*****Ordenados por Nombre*****");
        Collections.sort(list, new Comparator<Alumno>(){
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.getNombre().compareTo(a2.getNombre());
            }
        
        });
        for (Object aux: list) {
            System.out.println(aux);
        }
        System.out.println("----------------------------------");

        //Imprime todos los objetos ordenados por apellido
        System.out.println("*****Ordenados por Apellido*****");
        Collections.sort(list, new Comparator<Alumno>(){
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.getApellido().compareTo(a2.getApellido());
            }
        });
        for (Object aux: list) {
            System.out.println(aux);
        }
        System.out.println("----------------------------------");
        
    }
    
    public static void condicional(Alumno a){
        if (a.getCondicion()=="condicional") {
            System.out.println(a.toString());
        }
    }   
    
    
}

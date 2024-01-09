package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Entradas
        Scanner leerDato = new Scanner(System.in);
        String nombreCliente;
        String paisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        //Pedimos los datos al usuario
        System.out.print("ingrese su nombre: ");
        nombreCliente = leerDato.nextLine();

        System.out.print("ingrese su pais: ");
        paisCliente = leerDato.nextLine();

        System.out.print("ingrese año de nacimiento: ");
        anoNacimientoCliente = leerDato.nextInt();

        System.out.print("ingrese mes de nacimiento: ");
        mesNacimientoCliente = leerDato.nextInt();

        System.out.print("ingrese dia de nacimiento: ");
        diaNacimientoCliente = leerDato.nextInt();

        //PROCESANDO LAS ENTRADAS
        //1. ¿Como calcular la edad del cliente?
        //restar el año actua menos el año de nacimiento
        int edadCliente = 2024 - anoNacimientoCliente;

        System.out.println("su edad es: " + edadCliente);

        //2. Decidir con base en la edad si el cliente es mayor de edad
        if (edadCliente >= 18) {
            System.out.println("Usted es mayor de edad");
            //menu de licores
            System.out.println("1... Botella aguardiente antioqueño --- $150 COP");
            //botella de guaro--150
            //botella de don julio--600
            //botella de blue label--1500
            //botella de jagger--200
        } else {
            System.out.println("usted es un niño, vayase a mimir");
        }
    }
}
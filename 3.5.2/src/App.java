import java.util.Scanner;

import utils.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Vendedor carlitVendedor = new Vendedor("Carlos", "Quintero", 18);
        //Vendedor yoyiVendedora = new Vendedor("Yolotzin", "Labastida", 19);
        System.out.println("Ingrese su nombre ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese su edad ");
        int edad = sc.nextInt();


        Vendedor vendedorBonito = new Vendedor(nombre, apellido, edad);
        vendedorBonito.imprimirValores();
        


    }
}

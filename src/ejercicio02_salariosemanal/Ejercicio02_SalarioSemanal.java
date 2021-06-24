/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02_salariosemanal;

import java.util.Scanner;

/**
 *
 * @author TOTTUS TRUJILLO
 */
public class Ejercicio02_SalarioSemanal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int hsem;
        double sh,salario;
        System.out.print("Ingresar horas semanales: ");
        hsem=entrada.nextInt();
        System.out.print("Ingresar salario por hora: ");
        sh=entrada.nextDouble();
        salario= hsem*sh;
        System.out.println("El salario semanal de un empleado es: "+salario+" soles");
    }
    
}

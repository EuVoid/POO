/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheVoid_02;

/**
 *
 * @author 20211050080358
 */

import java.util.Scanner;

public class euvoid_02 {
    
    public static void main(String[] args) {
        
//  CODIGO 

        Scanner leia = new Scanner(System.in);
         
        String nome;
        String sobrenome;
        int idade;
        double peso;
        
        System.out.print("Informe seu nome: ");
        nome = leia.next();
                
            leia.nextLine();
            
        System.out.print("Informe seu sobrenome: ");
        sobrenome = leia.nextLine();
        
        System.out.print("Informe sua idade: ");
        idade = leia.nextInt();
        
        System.out.print("Informe seu peso: ");
        peso = leia.nextDouble();
        
//  APRESENTAR DADOS COLETADOS / SAIDA FORMATADA
        
        System.out.println("Nome e Sobrenome: "+nome+" "+sobrenome);
        
        System.out.println("Idade: "+idade);
        
        System.out.println("Peso: "+peso);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("S2 O Vicente é lindo S2");
    }
}

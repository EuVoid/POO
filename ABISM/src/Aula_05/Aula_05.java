/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_05;

import java.util.Scanner;

import javax.management.ListenerNotFoundException;
/**
 *
 * @author Void @theycallme.void
 */
public class Aula_05 {

    public static void main(String[] args){
        
        Scanner leia = new Scanner(System.in);
        
//  VAR
        String Nome;
        String Sobrenome;
        String Telefone;
        String NomedoCurso;
        double Media;
        String Endereço;

//  ENTRADA DE DADOS

        System.out.print("Informe o seu nome: ");
        Nome = leia.next();

        leia.nextLine();

        System.out.print("Informe o seu Sobrenome: ");
        Sobrenome = leia.nextLine();

        System.out.print("Informe o seu Telefone: ");
        Telefone = leia.nextLine();

        leia.nextLine();

        System.out.print("Informe o Nome do Curso: ");
        NomedoCurso = leia.nextLine();

        System.out.print("Informe o a sua Média: ");
        Media = leia.nextDouble();

        leia.nextLine();

        System.out.print("Informe o seu Endereço: ");
        Endereço = leia.nextLine();

//  SAIDA FORMATADA

        System.out.println("---------------FICHA---------------");

        System.out.println("Nome: "+Nome+" "+Sobrenome);
        
        System.out.println("Telefone: "+Telefone);

        System.out.println("Curso: "+NomedoCurso);

        System.out.println("Média: "+Media);

        System.out.println("Endereço: "+Endereço);

        ;
        
    }
}

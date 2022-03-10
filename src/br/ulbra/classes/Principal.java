/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classes;

import java.util.Scanner;

/**
 *
 * @author Leon
 */
public class Principal {
    public static void main(String[] args) {

        Veiculo fusca = new Veiculo();
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a marca:");
        fusca.setMarca(ler.nextLine());
        System.out.println("A marca é:"+fusca.getMarca());
       
                
    }
    
}

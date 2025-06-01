package atividade4;

import java.util.Scanner;

public class Intervalo07 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if(numero >= 10 && numero <= 20){
            System.out.println("numero dentro do intervalo entre 10 e 20");
        }else {
            System.out.println("numero fora do intervalo ");
        }
        
        sc.close();
    }
}



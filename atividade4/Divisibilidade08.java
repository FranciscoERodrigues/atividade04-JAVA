package atividade4;

import java.util.Scanner;

class Divisibilidade08 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite um numero inteiro: ");
		        int num1 = sc.nextInt();

		        if(num1 % 3 == 0 && num1 % 5 == 0){
		            System.out.println("É divisivel por 3 e por 5.");
		        }else {
		            System.out.println("Não é divisivel por 3 e por 5.");
		        }
		        sc.close();
		    }
	}



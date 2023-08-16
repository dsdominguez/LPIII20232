
//Arquivo para exemplificar a implementação de uma classse e leitura de dados via teclado

import java.util.Scanner;

public class Exemplo02a{

  public static void main(String [] args){

		Scanner scanner = new Scanner(System.in);
		String name;
		int a;
		System.out.println("Hello World!");    //output
		System.out.print("Whats your name? ");
		name = scanner.nextLine();
		System.out.print("Whats your age? ");
		a = scanner.nextInt();
    	System.out.println("Hi " + name + ", good to see you here!!!");
    	System.out.println("You have " + a + ", years old!!!");
		scanner.close();
  }

}

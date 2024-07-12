package Classes;
import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero\n");
		int num1 = scan.nextInt();
		
		System.out.println("implicito");
		long variavel1 = num1;
		
		Short variavel2 = (short) variavel1;		
		System.out.println("Casting Explicito e boxing concluido\n " + variavel2);
		

		short variavel3 = Short.valueOf(variavel2);
		System.out.println("convertendo de Wrapper para Primitivo(unboxing)" + variavel3);
		

	}

}

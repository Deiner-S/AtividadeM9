package Classes;
import java.util.Scanner;
public class Main {
	
	
	
	public static void main(String[] args) {
		//ler do console um valor numerico coloq	ue em uma variavel do tipo primitiva vassa conversão para o tipo wrapper 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero\n");
		long num1 = scan.nextLong();
		
		long variavel1 = num1;
		
		Short variavel2 = (short) variavel1;
		
		System.out.println("Casting e Wrappers concluido"+variavel2);
		

	}

}

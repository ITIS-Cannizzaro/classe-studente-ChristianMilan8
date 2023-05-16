
import java.util.Scanner;
public class testStudente {


	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		verifica a=new verifica();
		
		
		System.out.println("nome studente?");
		String nome=in.nextLine();
		System.out.println("anno di nascita?");
		int annoNascita=in.nextInt();
		
		verifica b=new verifica(nome, annoNascita);
		
		if(a.getAnnoNascita()== b.getAnnoNascita()) {
			System.out.println("sono coetanei");
		}
		else if (a.getAnnoNascita() < b.getAnnoNascita()) {
			System.out.println("studente a è più piccolo");
		}
		else {
			System.out.println("lo studente b è più grande");
		}
	}
	
}


package kodluyoruz_java;

import java.util.Scanner;

public class kdvtutari {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("para miktarini girin");
		int tutar=input.nextInt();

        
		int kdv = tutar>0 && tutar<1000 ? 18:8;

	}

}

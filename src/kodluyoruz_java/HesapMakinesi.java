package kodluyoruz_java;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("1. sayiyi girin: ");
		int sayi1=input.nextInt();
		
		System.out.println("2. sayiyi girin: ");
		int sayi2=input.nextInt();
		
		
		System.out.println("1-toplama\n2-carpma\n3-bölme\n4-cikarma");
		int secenek=input.nextInt();
		switch(secenek) {
		
		case 1:
		   int toplam=sayi1+sayi2;
		   System.out.println(toplam);
		   break;
		case 2:
			int carpim=sayi1*sayi2;
			System.out.println(carpim);
			break;
		case 3:
			int bölüm=sayi1/sayi2;
			System.out.println(bölüm);
			break;
		case 4:
			int fark=sayi1-sayi2;
			System.out.println(fark);
			break;
		default:
			System.out.println("gecersiz islem");
			
		}

	}

}

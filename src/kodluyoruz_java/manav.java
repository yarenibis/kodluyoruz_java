package kodluyoruz_java;

import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		double armut=2.14;
		double elma=3.67;
		double domates=1.11;
		double muz=0.95;
		double patlican=5.0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Armut Kaç Kilo ? :");
		double akg=input.nextDouble();
		System.out.println("elma Kaç Kilo ? :");
		double ekg=input.nextDouble();
		System.out.println("domates Kaç Kilo ? :");
		double dkg=input.nextDouble();
		System.out.println("muz Kaç Kilo ? :");
		double mkg=input.nextDouble();
		System.out.println("patlican Kaç Kilo ? :");
		double pkg=input.nextDouble();
		
		double toplam=(akg*armut)+(ekg*elma)+(dkg*domates)+(mkg*muz)+(pkg*patlican);
		System.out.println("toplam tutar: "+ toplam);

	}

}

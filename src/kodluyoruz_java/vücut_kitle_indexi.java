package kodluyoruz_java;

import java.util.Scanner;

public class vücut_kitle_indexi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
		double m=input.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz :");
		double kg=input.nextDouble();
		System.out.println();

		double formül=kg/m*m;
		System.out.println("Vücut Kitle İndeksiniz : "+ formül);
	}

}

package kodluyoruz_java;

import java.util.Scanner;

public class hipotenüs {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("1. dik kenarı gir:");
		int kenar1=input.nextInt();
		System.out.println("2. dik kenarı gir:");
		int kenar2=input.nextInt();
		
		double hipotenüs= Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
        System.out.println("hipotenüs: " +hipotenüs);
        
        double u=(kenar1+kenar2+hipotenüs)/2;
        double alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-hipotenüs));
        System.out.println("alan:" +alan);
	}

}

package kodluyoruz_java;

import java.util.Scanner;

public class daire_alan_cevre_hesap {

	public static void main(String[] args) {
		System.out.println("daire yarıcapini giriniz:");
		Scanner input=new Scanner(System.in);
		int yaricap=input.nextInt();
		
        double pi=3.14;
        double alan=pi*(yaricap*yaricap);
        double cevre=2*pi*yaricap;
        System.out.println("Alan:" +alan+ "\ncevre:" +cevre);
        
        System.out.println("Aci  :");
        int alfa=input.nextInt();
        double dilimalanı=(pi*(yaricap*yaricap)*alfa)/360;
        System.out.println(dilimalanı);
	}

}

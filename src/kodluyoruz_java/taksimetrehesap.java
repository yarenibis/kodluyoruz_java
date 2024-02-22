package kodluyoruz_java;

import java.util.Scanner;

public class taksimetrehesap {

	public static void main(String[] args) {

		double kmbasi=2.20;
		int mintutar=20;
		int acilis=10;
		double borc;
		System.out.println("kaç km tuttu?");
		Scanner input=new Scanner(System.in);
		int mesafe=input.nextInt();
		
		if(mesafe*kmbasi<=mintutar) {
			borc=20;
		}
		else {
			borc=(mesafe*kmbasi)+acilis;
		}
        System.out.println("borcunuz: "+borc);
	}

}

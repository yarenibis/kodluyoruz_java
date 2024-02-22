package kodluyoruz_java;

import java.util.Scanner;

public class koşulifadesi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int toplam=0;
		double ortalama=0;
		String basari_durumu;
		
		System.out.println("matematik notunuzu girin:");
		int mat=input.nextInt();
		
		System.out.println("fizik notunuzu girin:");
		int fizik=input.nextInt();
		
		System.out.println("kimya notunuzu girin:");
		int kimya=input.nextInt();

		toplam=mat+fizik+kimya;
		ortalama=toplam/3;
		System.out.println("ortalamaniz: "+ ortalama);
		
		basari_durumu=ortalama > 60 ? "gecti" : "kaldi";
		System.out.println("başarı durumu: "+ basari_durumu);

	}

}

import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	public static void main(String[] args) {
		
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Matematik sınav notunuz: ");
		matematik = scanner.nextInt();
		
		System.out.print("Fizik sınav notunuz: ");
		fizik = scanner.nextInt();
		
		System.out.print("Kimya sınav notunuz: ");
		kimya = scanner.nextInt();
		
		System.out.print("Türkçe sınav notunuz: ");
		turkce = scanner.nextInt();
		
		System.out.print("Tarih sınav notunuz: ");
		tarih = scanner.nextInt();
		
		System.out.print("Müzik sınav notunuz: ");
		muzik = scanner.nextInt();
		
		int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
		double ortalama = toplam/6.0;
		
		System.out.println("Genel ortalama: " + ortalama);
		
		System.out.println(ortalama > 60 ? "Sınıfı Geçti." : "Sınıfta kaldı.");
	}
}

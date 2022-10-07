package Project_from_praktikum;

import java.util.Scanner;

public class Konversi_Suhu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("==========KONVERSI SUHU==========");
		System.out.printf("Choose The Input:\n1. Celcius\n2. Reamur\n3. Fahrenheit\n4. Kelvin\n\nNumber: ");
		int input = scanner.nextInt();
		{
			if (input == 1) {
				System.out.printf("\nBerapa celcius: ");
				float celc = scanner.nextFloat();
				System.out.printf("\nConvert to:\n1. Reamur\n2. Fahrenheit\n3. Kelvin\n\nNumber: ");
				int celcTo = scanner.nextInt();
				if (celcTo == 1) {
					float celcReam = celc * 4 / 5;
					System.out.printf("\nSuhu setelah dikonversi: %.1f R", celcReam);
				} else if (celcTo == 2) {
					float celcFahr = celc * 9 / 5 + 32;
					System.out.printf("\nSuhu setelah dikonversi: %.1f F", celcFahr);
				} else if (celcTo == 3) {
					float celcKelv = celc + 273;
					System.out.printf("\nSuhu setelah dikonversi: %.1f K", celcKelv);
				} else {
					System.out.println("Invalid Number");
				}
			} else if (input == 2) {
				System.out.printf("\nBerapa reamur: ");
				float ream = scanner.nextFloat();
				System.out.printf("\nConvert to:\n1. Celcius\n2. Fahrenheit\n3. Kelvin\n\nNumber: ");
				int reamTo = scanner.nextInt();
				if (reamTo == 1) {
					float reamCelc = ream * 5 / 4;
					System.out.printf("\nSuhu setelah dikonversi: %.1f C", reamCelc);
				} else if (reamTo == 2) {
					float reamFahr = ream * 9 / 4 + 32;
					System.out.printf("\nSuhu setelah dikonversi: %.1f F", reamFahr);
				} else if (reamTo == 3) {
					float reamKelv = ream * 5 / 4 + 273;
					System.out.printf("\nSuhu setelah dikonversi: %.1f K", reamKelv);
				} else {
					System.out.println("Invalid Number");
				}
			} else if (input == 3) {
				System.out.print("\nBerapa fahrenheit: ");
				float fahr = scanner.nextFloat();
				System.out.printf("\nConvert to:\n1. Celcius\n2. Reamur\n3. Kelvin\n\nNumber: ");
				int fahrTo = scanner.nextInt();
				if (fahrTo == 1) {
					float fahrCelc = (fahr - 32) * 5 / 9;
					System.out.printf("\nSuhu setelah dikonversi: %.1f C", fahrCelc);
				} else if (fahrTo == 2) {
					float fahrReam = (fahr - 32) * 4 / 9;
					System.out.printf("\nSuhu setelah dikonversi: %.1f R", fahrReam);
				} else if (fahrTo == 3) {
					float fahrKelv = (fahr - 32) * 5 / 9 + 273;
					System.out.printf("\nSuhu setelah dikonversi: %.1f K", fahrKelv);
				} else {
					System.out.println("Invalid Number");
				}
			} else if (input == 4) {
				System.out.print("\nBerapa kelvin: ");
				float kelv = scanner.nextFloat();
				System.out.printf("\nConvert to:\n1. Celcius\n2. Reamur\n3. Fahrenheit\n\nNumber: ");
				int kelvTo = scanner.nextInt();
				if (kelvTo == 1) {
					float kelvCelc = kelv - 273;
					System.out.printf("\nSuhu setelah dikonversi: %.1f C", kelvCelc);
				} else if (kelvTo == 2) {
					float kelvReam = (kelv - 273) * 4 / 5;
					System.out.printf("\nSuhu setelah dikonversi: %.1f R", kelvReam);
				} else if (kelvTo == 3) {
					float kelvFahr = (kelv - 273) * 9 / 5 + 32;
					System.out.printf("\nSuhu setelah dikonversi: %.1f F", kelvFahr);
				} else {
					System.out.println("Invalid Number");
				}
			} else {
				System.out.println("Invalid Number");
			}

		}
	}

}

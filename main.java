package matris;

public class matris {

	public static void main(String[] args) {

		// ödev-3 
		
		int dizi1[][] = new int[2][3];
		int dizi2[][] = new int[1][1];

		int dizi3[][] = new int[2][3];

		System.out.println("--------------------------");
		System.out.println("Dizi1 matris: ");

	
		
		for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j < dizi1[i].length; j++) {
				dizi1[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j < dizi1[i].length; j++) {
				System.out.print(dizi1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------");
		System.out.println("Dizi2 matris: ");

		for (int i = 0; i < dizi2.length; i++) {
			for (int j = 0; j < dizi2[i].length; j++) {
				dizi2[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < dizi2.length; i++) {
			for (int j = 0; j < dizi2[i].length; j++) {
				System.out.print(dizi2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------");
		System.out.println("Çarpıldığında oluşan matris: ");

		int toplam = 0;

		for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j < dizi1[i].length; j++) {
				for (int k = 0; k < dizi2.length; k++) {
					for (int l = 0; l < dizi2[k].length; l++) {
						dizi3[i][j] = dizi1[i][j] * dizi2[k][l];
						toplam += dizi3[i][j];
					}
				}
			}
		}

		for (int i = 0; i < dizi3.length; i++) {
			for (int j = 0; j < dizi3[i].length; j++) {
				System.out.print(dizi3[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Toplamı: " + toplam);

	}

}

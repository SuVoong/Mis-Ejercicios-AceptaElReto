package volumen3;

/**
 * 
 * @author Su Shan Voong Sun
 * @param Cuadrados con cerillas
 * @since 17/12/2023, 16:27:25 (UTC)
 *
 */
public class P340 {
	static java.util.Scanner sc;

	public static void main(String[] args) {
		sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			prueba();
		}
	}

	public static void prueba() {
		int total = 0;
		int numH = sc.nextInt();
		int numV = sc.nextInt();
		if (numH > 0 || numH < 1000 && numV > 0 || numV < 1000) {
			total = (numH * (numV + 1)) + (numV * (numH + 1));
			System.out.println(total);
		}

	}
}

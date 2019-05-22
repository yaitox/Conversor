package fldasjf;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class conversorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pedir = new Scanner(System.in);
		int base, num;
		boolean a;
		String _num;
		int option;
		while (a = true) {
			System.out.println(
					"Ingrese el sistema numérico del número que desea convertir:\nDecimal(1)\nBinario(2)\nOctal(3)");
			option = pedir.nextInt();

			if (option == 1) {
				System.out.println("Escriba el número");
				num = pedir.nextInt();

				System.out.println("A qué lo quiere pasar?\nBinario(1)\nOctal(2)\nHexadecimal(3)");
				base = pedir.nextInt();
				if (base == 1) {
					base = 2;
					decCualquiera(num, base);
					System.out.println("Quiere volver a convertir?\nSi(1)\nNo(2)");
					int option2 = pedir.nextInt();
					if (option2 == 1) {
						a = true;
					} else if (option2 == 2) {
						System.out.println("Gracias por usar nuestro programa!");
						break;

					}
				} else if (base == 2) {
					base = 8;
					decCualquiera(num, base);
				} else if (base == 3) {
					base = 16;

					decCualquiera(num, base);
					System.out.println("Quiere volver a convertir?\nSi(1)\nNo(2)");
					int option2 = pedir.nextInt();
					if (option2 == 1) {
						a = true;
					} else if (option2 == 2) {
						System.out.println("Gracias por usar nuestro programa!");
						break;
					}
				}
			}
			if (option == 2) {

				System.out.println("Escriba el número");
				num = pedir.nextInt();

				System.out.println("A qué lo quiere pasar?\nDecimal(1)");
				base = pedir.nextInt();

				{
					if (base == 1) {
						base = 2;
						cualquieraDec(num, base);
						System.out.println("Quiere volver a convertir?\nSi(1)\nNo(2)");
						int option2 = pedir.nextInt();
						if (option2 == 1) {
							a = true;
						} else if (option2 == 2) {
							System.out.println("Gracias por usar nuestro programa!");
							break;
						}

					}

				}
			}
			if (option == 3) {
				System.out.println("Escriba el número");
				num = pedir.nextInt();

				System.out.println("A qué lo quiere pasar?\nDecimal(1)");
				base = pedir.nextInt();

				{
					if (base == 1) {
						base = 8;
						cualquieraDec(num, base);
						System.out.println("Quiere volver a convertir?\nSi(1)\nNo(2)");
						int option2 = pedir.nextInt();
						if (option2 == 1) {
							a = true;
						} else if (option2 == 2) {
							System.out.println("Gracias por usar nuestro programa!");
							break;
						}
					}

				}

			}
		}
	}

	public static void decCualquiera(int x, int y) {
		int obtener;
		if (y == 16) {
			if (x > 0) {
				List<String> reverse = new ArrayList<String>();
				int div;
				String num = "";
				while (x > 0) {
					String obtenerLetra;

					div = x / y;
					int res = x % y;
					obtenerLetra = Integer.toString(res);
					if (res == 10) {

						obtenerLetra = "A";

					} else if (res == 11) {
						obtenerLetra = "B";

					} else if (res == 12) {
						obtenerLetra = "C";
					} else if (res == 13) {
						obtenerLetra = "D";
					} else if (res == 14) {
						obtenerLetra = "E";
					} else if (res == 15) {
						obtenerLetra = "F";
					}

					x = div;
					num = num + obtenerLetra;

				}
				String reverse1 = "";
				for (int i = num.length() - 1; i >= 0; i--) {
					reverse1 = reverse1 + num.charAt(i);
				}

				System.out.println("El numero convertido es: " + reverse1 + " en base " + y);

			}
		}

		String num = "";
		List<Integer> reverse = new ArrayList<Integer>();
		int div;
		if (x > 0) {
			while (x > 0) {
				div = x / y;
				int res = x % y;

				reverse.add(res);

				x = div;
			}
			Collections.reverse(reverse);
			for (int i = 0; i < reverse.size(); i++) {
				obtener = reverse.get(i);
				num = num + obtener;

			}

			System.out.println("El numero convertido es: " + num + " en base " + y);

		}

	}

	public static void cualquieraDec(int x, int y) {
		List<Integer> reverse = new ArrayList<Integer>();
		int obtenerDecimal = 0;
		int div, res;
		boolean a;
		if (x > 0) {
			while (x > 0) {

				div = x / y;

				res = x % y;
				if (y == 2) {

					if (res != 0 && res != 1) {
						System.out.println("Ingrese un numero binario valido");

					}
				}
				if (y == 8) {
					if (res == 8 || res == 9) {
						System.out.println("Ingrese un número octal válido");

					}
				}

				reverse.add(res);
				x = div;
			}

		}

		for (int i = 0; i < reverse.size(); i++) {
			int obtener = reverse.get(i);
			obtenerDecimal = obtenerDecimal + obtener * (int) Math.pow(y, i);

		}
		System.out.println("El numero convertido es: " + obtenerDecimal);
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author ANA
 */
        public class Ejercicio {
	public String concatenar(String uno, String dos) {
		return uno+dos;
	}

	public int multiplicaryanade(int num1, int num2) {
int numero;
		if ((num1 * num2) > 50) {
			numero=(num1 * num2) + 100;
		} else {
			numero=(num1 * num2);
		}
return numero;
	}

	public String diaSemana(String num) {
		if (num != "1" && num != "2" && num != "3" && num != "4" && num != "5" && num != "6" && num != "7") {
			System.out.println("Numero introducido no correcto");

		} else if (num == "1") {
			
			num = "Lunes";
		} else if (num == "2") {
			
			num = "Martes";
		} else if (num == "3") {
			
			num = "Miercoles";
		} else if (num == "4") {
			
			num = "Jueves";
		} else if (num == "5") {
			
			num = "Viernes";
		} else if (num == "6") {
			
			num = "Sabado";
		} else if (num == "7") {
			
			num = "Domingo";
		}
return num;
	}

	public int pares(int n1, int n2, int n3, int n4) {
		int par = 0;
		int[] numeros = new int[4];
		numeros[0] = n1;
		numeros[1] = n2;
		numeros[2] = n3;
		numeros[3] = n4;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				par++;
			}
		}
		return par;

        }
        }


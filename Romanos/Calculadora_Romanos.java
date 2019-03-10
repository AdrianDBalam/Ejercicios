import java.util.Scanner;
public class Calculadora_Romanos{
	
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
  		Calculadora_Romanos convertidor = new Calculadora_Romanos();

  		System.out.println("Ingrese el numero que desea convertir a romanos");
  		int valor = teclado.nextInt();

  		if (valor > 1001){
  			System.out.println("El numero esta fuera del rango \n" + "Ingrese un numero entre 1 y 1000");

  		}else if (valor <1000) {
  			String resultado = convertidor.convertirANumerosRomanos(valor); 
  			System.out.println("El numero: "+valor+" su conversion seria: "+resultado);
  		}
	}

		public String convertirANumerosRomanos(int numero) {
	     
	      int i, miles, centenas, decenas, unidades;
	      String romano = "";
	     //obtenemos cada cifra del número
	      miles = numero / 1000;
	      centenas = numero / 100 % 10;
	      decenas = numero / 10 % 10;
	      unidades = numero % 10;
	 
	     //millar
	      for (i = 1; i <= miles; i++) {
	             romano = romano + "M";
	      }
	 
	     //centenas
	      if (centenas == 9) {
	          romano = romano + "CM";
	      } else if (centenas >= 5) {
	                     romano = romano + "D";
	                     for (i = 6; i <= centenas; i++) {
	                            romano = romano + "C";
	                     }
	      } else if (centenas == 4) {
	                      romano = romano + "CD";
	      } else {
	                  for (i = 1; i <= centenas; i++) {
	                         romano = romano + "C";
	                  }
	      }
	 
	     //decenas
	      if (decenas == 9) {
	           romano = romano + "XC";
	      } else if (decenas >= 5) {
	                      romano = romano + "L";
	                      for (i = 6; i <= decenas; i++) {
	                            romano = romano + "X";
	                      }
	      } else if (decenas == 4) {
	                      romano = romano + "XL";
	      } else {
	                    for (i = 1; i <= decenas; i++) {
	                           romano = romano + "X";
	                    }
	      }
	 
	     //unidades
	      if (unidades == 9) {
	           romano = romano + "IX";
	      } else if (unidades >= 5) {
	                      romano = romano + "V";
	                      for (i = 6; i <= unidades; i++) {
	                             romano = romano + "I";
	                      }
	      } else if (unidades == 4) {
	                      romano = romano + "IV";
	      } else {
	                  for (i = 1; i <= unidades; i++) {
	                         romano = romano + "I";
	                  }
	      }
	      return romano;
	 
    }
}
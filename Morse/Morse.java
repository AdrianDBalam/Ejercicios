
import java.util.Scanner;
public class Morse{
	Scanner entrada = new Scanner(System.in);
	String conversion =" ";
	String conversion1 =" ";
	String[] codigoMorse = {" ",".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----" };
	char[] abecedario = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
	

public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			Morse conversor = new Morse ();
			boolean fin = true;
			
			//mensaje de bienvenida y recepcion de datos
			System.out.println("Bienvenido al traductor de codigo Morse");
				System.out.println("1-  Codificar mensaje ");
				System.out.println("2- Decodificar mensaje");
				int opcion = entrada.nextInt();	
					
					switch (opcion){
						case 1:
						
							String frase = conversor.getMensaje();
							String convertido = conversor.getTranslateMorse(frase);
							System.out.println("La traduccion es: "+ convertido);
							break;
							
						case 2:
							String codigo = conversor.getMensaje();
							String convertido2 = conversor.getTranslateLetter(codigo);
							System.out.println("La traduccion es: "+ convertido2);
							break;

					}
					
					
	   		}			
				
	   public String getTranslateMorse(String palabra){
	   		
		   	 for (int i = 0; i < palabra.length(); i++) {
				      for (int j = 0; j < 37; j++) { 
				        if (palabra.charAt(i) == abecedario[j]) { 
				          conversion += codigoMorse[j];
				          conversion += "   ";
				            
				        }    
				      }
				    }

			return  conversion;
		   }

		public String  getTranslateLetter(String palabra){

			String clave[] = palabra.split(" ");//se crea un nuevo array y se le asigana la la palabra que el usuario ingrese, se le hace un split para separar la palabra
		    int tamano=clave.length;//se crea una nueva variable y se le asigna la clave.length para que sepa cuantas clave morse hay ingresadas 
		      for (int i = 0; i < tamano; i++) {
		        for (int j = 0; j < 37; j++) {
		          if (clave[i].equals(codigoMorse[j])) {//condición para comparar clave con morse 
		            conversion1 +=abecedario[j];
		            conversion1 += "   ";//para que sea separado por 3 espacios
		          }    
		        }
		      } return conversion1;
		    

		}
		public String getMensaje(){
			System.out.println("Ingrese el mensaje que desea Codificar");
			String oracion = entrada.nextLine();

			return oracion;
		}
   }
     
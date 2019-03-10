
import java.util.Scanner;

public class Herencia_Objetos {
   
 
    public static void main(String[] args) throws InterruptedException {
        //variables para usar en los procedimientos del menu
        Herencia_Objetos clase = new Herencia_Objetos();
        Scanner entrada = new Scanner(System.in);
        Cuadrado figura1 = new Cuadrado();
        Cubo figura2 = new Cubo();
        boolean retorno = true;
        boolean regresion = true;
         boolean retroceso = true;
        
        while (retorno==true){
        System.out.println("Escriba el numero correspondiente a la opcion deseada");
        System.out.println(" ------ Menu ------ ");
        System.out.println(" 1- para Cuadrado");
        System.out.println(" 2- para Cubo");
        System.out.println(" 3- Salir");
        int opcion = entrada.nextInt();
        
       
        switch(opcion){
            
            case 1:  opcion = 1;
                //opcion cuadrado  
                while(regresion){
                System.out.println(" Cuadrado ");
                System.out.println(" 1- Calcular Area");
                System.out.println(" 2- Calcular Perimetro");
                System.out.println(" 3- regresar");
                int opcionCuadrado= entrada.nextInt();
                    
                        
                    switch(opcionCuadrado){

                        case 1:  opcionCuadrado = 1;
                        float temp1 = figura1.getvalues();
                        float resultado = figura1.getArea(temp1);
                        
                        System.out.println(" El area del cuadrado es : "+ resultado  );
                        Thread.sleep(1000);
                        break;

                        case 2: opcionCuadrado = 2;
                        float temp2 = figura1.getvalues();
                        float resultado2 = figura1.getPerimetro(temp2);
                        System.out.println(" El perimetro del cuadrado es : "+ resultado2);
                        Thread.sleep(1000);
                        break;
                        
                        case 3: opcion = 3 ;
                        regresion = false;
                        
                    }
                   }
        break;
        case 2: opcion = 2;
            while(retroceso){
            System.out.println(" Cubo ");    
            System.out.println(" 1- Calcular Volumen");
            System.out.println(" 2- Calcular Perimetro");
            System.out.println(" 3- regresar");
            int opcionCubo = entrada.nextInt();
                   
                        switch (opcionCubo){

                            case 1:  opcionCubo = 1;
                            float temp1 = figura2.getvalues();
                            float resultado = figura2.getVolumen(temp1);
                            System.out.println(" El volumen del cubo es: "+ resultado);
                            Thread.sleep(1000);
                            break;

                            case 2: opcionCubo = 2;
                            float temp2 = figura2.getvalues();
                            float resultado2 = figura2.getPerimetro(temp2);
                            System.out.println(" El perimetro del cubo es: "+ resultado2);
                            Thread.sleep(1000);
                            break;
                            
                            case 3: opcionCubo = 3;
                            retroceso = false;
                        }
                    }
            
        break;
        
        case 3: opcion = 3;
        System.out.println("Que tenga buen dia...");
        retorno = false;
        }
     }
    }
    
    
}
class Cubo extends Cuadrado {
	
          public float getVolumen(float base){
              float resultado = (float) Math.pow(base, 3);
              
              return resultado;
          }
      }

class Cuadrado {
	Scanner entradaCuadrado = new Scanner(System.in);
        public float getvalues (){
        System.out.println("Ingrese el valor de los lados");
        float valor = entradaCuadrado.nextFloat();
        
        return valor;
    }
          public float getArea (float base){
              float resultado = base * base;
              
              return resultado;
          }
          public float getPerimetro(float base){
             float resultado = base * 4;
             
             return resultado;
          }
      }

package calculo.imc;
import java.util.Scanner;

public class CalculoIMC {

   
    public static void main(String[] args) {
       String nome;
       double peso;
       double altura;
       
       Scanner ler = new Scanner (System.in);
       
       System.out.println("Por favor informe seu nome:");
       nome = ler.next();
       
       System.out.println("Informe o seu peso:");
       peso = ler.nextDouble();
       
       System.out.println("Informe a sua altura:");
       altura = ler.nextDouble();
       
       double imc;
       imc = peso/(altura*altura);
       
       if(imc < 17){
           System.out.println(" Muito baixo do peso!");
           
       }else if(imc >=17 && imc <= 18.49){
        System.out.println(" Abaixo do peso");
        
    }else if(imc >=18.50 && imc <=24.99 ){
        System.out.println(" Peso normal!");
        
    }else if(imc >= 25 && imc <=29.99){
        System.out.println(" Acima do peso");
        
    }else if(imc >=30 && imc <=34.99){
        System.out.println(" Obesidade | ");
        
    }else if(imc >=35 && imc <=39.99 ){
        System.out.println(" Obesidade || (severa)");
        
    }else{
        System.out.println(" Obesidade ||| (morbida) ");
        
    }
       System.out.println(nome + " Seu IMC: " + imc);
    }
    
}

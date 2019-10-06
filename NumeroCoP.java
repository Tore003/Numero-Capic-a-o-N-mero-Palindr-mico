import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class NumeroCoP {

   
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero=0;
        numero = String.valueOf(numero).length(); //
        int reverse=0;
        int sum=0;
        System.out.println("Ingrese un numero de 4 digitos");
        numero = Integer.parseInt(bufEntrada.readLine());
        int temp = numero;
             while(numero>0)
            {    //formula para determinar si es capicua
                reverse=numero%10;   
                sum=(sum*10)+ reverse;     
                numero=numero/10;    
            }   
             if(temp==sum)
             {   
                System.out.println(numero + " El numero ingresado es capicua ");
             }    
             else
             {    
                System.out.println(numero + " El numero ingresado no es capicua");    
             }  
    }  
}   

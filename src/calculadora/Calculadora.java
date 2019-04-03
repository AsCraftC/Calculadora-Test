
package calculadora;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author AsCraft Contreras
 *         Erick Riquelme
 *         Luis Silva
 */
public class Calculadora {
    public static void main(String[] args) 
    {
        menu();
        
    }
    private static int ValidarMenu() //Validar int entre un rango númerico.
    {
        Scanner in = new Scanner (System.in);
        int num;
        try{
            num= in.nextInt();
        }catch(Exception e){
            System.err.println("Eso no es una opcion");
            num=ValidarMenu();
        }
        
        if(num>7||num<1){
            num=ValidarMenu();
        }
        return num;
    }
    private static double ValidarNumero() //Validar double.
    {
        Scanner in = new Scanner (System.in);
        double num;
        System.out.println("Ingrese un numero");
        try{
            num= in.nextDouble();
        }catch(Exception e){
            System.err.println("Eso no es un numero");
            num=ValidarNumero();
        }
        
        return num;
    }
    private static double Potencia(double num, double pow) //Math potencia...
    {
        return Math.pow(num, pow);
    }
    private static void Mostrar(double num) //Imprime un double.
    {
        System.out.println("El resultado es:\n\n"+num);
    }
    private static double sumar(double a, double b) //Sumar dos double.
    {
        return a+b;
    }
    private static double resta(double a, double b) //Restar dos double.
    {
        return a-b;
    }
    private static double multiplicar(double a, double b) //Multiplicar dos double.
    {
        return a*b;
    }
    private static double dividir(double a, double b) //Dividir double (b=!0).
    {
        if(b==0){ 
            do{
                System.out.println("ingrese el segundo numero nuevamente");
                b=ValidarNumero();
            }while(b==0);
        }
        return a/b;
    }
    private static double comparar(double a, double b) //Comparar dos numeros, da el mayor (Math).
    {
        return Math.max(a,b); 
    }
    public static void menu() //Menu con varias opciones.
    {
        
        System.out.println("Eliga operacion a realizar");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.Division");
        System.out.println("5.Potencia");
        System.out.println("6.Comparar");
        System.out.println("7.Salir");
        accion(ValidarMenu());
    }
    public static void accion(int o)
    {
        double a,b,c;
        switch(o){
            case 1:
                a=ValidarNumero();
                b=ValidarNumero();
                c=sumar(a,b);
                Mostrar(c);
                menu();
                break;
            case 2:
                a=ValidarNumero();
                b=ValidarNumero();
                c=resta(a,b);
                Mostrar(c);
                menu();
                break;
            case 3:
                a=ValidarNumero();
                b=ValidarNumero();
                c=multiplicar(a,b);
                Mostrar(c);
                menu();
                break;
            case 4:
                a=ValidarNumero();
                b=ValidarNumero();
                c=dividir(a,b);
                Mostrar(c);
                menu();
                break;
            case 5:
                a=ValidarNumero();
                b=ValidarNumero();
                c=Potencia(a,b);
                Mostrar(c);
                menu();
                break;
            case 6:
                a=ValidarNumero();
                b=ValidarNumero();
                c=comparar(a,b);
                Mostrar(c);
                menu();
                break;
            case 7:
                break;
        }
        
    }
}

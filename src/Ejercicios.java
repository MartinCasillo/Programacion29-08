import java.util.Scanner;

public class Ejercicios{
    public static void main(String[] args){

        /* int a = 100;
        //int b = 200;
        System.out.println("Suma :" + (a+b));
        System.out.println("Resta : " + (a-b));
        System.out.println("Division : " + (a/b));
        System.out.println("Multiplicacion : " + (a * b));

        int num1 = 14;
        int num2 = 55;
        int num3 = 67;
        int num4 = 92;
        int num5 = 12;
        System.out.println("Promedio : " + promedios(num1,num2,num3,num4,num5));
        */
        int a = 100;
        int b = 200;
        int c = 400;
        System.out.println("El menos es = " + menorDe(a,b,c));

    }

    private static int menorDe(int a, int b, int c){
        int rta = 0;
        if( (a < b) && ( a < c)){
            rta =a;
        }else if ( (b < c)  ){
            rta = b;
        } else{
            rta = c;
        }
        return rta;

    }
    /*public static int promedios(int num1,int num2, int num3, int num4, int num5){
        int total = num1 + num2 + num3 + num4 + num5;
        int resultado = total / 5;
        return resultado;
    }*/
}
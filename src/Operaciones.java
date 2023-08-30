import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args){
        int a = 200;
        int b = 400;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo de Operacion 1-suma, 2-resta, 3-division, 4-multiplicacion");
        int opcion = scanner.nextInt();
        System.out.println("Resultado " + operar(a,b,opcion));
    }

    public static int operar(int a,int b,int opcion){
        int rta = 0;
        switch (opcion) {
            case 1:
                rta = a + b;
                break;
            case 2:
                rta = a - b;
                break;
            case 3:
                rta = a / b;
                break;
            case 4:
                rta = a * b;
                break;
            default:
                System.out.println("Operacion Invalida");
                break;
        }
        return rta;
        }
    }


import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args){

        menu();
        int opcion = opcionElegida();
        System.out.println("Su opción es: " + mostrarMensaje(opcion) );
    }

    public static String mostrarMensaje(int opcion){
        String respuesta = "";
        switch (opcion) {
            case 1:
                respuesta = "Compras";
                break;
            case 2:
                respuesta = "Ventas";
                break;
            case 3:
                respuesta = "Reclamos";
                break;
            case 4:
                respuesta = "Salir";
                break;
            default:
                respuesta = "Opcion no valida";
                break;
        };
        return respuesta;
    }
    public static void menu(){
        System.out.println("Sistema");
        System.out.println("Ingrese una opcion (1-Compras,2-Ventas,3-Reclamos,4-Salir)");
    }
    public static int opcionElegida(){
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }
}

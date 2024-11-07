import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numero, stringOtraVez; //Ingresamos un valor en string
        double  convertir; //Creamos una variable para almacenar el valor en ENTERO cuando lo transformemos
        int convertir2;

        System.out.println("Ingrese un numero en String: "); //Pedimos el string
        numero = scanner.nextLine(); //Se guarda
        convertir = Double.parseDouble(numero); //Integer.parseInt(variableString) para convertir a ENTERO - Double.parseDouble(variableString) para Double, etc
        convertir2 = (int) convertir; //Si queremos convertirlo de DOUBLE; podemos usar la función (int) antes de la variable (tmb podemos usar (double) para convertir de int a double)
        stringOtraVez = String.valueOf(convertir); //Esto es para convertir de cualquier valor a String otra vez

        System.out.println("El valor string convetido a INT, multiplicado por 2 es: " + convertir2 *2); //Y ahora si podemos multiplicar ese string que ya fue convertido a INT
        System.out.println("El valor double cambiado a String otra vez es: " + stringOtraVez); //Mostramos el valor original en string
    }
}
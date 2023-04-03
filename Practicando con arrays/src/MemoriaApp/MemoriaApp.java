package MemoriaApp;

import java.util.Scanner;

/**
 *
 * @author Juan Goyes clase donde esta el funcionamiento del juego
 *
 */
public class MemoriaApp {

    public MemoriaApp() {
    }

    /**
     * metodo para generar un numero aleatorio
     *
     * @return
     */
    public static int numeroAleatorio() {
        int numAlea;
        numAlea = (int) (Math.random() * 4) + 1;

        System.out.println("Numero aleatorio generado: " + numAlea);

        return numAlea;
    }

    /**
     * metodo para guardar el numero ingresado por el usuario
     *
     * @return
     */
    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int numIngresado = sc.nextInt();

        System.out.println("El numero ingresado por el usuario es: " + numIngresado);

        return numIngresado;
    }

    /**
     * metodo para guardar el numero aleatorio generado previamente en un array
     *
     * @param numIngresadoG
     * @return
     */
    public static int[] arrayNumerosAleatorios(int numIngresadoG) {
        int[] arrayNumAleatorios = new int[2];

        for (int x = 0; x < arrayNumAleatorios.length; x++) {
            arrayNumAleatorios[x] = numIngresadoG;
        }

        return arrayNumAleatorios;
    }

    /**
     * metodo para guardar los numeros que digita el usuario en un array
     *
     * @param numIngresadoUsuario
     * @return
     */
    public static int[] ArrayNumerosIngresadosUsuario(int numIngresadoUsuario) {

        int[] arrayNumIngresadosUsuarios = new int[2];

        for (int x = 0; x < arrayNumIngresadosUsuarios.length; x++) {
            arrayNumIngresadosUsuarios[x] = numIngresadoUsuario;
        }
        return arrayNumIngresadosUsuarios;
    }

    public static boolean comparacionArrays(int[] numAleatorio, int[] numUsuario) {
        boolean comprobacion = false;
        for (int aA = 0; aA < numAleatorio.length; aA++) {
            for (int aU = 0; aU < numUsuario.length; aU++) {
                if (numAleatorio[aA] == numUsuario[aU]) {
                    comprobacion = true;
                }

            }
        }
        return comprobacion;
    }

}

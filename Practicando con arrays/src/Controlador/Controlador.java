package Controlador;

import MemoriaApp.MemoriaApp;

/**
 *
 * @author Juan Goyes Clase donde se controlara el juego
 */
public class Controlador {

    public Controlador() {

    }

    public static void ejecucionJuegoI() {
        //llamado a la clase MemoriaApp 
        MemoriaApp juego = new MemoriaApp();
        
        boolean comprobacionArrays = false;
        do{ 
        //ejecucion del juego 
        //generar numero aleatorio 
        int numAlea = MemoriaApp.numeroAleatorio();
        //leer numero ingresado por el usuario 
        int numIngresado = MemoriaApp.leerNumero();
        //guardar numero aleatorio en un array 
        int[] guardarNumeroAleatorioArray = MemoriaApp.arrayNumerosAleatorios(numAlea);
        //guargar numero ingresado por el usuario
        int[] guardarNumeroIngresadoUsuario = MemoriaApp.ArrayNumerosIngresadosUsuario(numIngresado);
        comprobacionArrays = MemoriaApp.comparacionArrays(guardarNumeroAleatorioArray, guardarNumeroIngresadoUsuario);
        System.out.println("El resultado es " + comprobacionArrays);
        }while(comprobacionArrays == true);
    }

}

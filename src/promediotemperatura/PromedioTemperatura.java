/*
Programa que calcula la suma de temperaturas ingresadas, la media de las temperatura
y el número de temperaturas mayor e igual a la media
*/
package promediotemperatura;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PromedioTemperatura {

   public static void main(String[] args) {

        Scanner buscar = new Scanner(System.in);

        int numeroTemperaturas, numTempMayMedia = 0;
        double media = 0, suma = 0;
        System.out.println("ingrese la cantidad de temperaturas");
        numeroTemperaturas = buscar.nextInt();

        double Temperaturas[] = new double[numeroTemperaturas];

        for (int i = 0; i < Temperaturas.length; i++) {
            System.out.println("temperatura" + (i + 1) + "");
            Temperaturas[i] = buscar.nextDouble();

        }
        for (int i = 0; i < Temperaturas.length; i++) {
            suma = suma + Temperaturas[i];
            media = suma / Temperaturas.length;

            if (Temperaturas[i] >= media) {
                numTempMayMedia++;

            }

        }
        System.out.println("la suma es:" + suma);
        System.out.println("la media es:" + media);
        System.out.println("el numero de temperaturas mayores iguales a la media son:" + numTempMayMedia);
    }

}

package Ecuaciones_lineales;

/**
 * Clase principal: coordina el flujo del programa.
 * Obtiene la matriz, aplica el Método de Gauss e imprime la solución.
 */
public class LanzadorGauss {

    public static void main(String[] args) {
        // 1. Obtener la matriz aumentada [A | b] desde el módulo de datos
        double[][] matriz = DefMatriz.defMatriz();

        // 2. Fase de triangulación: ceros debajo de la diagonal principal
        Gauss.eliminacionGaussiana(matriz);

        // 3. Sustitución regresiva: despeja las incógnitas de abajo hacia arriba
        double[] soluciones = Gauss.sustitucionRegresiva(matriz);

        // 4. Imprimir los resultados en consola
        System.out.println("Soluciones del sistema:");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.printf("x%d = %.4f%n", i + 1, soluciones[i]);
        }
    }
}

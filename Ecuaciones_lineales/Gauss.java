package Ecuaciones_lineales;

/**
 * Módulo de lógica: implementa el Método de Gauss (eliminación gaussiana
 * simple + sustitución regresiva) para resolver sistemas de ecuaciones lineales.
 */
public class Gauss {

    /**
     * Triangulariza la matriz usando eliminación gaussiana simple.
     * Convierte en ceros los elementos debajo de la diagonal principal.
     *
     * @param matriz Matriz aumentada [A | b]; se modifica directamente en memoria.
     */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length; // Tamaño del sistema (número de filas)

        // CICLO 1 (i): selecciona el renglón pivote actual (diagonal principal)
        for (int i = 0; i < n; i++) {

            // CICLO 2 (j): recorre los renglones que están ABAJO del pivote
            for (int j = i + 1; j < n; j++) {

                // Factor para anular el coeficiente de esta columna
                double factor = matriz[j][i] / matriz[i][i];

                // CICLO 3 (k): recorre la fila completa aplicando
                // R_j = R_j - (factor * R_i)
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Resuelve el sistema por sustitución regresiva (de abajo hacia arriba).
     *
     * @param matriz Matriz ya convertida en triangular superior.
     * @return Arreglo con las soluciones (x1, x2, x3, ...).
     */
    public static double[] sustitucionRegresiva(double[][] matriz) {
        int n = matriz.length;
        double[] x = new double[n]; // Almacena las soluciones

        // Recorre los renglones del último al primero
        for (int i = n - 1; i >= 0; i--) {
            double suma = 0;

            // Suma los términos de las incógnitas ya conocidas en este renglón
            for (int j = i + 1; j < n; j++) {
                suma += matriz[i][j] * x[j];
            }

            // Despeja la incógnita: (lado derecho - suma) / coeficiente del pivote
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }

        return x;
    }
}

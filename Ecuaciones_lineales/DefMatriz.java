package Ecuaciones_lineales;

/**
 * Módulo de datos: define el sistema de ecuaciones lineales a resolver.
 * Solo entrega la matriz aumentada; no realiza ningún cálculo.
 */
public class DefMatriz {

    /**
     * Devuelve la matriz aumentada [A | b] del sistema.
     * Cada fila es una ecuación: los primeros 3 valores son los coeficientes
     * de x1, x2, x3 y el último es el término independiente.
     *
     * @return Matriz aumentada de 3 filas y 4 columnas.
     */
    public static double[][] defMatriz() {
        return new double[][] {
                {  3.0, -0.1, -0.2,   7.85 },   // 3x1 - 0.1x2 - 0.2x3 = 7.85
                {  0.1,  7.0, -0.3, -19.3  },   // 0.1x1 + 7x2 - 0.3x3 = -19.3
                {  0.3, -0.2, 10.0,  71.4  }    // 0.3x1 - 0.2x2 + 10x3 = 71.4
        };
    }
}

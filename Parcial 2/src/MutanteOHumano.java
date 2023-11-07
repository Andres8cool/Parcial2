public class MutanteOHumano {
    public boolean isMutant(String[][] dna)

throws Exception {

        int n = dna.length;
        // verifica si la matriz está vacía
        if (n == 0) {
            throw new RuntimeException("la matriz esta vacia");

        }
        for (int i = 0; i < n; i++) {
            // verifica si la matriz no es rectangular (diferente cantidad de columnas en las filas)
            if (dna[i].length != n) {
                throw new RuntimeException("La matriz no es rectangular");

            }
            for (int j = 0; j < n; j++) {
                // verifica si la matriz contiene caracteres inválidos (no A, T, C o G)
                if (!dna[i][j].matches("[TACG]")) {

                    throw new RuntimeException("La matriz contiene caracteres inválidos");

                }
            }
        }
        int cnt = 0;

        cnt += contadorHorizontal(dna);
        cnt += contadorVertical(dna);
        cnt += contadorDiagonal(dna);

        // Retorna true si se encontraron al menos dos secuencias mutantes, lo que indica que el ADN es mutante
        return cnt >= 2;
    }
    //función para contar secuencias de longitud 4 en HORIZONTAL
    private int contadorHorizontal(String[][] dna) {
        int cnt = 0;
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].length - 3; j++) {
                if (dna[i][j].equals(dna[i][j+1]) &&
                        dna[i][j].equals(dna[i][j+2])
                        && dna[i][j].equals(dna[i][j+3])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    //función para contar secuencias de longitud 4 en VERTICAL  de arriba o abajo
    private int contadorVertical(String[][] dna) {
        int cnt = 0;
        for (int i = 0; i < dna.length - 3; i++) {
            for (int j = 0; j < dna[i].length; j++) {
                if (dna[i][j].equals(dna[i+1][j]) &&
                        dna[i][j].equals(dna[i+2][j]) &&
                        dna[i][j].equals(dna[i+3][j])) {
                    cnt++;
                }
            }
        }
        for (int i = dna.length - 1; i >= 3; i--) {
            for (int j = 0; j < dna[i].length; j++) {
                if (dna[i][j].equals(dna[i-1][j]) &&
                        dna[i][j].equals(dna[i-2][j]) &&
                        dna[i][j].equals(dna[i-3][j])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
//función para contar secuencias de longitud 4 en las diagonales

    private int contadorDiagonal(String[][] dna) {
        int cnt = 0;
        cnt += contadorDiagonalArribaIzquiedaAbajoDerecha(dna);
        cnt += contadorDiagonalAbajoIzquierdaArribaDerecha(dna);
        cnt += contadorSecunndarioDiagonalAbajoIzquierdaArribaDerecha(dna);
        cnt += contadorSecundarioDiagonalArribaIzquiedaAbajoDerecha(dna);
        return cnt;
    }


    //función para contar secuencias de longitud 4 en la diagonales principal
    private int contadorDiagonalArribaIzquiedaAbajoDerecha(String[][] dna) {
        int cnt = 0;
        for (int i = 0; i < dna.length - 3; i++) {
            for (int j = 0; j < dna[i].length - 3; j++) {
                if (dna[i][j].equals(dna[i+1][j+1]) &&
                        dna[i][j].equals(dna[i+2][j+2]) &&
                        dna[i][j].equals(dna[i+3][j+3])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }


    //función para contar secuencias de longitud 4 en las diagonales secundarias de arriba izquierda a abajo derecha
    private int contadorSecundarioDiagonalArribaIzquiedaAbajoDerecha(String[][] dna) {
        int cnt = 0;
        for (int i = 0; i < dna.length - 3; i++) {
            for (int j = 3; j < dna[i].length; j++) {
                if (dna[i][j].equals(dna[i+1][j-1]) &&
                        dna[i][j].equals(dna[i+2][j-2]) &&
                        dna[i][j].equals(dna[i+3][j-3])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    //función para contar secuencias de longitud 4 en la diagonales principal
    private int contadorDiagonalAbajoIzquierdaArribaDerecha(String[][] dna) {
        int cnt = 0;
        for (int i = 3; i < dna.length; i++) {
            for (int j = 0; j < dna[i].length - 3; j++) {
                if (dna[i][j].equals(dna[i-1][j+1]) &&
                        dna[i][j].equals(dna[i-2][j+2]) &&
                        dna[i][j].equals(dna[i-3][j+3])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    //función para contar secuencias de longitud 4 en las diagonales secundarias de abajo izquierda a arriba derecha
    private int contadorSecunndarioDiagonalAbajoIzquierdaArribaDerecha(String[][] dna) {
        int cnt = 0;
        for (int i = 3; i < dna.length; i++) {
            for (int j = 3; j < dna[i].length; j++) {
                if (dna[i][j].equals(dna[i-1][j-1]) &&
                        dna[i][j].equals(dna[i-2][j-2]) &&
                        dna[i][j].equals(dna[i-3][j-3])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    // metodo para determinar si un ADN es mutante

}






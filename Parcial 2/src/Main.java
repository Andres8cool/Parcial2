public class Main {

    public static void MostrarMatriz(String[][] matriz) {
        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[0].length; ++j) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
    public static void AnalisisADN(String[][] matriz) {
    try {
        MutanteOHumano mutOhum = new MutanteOHumano();
        System.out.println("EL siguiente ADN:");
        MostrarMatriz(matriz);
        if (mutOhum.isMutant(matriz)) {
            System.out.println("Es mutante\n");
        } else {
            System.out.println("No es mutante\n");
        }
    } catch (Exception e) {
        System.out.println("Matriz invalida: " + e.getMessage());
    }

}
    public static void main(String[] args) {
        System.out.println("Parcial 2");
// HUMANO
        String[][] HUMANO1 = new String[][]{
                {"A", "T", "G", "C", "G", "A"},
                {"C", "T", "G", "T", "T", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "C", "A", "G", "G"},
                {"C", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}};
//FILA   AAAA
        String[][] MUTANTE1 = new String[][]{
                {"A", "A", "A", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}};
//DIAGONAL AAAA
        String[][] MUTANTE2 = new String[][]{
                {"A", "A", "A", "T", "C", "G"},
                {"C", "A", "G", "A", "G", "T"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "T", "T", "A", "A"},
                {"T", "C", "A", "C", "T", "G"}};
//DIAGONAL GGGG
        String[][] MUTANTE3 = new String[][]{
                {"A", "G", "A", "T", "C", "G"},
                {"C", "A", "G", "A", "G", "T"},
                {"T", "T", "A", "G", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "T", "T", "A", "G"},
                {"T", "C", "A", "C", "T", "G"}};
// FILA CCCC
        String[][] MUTANTE4 = new String[][]{
                {"A", "A", "A", "T", "C", "G"},
                {"C", "A", "G", "A", "G", "T"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"G", "T", "C", "C", "C", "C"},
                {"T", "C", "A", "C", "T", "G"}};
//COLUMAN TTTT
        String[][] MUTANTE5 = new String[][]{
                {"A", "A", "A", "T", "C", "G"},
                {"C", "A", "G", "T", "G", "T"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "T", "G", "G"},
                {"C", "C", "T", "T", "A", "A"},
                {"T", "C", "A", "C", "T", "G"}};
//DIAGONAL TTTT
        String[][] MUTANTE6 = new String[][]{
                {"A", "A", "A", "T", "A", "G"},
                {"C", "A", "G", "G", "T", "T"},
                {"T", "T", "T", "G", "G", "T"},
                {"A", "G", "T", "T", "G", "G"},
                {"G", "A", "T", "A", "T", "A"},
                {"A", "C", "A", "C", "T", "T"}};
//COLUMAN TTTT
        String[][] MUTANTE7 = new String[][]{
                {"A", "A", "A", "T", "C", "G"},
                {"C", "A", "G", "A", "G", "T"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "T", "A", "G", "G", "G"},
                {"C", "T", "T", "T", "A", "A"},
                {"T", "T", "A", "C", "T", "G"}};
//ERROR
        String[][] MUTANTE8 = new String[][]{
                {"A", "A", "A", "T", "C", "G"},
                {"C", "A", "G", "A", "G", "T"},
                {"T", "T", "A", "8", "G", "T"},
                {"A", "T", "A", "G", "G", "G"},
                {"C", "T", "T", "T", "A", "A"},
                {"T", "T", "A", "C", "T", "G"}};
//ERROR
        String[][] MUTANTE9 = new String[][]{
                {"A", "A", "A", "T", "C"},
                {"C", "A", "G", "A", "G", "T"},
                {"T", "T", "A", "G", "G", "T"},
                {"A", "T", "A", "G", "G", "G"},
                {"C", "T", "T", "T", "A", "A"},
                {"T", "T", "A", "C", "T", "G"}};

        AnalisisADN(HUMANO1);
        AnalisisADN(MUTANTE1);
        AnalisisADN(MUTANTE2);
        AnalisisADN(MUTANTE3);
        AnalisisADN(MUTANTE4);
        AnalisisADN(MUTANTE5);
        AnalisisADN(MUTANTE6);
        AnalisisADN(MUTANTE7);
        AnalisisADN(MUTANTE8);
        AnalisisADN(MUTANTE9);
    }


}


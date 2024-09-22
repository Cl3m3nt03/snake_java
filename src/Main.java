public class Main {

    // Initilisation dataValue
    static int nullCase = 0;
    static int apple = 1;
    static int snake = 2;

    // Initialisation valeur max
    static int xMax = 8, yMax = 5;

    // Initilisation d'un tableau en 4 par 5
    static int[][] carre = new int[xMax][yMax];

    public static void main(String[] args) {

        jframe frame = new jframe(); 
        /*
        *   Matrice
        *    0 1 2 3
        * 0 [][][][] X
        * 1 [][][][]
        * 2 [][2][][]
        *           Y
        *    Initialisation
        *    int init = 1;
        *    Déclaration
        *    int def;
        *
        *   /n retour à la ligne
        */

        // initialisation coordonnés serpent
        carre[7][3-1] = snake;

        showMap();
    }

    public static void showMap(){
        StringBuilder visuel = new StringBuilder();

        for (int yCoord = 0; yCoord < yMax; yCoord++) {
            for (int xCoord = 0; xCoord < xMax; xCoord++) {
                visuel.append(carre[xCoord][yCoord]);
            }
            visuel.append("\n");
        }

        System.out.println(visuel);
    }
}
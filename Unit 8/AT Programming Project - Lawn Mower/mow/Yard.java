package mow;


public class Yard {
    

    public char LAWN_ARRAY[][];


    public void createLawn(int height, int width) {

        char[][] lawnArray = new char[height][width];

        // -- EDGES --

        int height1 = lawnArray.length;
        int width1 = lawnArray[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height1 - 1) {
                lawnArray[i][j] = 'R';
            } else {
                if (j == 0 || j == width1 -1) {
                lawnArray[i][j] = 'R';
            } else {
                lawnArray[i][j] = '+';
            }

            }
            }
        }


        /*
        for (int i = 0; i < lawnArray.length; i++) { //left edge
            lawnArray[i][0] = 'R';
        }
        
        for (int i = 0; i < lawnArray.length; i++) { // right edge
            lawnArray[i][lawnArray[0].length-1] = 'R';
        }

        for (int i = 0; i < lawnArray[0].length; i++) { // top edge
            lawnArray[0][i] = 'R';
        }
        for (int i = 0; i < lawnArray[0].length; i++) { // bottom edge
            lawnArray[lawnArray.length - 1][i] = 'R';
        }
        

        // -- GRASS --

        int w = 0;

        for (int i = 0;  i < lawnArray.length; i++) { //left edge
            
            if (i == lawnArray.length -1)
            w++;

            if (lawnArray[i][w] == 'R') {
            } else {
                lawnArray[i][w] = '+'; // add unmowed grass
            }
        }
        */

        LAWN_ARRAY = lawnArray;

        }


    public void lawnStatus(int r, int c) {

        System.out.println(LAWN_ARRAY[r][c]);

    }

    public  void mow(int r, int c, char mowed) {

        LAWN_ARRAY[r][c] = mowed;

    }

    public int height() { // does not include bricks

        int height = LAWN_ARRAY.length - 2;

        return height;

    }

    public int width() { // does not include bricks



        int width = LAWN_ARRAY[0].length - 2;

        return width;

    }

    public void printLawn() {


        int height = LAWN_ARRAY.length;
        int width = LAWN_ARRAY[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
            System.out.print(LAWN_ARRAY[i][j]);
            }
            System.out.println();
        }

    }

    
}

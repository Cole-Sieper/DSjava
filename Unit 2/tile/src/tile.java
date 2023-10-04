


public class tile {
    public static void main(String[] args) throws Exception {
        

        double gap= 0;
        double numtiles =0;
        double nwhitetiles =0;
        double nblacktiles =0;

        //inputs
        final double tilewidth = 5.0;
        double wallwidth;
        wallwidth = 56.0;

        //calculate number of tiles that fit between the walls
        numtiles =(int)(wallwidth/tilewidth);

        //caluclate how much space is not covered with tiles
        gap = wallwidth - numtiles * tilewidth;

        if (numtiles % 2 == 0 ) {
            /*decrease the numebr of tiles by 1
            this maintains the rule that pattern
            starts and ends with black tile*/
            numtiles = numtiles-1;
        }


        //calaculate the gap on eaither side of the tile
        gap = gap /2.0;

        //how many white tiels are there?
        nwhitetiles = (int)numtiles /2;

        //how many black tiels are there?
        nblacktiles = (int)(numtiles +1)/2;

        //outputs
        System.out.printf("The wall width = %.02f%n", wallwidth);
        System.out.printf("Number of tiles = %.02f%n", numtiles);
        System.out.printf("Gap = %.02f%n", gap);
        System.out.printf("Number of white tiles = %.0f%n", nwhitetiles);
        System.out.printf("Number of black tiles = %.0f%n", nblacktiles);
    }
}

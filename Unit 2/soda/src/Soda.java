public class Soda {
    public static void main(String[] args) throws Exception {

        //declare cansPerPack =6//
        final int cansPerPack = 6 ;
        final double canVolume = 0.335;
        /*can volume is the amount of liquid in liters that is in each can
        it is equal to 12 ounces per can which is 0.335 liters */

        final double bottleVolume = 2.0;
        System.out.println("Total Volume of pack of soda in liters:");
        System.out.println(canVolume * cansPerPack);
        //Total volume of a pack of soda in liters
        System.out.println("Total volume of a pack of soda + a bottle of soda:");
        System.out.println(canVolume * cansPerPack + bottleVolume);
    }
}

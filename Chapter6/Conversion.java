package Chapter6;

public class Conversion {
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }

    public static void generateTable(){
        double i = 1;
        double m = 20;
        for (i = 1; i < 11; i++){
            if (i < 10)
                System.out.print(" ");
            else
                System.out.print("");
            ///System.out.print(i + "     " + footToMeter(i));
            ///System.out.print("          ");
            ///System.out.print(m + "    " + meterToFoot(m) + "\n");
            System.out.printf("%-2.1f%s%6.3f%s%3.2f%s%8.3f\n", i, "    ", footToMeter(i), "         ", m, "     ", meterToFoot(m));
            m = m + 5;
        }
    }

    //print table
    public static void main(String[] args){
        System.out.println("Feet     Meters             Meters    Feet");
        System.out.println("------------------------------------------");
        generateTable();
    }
}

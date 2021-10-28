import java.util.ArrayList;

    public class Garage {
        private String garageNavn;
        private ArrayList<Car>parkBil = new ArrayList<Car>();

        public Garage(String garageNavn){this.garageNavn = garageNavn;}

        public String getGarageNavn() {return garageNavn;}

        public void setGarageNavn(String garageNavn) {this.garageNavn = garageNavn;}

        public void tilføjBil(Car bil){
            parkBil.add(bil);
        }

        public double beregnGrønAfgiftForBilpark() {
            double  totalAfgift = 0;
        for(Car car: parkBil){
            totalAfgift += car.beregnGrønEjerafgift();
        }
        return totalAfgift;
        }
        @Override
        public String toString() {

            String s = "" + garageNavn + ": ";
            for (Car b : parkBil){
                s += " \n";
                s += b.toString();
            }
            return s;
        }
    }

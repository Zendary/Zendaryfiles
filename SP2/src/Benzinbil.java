public class Benzinbil extends Car {
    private int oktantal;
    private int kmPrL;

    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s = "oktantal - " + oktantal + " : " + "kmPrL - " + kmPrL;
        return s;
    }

    public double beregnGrønEjerafgift() {
        double ejerAfgift = 0;
        if (kmPrL > 20 && kmPrL <=50){
            ejerAfgift = 330;
        }else if (kmPrL > 15 && kmPrL <=20){
            ejerAfgift = 1050;
        }else if (kmPrL > 10 && kmPrL <=15){
            ejerAfgift = 2340;
        }else if (kmPrL > 5 && kmPrL <=10){
            ejerAfgift = 5500;
        }else if (kmPrL <=5){
            ejerAfgift = 10470;
        }
        return ejerAfgift;
    }
}

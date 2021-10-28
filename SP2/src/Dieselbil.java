public class Dieselbil extends Car {
    private boolean harPartikelfilter;
    private int kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
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
        s = "harPartikelfilter - " + harPartikelfilter + " : " + "kmPrL - " + kmPrL;
        return s;
    }

    public double beregnUdligningsAfgift() {
        double udligningsAfgift = 0;
        if (kmPrL > 20 && kmPrL <=50){
            udligningsAfgift = 130;
        }else if (kmPrL > 15 && kmPrL <=20){
            udligningsAfgift = 1390;
        }else if (kmPrL > 10 && kmPrL <=15){
            udligningsAfgift = 1850;
        }else if (kmPrL > 5 && kmPrL <=10){
            udligningsAfgift = 2770;
        }else if (kmPrL <=5){
            udligningsAfgift = 15260;
        }
        return udligningsAfgift;
    }

    public double beregnGrønEjerafgift() {
        double ejerAfgift = 0;
        double udligningAfgift;
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
        if (!harPartikelfilter){
            ejerAfgift = 1000;
        }

        udligningAfgift = beregnUdligningsAfgift();
        return ejerAfgift + udligningAfgift;
    }

}

public class Elbil extends Car{
    private int batterikapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s = "batterikapacitetKWh - " + batterikapacitetKWh + " : " + "maxKm - " + maxKm + " : " + "whPrKm" + whPrKm;
        return s;
    }

    public double beregnGrønEjerafgift() {
        double ejerAfgift = 0;
        double omregnWhPrKm = 100 / (whPrKm / 91.25);
        if (omregnWhPrKm > 20 && omregnWhPrKm <=50){
            ejerAfgift = 330;
        }else if (omregnWhPrKm > 15 && omregnWhPrKm <=20){
            ejerAfgift = 1050;
        }else if (omregnWhPrKm > 10 && omregnWhPrKm <=15){
            ejerAfgift = 2340;
        }else if (omregnWhPrKm > 5 && omregnWhPrKm <=10){
            ejerAfgift = 5500;
        }else if (omregnWhPrKm <=5){
            ejerAfgift = 10470;
        }
        return ejerAfgift;
    }
}

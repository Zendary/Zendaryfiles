public class Main {
    public static void main(String[] args) {
        Garage g = new Garage("Lyngby garage");

        Car bil1 = new Benzinbil(256456, "Audi", "R5", 2020, 4, 95, 11);
        Car bil2 = new Dieselbil(752164, "Ford","Focus", 2019, 4, true, 13);
        Car bil3 = new Elbil(888256, "Tesla","X", 2020, 4,100,547,200 );

        g.tilføjBil(bil1);
        g.tilføjBil(bil2);
        g.tilføjBil(bil3);

        System.out.println(g.toString());

        System.out.println(g.beregnGrønAfgiftForBilpark());
    }
}

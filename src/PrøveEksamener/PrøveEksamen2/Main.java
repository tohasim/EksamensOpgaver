package PrøveEksamener.PrøveEksamen2;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Main prog = new Main();
        Beer beer1 = new Beer("Beer1", 50, 10);
        Beer beer2 = new Beer("Beer2", 50, 20);
        Beer beer3 = new Beer("Beer3", 50, 30);
        Beer beer4 = new Beer("Beer4", 50, 40);
        Beer[] beers = new Beer[]{beer1, beer2, beer3, beer4};
        System.out.println(prog.getAvgPrice(beers));
    }
    public double getAvgPrice(Beer[] beers){
        double avgPrice = 0;
        for(Beer beer : beers){
            avgPrice += beer.getPrice();
        }
        return avgPrice /= beers.length;
    }
}

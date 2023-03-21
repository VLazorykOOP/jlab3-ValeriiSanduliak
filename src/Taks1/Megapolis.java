package Taks1;

public class Megapolis extends Place{
    private int airportCount;
    private int parkCount;
    public Megapolis(String name,int population,int airportCount,int parkCount){
        super(name,population);
        this.airportCount = airportCount;
        this.parkCount = parkCount;
    }
    public void show() {
        System.out.println("Megapolis info");
        super.show();
        System.out.println("Airport Count : " + airportCount);
        System.out.println("Park Count: " + parkCount);
    }
}

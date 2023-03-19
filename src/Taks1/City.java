package Taks1;

public class City extends Place{
    private int streetCount;
    public City(String name,int population,int streetCount){
        super(name,population);
        this.streetCount = streetCount;
    }
    public void Show() {
        System.out.println("City info:");
        super.Show();
        System.out.println("Street Count: " + streetCount);
    }
}

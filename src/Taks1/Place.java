package Taks1;

public class Place
{
    private String name;
    private int population;
    public Place(String name,int population){
        this.name=name ;
        this.population = population;
    }
    public void Show(){
        System.out.println("Name: " + name);
        System.out.println("Population: " + population);
    }
}

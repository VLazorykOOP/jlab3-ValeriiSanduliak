package Taks1;
public class Region extends Place{
        private String country;
        public Region(String name,String country,int population){
            super(name,population);
            this.country = country;
        }
        public void show(){
            System.out.println("Region info:");
            super.show();
            System.out.println("Country: "+ country);
        }
}

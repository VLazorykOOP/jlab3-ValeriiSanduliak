package Taks1;
public class Region extends Place{
        private String capital;
        public Region(String name,String capital,int population){
            super(name,population);
            this.capital = capital;
        }
        public void Show(){
            System.out.println("Region info:");
            super.Show();
            System.out.println("Capital: "+ capital);
        }
}

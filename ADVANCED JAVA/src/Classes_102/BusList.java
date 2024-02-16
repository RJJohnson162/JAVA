package Classes_102;
import java.util.*;
public class BusList {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int Num_of_Buses = 67;
        Buses[] buses = new Buses[Num_of_Buses];
        for(int i = 0; i < buses.length; i++){
            buses[i] = new Buses();
            buses[i].setDetails(i + 1);
        }
        System.out.println("==================* BUS DETAILS *===================");
        for(Buses bus : buses){
            bus.DisplayData();
        }
        sc.close();
    }
}

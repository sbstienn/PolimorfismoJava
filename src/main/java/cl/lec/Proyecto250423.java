package cl.lec;

import clases.Motor;
import clases.Rueda;
import clases.Transmision;
import clases.Vehiculo;

public class Proyecto250423 {

    public static void main(String[] args) {
        Motor motor1 = new Motor(4,"Toyota");
        Rueda rueda1 = new Rueda("Tsubaki","Caucho","Grande");
        Transmision transmision1 = new Transmision("Tsubaki",13);
        Vehiculo vehiculo1 = new Vehiculo("Deportivo","Toyota",motor1,rueda1,transmision1);
        
        
    }
}

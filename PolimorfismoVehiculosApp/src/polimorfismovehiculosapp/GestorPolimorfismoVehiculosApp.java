
package polimorfismovehiculosapp;


public class GestorPolimorfismoVehiculosApp {

    
    public static void main(String[] args) {
        Trailer trailer1= new Trailer(8,"PASND",4);
        Camion camion1=new Camion(4,"LASD",2);
        Coche coche1= new Coche(2,"GD3T",2);
        Bus bus1= new Bus(10,"PDF45",2);
        Vehiculo [] arrVehiculo= new Vehiculo[4];
        arrVehiculo[0]=trailer1;
        arrVehiculo[1]=camion1;
        arrVehiculo[2]=coche1;
        arrVehiculo[3]=bus1;
        
        for(int i=0;i<4;i++){
            arrVehiculo[i].mostrarInfoVehiculo();
            System.out.println("Precio de Alquiler de el vehiculo: " + arrVehiculo[i].precioAlquiler());
        }
        
    }
    
}

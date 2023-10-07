import java.util.Objects;

public class Vehicle {

    private String  vehicleType;
    private String vehicleNom;
    public Motor motor;
    protected Door door;

    public Vehicle(String vehicleType, String vehicleNom){
        this.vehicleNom = vehicleNom;
        this.vehicleType = vehicleType;
        this.motor = new Motor();
        this.door = new Door(0,0);

    }



    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNom() {
        return vehicleNom;
    }

    public void setVehicleNom(String vehicleNom) {
        this.vehicleNom = vehicleNom;
    }

    public int getTotalDoors(){
        return door.getTotalDoors();
    }

    public void setDoor(int passenger, int trunk) {
        this.door = new Door(passenger,trunk);
    }

    public class Motor{
        protected String motorType;

        public Motor(){
            if(vehicleType.equals("4WD") && vehicleNom.equals("Crysler")){
                motorType = "Large";
            }
            else {
                motorType = "Small";
            }
        }

        public String getMotorType() {
            return motorType;
        }


    }

    public static class Door {
        protected int passengerDoor;
        protected int trunk;

        public  Door(int passengerDoor, int trunk){
            this.passengerDoor  = passengerDoor;
            this.trunk = trunk;

        }

        public  int getTotalDoors() {

            return passengerDoor;


        }


        public int getTrunk() {
            return trunk;
        }

        // We can't access to Vehicule Attributs in this Static class
      /*  public String getVehicleNom(){
            return vehicleType;
        }

       */


    }
}

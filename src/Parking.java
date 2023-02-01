import java.time.LocalTime;

class Parking{
    private VehicleOwner vehicleOwner;
    public Parking(){}
    public Parking(VehicleOwner vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }
    public VehicleOwner getVehicleOwner() {
        return vehicleOwner;
    }
    public void setVehicleOwner(VehicleOwner vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }
    //this function is for parking-in and parking-out
    //it works based on the controller(
    // it forces the controller to invoke the "execute" function
    // )

    /*the controller has three types
    * 1- first come (park-in)
    * 2- Best Fit (park-in)
    * 3- park-out
    * */
    void Perform(ParkingController parkingController){

        Slot resultSlot= parkingController.execute(vehicleOwner);
        //only the park-out returns 2 to identify itself
        if(resultSlot.getID()==-2)
            return;
        // park-in classes return -1 which means that there are no suitable slots
        if(resultSlot.getID()==-1){
            System.out.println("no available slots");
        }else {
            //setting slot id in vehicle id for later(we will need this in the park-out function)
            vehicleOwner.getVehicle().setID(resultSlot.getID());
            //saving arrival time
            int t=LocalTime.now().toSecondOfDay();
            vehicleOwner.setArrivalTime(t);
            //customer enters this id to identify himself when parking out
            System.out.println("your slot id is:"+ resultSlot.getID());

        }

    }
}
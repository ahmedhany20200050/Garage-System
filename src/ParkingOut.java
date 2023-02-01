import java.time.LocalTime;

class ParkingOut implements ParkingController{
    @Override
    public Slot execute(VehicleOwner vehicleOwner) {
        //getting current time in seconds
        int time=LocalTime.now().toSecondOfDay();
        //calculating deference between arrival time and departure time in hours
        int difference=(time-vehicleOwner.getArrivalTime())/360;
        if(difference==0)
            difference++;
        // 5 pounds for each hour
        double fee=5*difference;
        //adding money to total income
        garageInfo.setTotal_income(fee);
        System.out.println("your fee is:"+fee);
        // making the slot with a certain id(stored in vehicle data) empty for later
        garageInfo.getArr().get(vehicleOwner.getVehicle().getID()).setIsavaliable(true);
        //updating vehicles number
        garageInfo.decerementNumOfVehicles();
        //this funtion returns a trivial slot to identify itself
        Slot slot =new Slot();
        slot.setID(-2);
        return slot;

    }
}
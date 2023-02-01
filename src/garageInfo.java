import java.util.ArrayList;

class garageInfo{
    private static ArrayList<Slot> slots;


    //this array is for customers whose vehicle are currently in our garage
    private static ArrayList<VehicleOwner>vehicleOwners=new ArrayList<VehicleOwner>();
    // a number to identify park in configuration (only 1 or 2)
    private static int park_in_method;
    private static double total_income=0;
    //numbers of vehicles currently in garage
    private static int numOfVehicles=0;
    public garageInfo(){

    }

    public static double getTotal_income() {
        return total_income;
    }

    public static void setTotal_income(double fee) {
        total_income += fee;
    }

    public static int getNumOfVehicles() {
        return numOfVehicles;
    }

    //used when a new customer comes in
    public static void incerementNumOfVehicles() {
        numOfVehicles++;
    }
    //used when a customer leaves
    public static void decerementNumOfVehicles() {
        numOfVehicles--;
    }


    public static void setArr(ArrayList<Slot>arrayList) {
        slots=arrayList;
        //arr = arr1;
    }

    public static ArrayList<Slot> getArr() {
        return slots;
    }

    public static void setPark_in_method(int park_in_method) {
        garageInfo.park_in_method = park_in_method;
    }

    public static int getPark_in_method() {
        return park_in_method;
    }

    //used when a new customer comes in
    public static void addVehicleOwners(VehicleOwner vehicleOwner) {
        vehicleOwners.add(vehicleOwner);
    }
    //used when a customer leaves
    public static void deleteVehicleOwner(int id) {
        for (int i = 0; i < vehicleOwners.size(); i++) {
            if(id==vehicleOwners.get(i).getVehicle().getID()){
                vehicleOwners.remove(i);
                break;
            }
        }
    }

    public static ArrayList<VehicleOwner> getVehicleOwners() {
        return vehicleOwners;
    }
}
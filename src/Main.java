import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getting garage details first.
        //getting his name
        System.out.println("Enter Name:");
        Scanner read= new Scanner(System.in);
        String name=read.next();
        GarageOwner garageOwner=new GarageOwner(name);
        //performing task(getting garage details)
        Task task=new Task();
        task.PerformTask(new EnteringDetails());
        //list of park-in controllers(park-in options)
        ArrayList<ParkingController> parkingControllers=new ArrayList<ParkingController>();
        parkingControllers.add(new FirstCome());
        parkingControllers.add(new BestFit());

        while (true){
            //showing lis of options
            int option;
            System.out.println("type option number:\n" +
                    "1 Display available slots\n" +
                    "2 Display total income\n" +
                    "3 Display number of vehicles\n" +
                    "4 park in\n" +
                    "5 park out");
            //getting option
            Scanner scanner=new Scanner(System.in);
            option=scanner.nextInt();
            if(option==1){
                //if option equals 1, display empty slots only
                task.PerformTask(new Displaying_Slots());
            } else if (option==2) {
                //if option equals 2, show total income
                task.PerformTask(new Displaying_TotalIncome());
            } else if (option==3) {
                //if option equals 3, show how many vehicles are in the garage currently
                task.PerformTask(new Displaying_numofVehicles());
            } else if (option==4) {

//                //if option is number 4, perform parking-in
                Vehicle vehicle = new Vehicle();
                //get vehicle details
                System.out.println("Enter Vehicle Details:\n" +
                        "Model Name: ");
                Scanner scanner1=new Scanner(System.in);
                vehicle.setModelName(scanner1.next());
                System.out.println("Model Year: ");
                vehicle.setModelYear(scanner1.nextInt());
                System.out.println("Width: ");
                vehicle.setWidth(scanner1.nextDouble());
                System.out.println("Depth: ");
                vehicle.setDepth(scanner1.nextDouble());
                //trivial id until we find a suitable slot
                vehicle.setID(-1);
                //getting customer information
                System.out.println("Enter Your Name: ");
                String ownerName=scanner1.next();
                VehicleOwner vehicleOwner=new VehicleOwner(ownerName,vehicle);

                Parking parking=new Parking(vehicleOwner);
                //getting method number
                ParkingController method= parkingControllers.get(garageInfo.getPark_in_method()-1);
                //perform parking in based on the garage owner's choice
                parking.Perform(method);


            } else if (option==5) {
                //if option equals 5, park-out
                //getting slot id (vehicle id)
                System.out.println("enter ID:");
                Scanner scanner1= new Scanner(System.in);
                int id=scanner1.nextInt();
                Parking parking=new Parking();
                //getting list of all vehicle owner whose vehicles are currently in our garage
                ArrayList<VehicleOwner>vehicleOwners=garageInfo.getVehicleOwners();


                VehicleOwner vehicleOwner;
                boolean ok=false;
                //search for that id
                for (int i = 0; i < vehicleOwners.size(); i++) {
                    if(id==vehicleOwners.get(i).getVehicle().getID()){
                        ok=true;
                        //if found get vehicle owner's data
                        vehicleOwner=vehicleOwners.get(i);
                        //delete him
                        garageInfo.deleteVehicleOwner(i);
                        //perform park-out
                        parking.setVehicleOwner(vehicleOwner);
                        parking.Perform(new ParkingOut());
                        break;
                    }
                }


                if(ok){
                    System.out.println("success");
                }else {
                    System.out.println("id not found");
                }

            } else {
                //if option is any other number exit this program
                break;
            }
        }
    }
}

import java.util.ArrayList;

class FirstCome implements ParkingController{

    @Override
    public Slot execute(VehicleOwner vehicleOwner) {
        //getting all slots
        ArrayList<Slot>slots= garageInfo.getArr();
        //sending vehicle owner's data
        garageInfo.addVehicleOwners(vehicleOwner);
        for (int i=0;i<slots.size();i++){
            //if this slot is empty and dimensions are suitable then pick it
            if(slots.get(i).getIsavaliable()){
                double d=vehicleOwner.getVehicle().getDepth(),w=vehicleOwner.getVehicle().getWidth(),
                slotDepth=slots.get(i).getDepth(), slotWidth=slots.get(i).getWidth();

                if(slotDepth>=d&&slotWidth>=w){

                    slots.get(i).setIsavaliable(false);
                    garageInfo.incerementNumOfVehicles();
                    return slots.get(i);

                }
            }

        }
        //if not found send a slot with id = -1
        Slot notFoundSlot=new Slot();
        notFoundSlot.setID(-1);
        return notFoundSlot;
    }
}
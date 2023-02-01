import java.util.ArrayList;

class BestFit implements ParkingController{

    @Override
    public Slot execute(VehicleOwner vehicleOwner) {
        // getting all slots to check each one
        ArrayList<Slot>slots=garageInfo.getArr();
        Slot result=new Slot();
        //in case of not finding any suitable slot this object will be sent with this id
        result.setID(-1);
        double minDiffrence=Double.MAX_VALUE;
        for (int i = 0; i < slots.size(); i++) {
            double slotDepth=slots.get(i).getDepth(),slotWidth=slots.get(i).getWidth(),
            vDepth=vehicleOwner.getVehicle().getDepth(),vWidth=vehicleOwner.getVehicle().getWidth();

            //is it suitable?
            if(slotDepth<vDepth || slotWidth <vWidth|| !slots.get(i).getIsavaliable()){
                continue;
            }

            //is the diffrence smaller?
            double slotArea=slotDepth*slotWidth,vArea=vDepth*vWidth;
            double diffrence=Math.abs(slotArea-vArea);
            if(diffrence<minDiffrence){
                //setting new diffrence
                result=slots.get(i);
                minDiffrence=diffrence;
            }

        }
        //if you found a suitable slot aka: with id not equeal to -1 go here
        if(result.getID()!=-1){
            //make it not empty
            result.setIsavaliable(false);
            //update current array list's slots
            slots.set(result.getID(), result);
            //set the slots in garage info to our new updated array list of slots
            garageInfo.setArr(slots);
            //adding vehicle with vehicle owner
            garageInfo.incerementNumOfVehicles();
            garageInfo.addVehicleOwners(vehicleOwner);
        }

        return result;
    }
}
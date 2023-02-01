import java.util.ArrayList;

class Displaying_Slots implements TaskController{

    @Override
    public void executeTask() {
        //getting all slots from garage info class
        ArrayList<Slot>slots=garageInfo.getArr();
        for (int i=0;i<slots.size();i++){
            //only print slot details if it is available
            if(slots.get(i).getIsavaliable()){
                System.out.println(" \n\nslot info: \nid:"+ slots.get(i).getID()+"\nwidth:"+slots.get(i).getWidth()
                +", depth:"+slots.get(i).getDepth()
                );
            }


        }
    }
}
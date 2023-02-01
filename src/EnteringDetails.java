import java.util.ArrayList;
import java.util.Scanner;

class EnteringDetails implements TaskController{

    @Override
    public void executeTask() {
        //getting size of our array list
        System.out.println("enter size(number of slots):");
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        //creating empty array list of slots
        ArrayList<Slot>arrayList=new ArrayList<Slot>();
        //entering details of each slot
        for (int i=0;i<x;i++){
            double w,d;
            System.out.println("enter width");
            w=read.nextDouble();
            System.out.println("enter depth");
            d=read.nextDouble();
            Slot s=new Slot(i,w,d,true);
            arrayList.add(s);
        }
        //setting parking method based on the choice number provided by garage owner
        int choice;
        //making sure he enters a valid number
        while (true){
            System.out.println("Enter park-in method number\n" +
                    "1 First Come\n" +
                    "2 Best-Fit\n");
            Scanner scanner=new Scanner(System.in);
            choice= scanner.nextInt();
            if(choice==1||choice==2)
                break;

        }
        //sending parking method and list of slots
        garageInfo.setPark_in_method(choice);
        garageInfo.setArr(arrayList);
    }
}
public class Lux extends Wagon {
    private int maxSeats = 5;
    boolean[] seats = new boolean[maxSeats];

    //Get the maximum number of seats in the wagon
    @Override
    public  int getMaxSeats(){return maxSeats;}

    //Get the type of the wagon
    @Override
    public String getType(){
        return "Lux";
    }

    //Get the number of empty seats in the wagon
    @Override
    public int emptySeats(){
        int i = 0;
        for(boolean el : seats){
            if(!el){
                i++;
            }
        }
        return i;
    }

    //Prints the status of each seat in the wagon
    @Override
    public void showEmptySeats(){
        for(int i = 0; i<seats.length;i++){
            System.out.print(i+1+" : " +(seats[i]?"Sold || ":"Empty || "));
            if((i+1)%2==0){
                System.out.println();
            }
        }
        System.out.println();
    }

    //Return the seats in the wagon
    @Override
    public  boolean[] seats(){
        return seats;
    }

}

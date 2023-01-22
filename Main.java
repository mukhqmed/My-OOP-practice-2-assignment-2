//Importing required libraries
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    // Main method
    public static void main(String[] args) {
        // Creating a new Scanner object to read input
        Scanner in = new Scanner(System.in);
        Train A = new Train();// Creating a new Train object

        A.setMaxWagon(15);// Setting max number of wagons for the train

        A.setName("Scotsman");// Setting name of the train

        A.setPassengers(new ArrayList<>());// Setting passengers for the train

        ArrayList<Wagon> temp = new ArrayList<>();// Creating a temporary list of wagons

        // Loop to add wagons to the train
        for (int i = 0; i < 15; i++) {
            if (i >= 10) {
                temp.add(new Lux());
            } else if (i < 5) {
                temp.add(new Platskart());
            } else {
                temp.add(new Kupe());
            }
        }
        A.setWagons(temp);// Setting the wagons for the train
        // Adding passengers to the train
        {
            ArrayList<Passenger> passengers = new ArrayList<>();
            passengers.add(new Person(1,"Mukhammed", "Kaskyrbayev", 18, "NO", 1, A, 1));
            passengers.add(new Person(2,"Jack", "Johnson", 30, "NO", 1, A, 2));
            passengers.add(new Person(3,"Emily", "Williams", 22, "YES", 1, A, 3));
            passengers.add(new Person(4,"Michael", "Brown", 27, "YES", 2, A, 4));
            passengers.add(new Person(5,"Madison", "Jones", 19, "NO", 2, A, 5));
            passengers.add(new Person(6,"Jacob", "Miller", 32, "YES", 2, A, 6));
            passengers.add(new Person(7,"Sophia", "Davis", 24, "NO", 3, A, 7));
            passengers.add(new Person(8,"Ethan", "Garcia", 28, "YES", 3, A, 8));
            passengers.add(new Person(9,"Isabella", "Rodriguez", 21, "NO", 4, A, 9));
            passengers.add(new Person(10,"Noah", "Martinez", 26, "YES", 4, A, 10));
            passengers.add(new Person(11,"Ava", "Anderson", 20, "NO", 2, A, 11));
            passengers.add(new Person(12,"William", "Taylor", 29, "YES", 3, A, 12));
            passengers.add(new Person(13,"Mia", "Thomas", 23, "NO", 4, A, 13));
            passengers.add(new Person(14,"Alexander", "Hernandez", 31, "YES", 5, A, 14));
            passengers.add(new Person(15,"Madison", "Moore", 18, "NO", 3, A, 15));
            passengers.add(new Person(16,"Olivia", "Smith", 25, "YES", 2, A, 16));
            passengers.add(new Person(17,"Benjamin", "Martin", 27, "YES", 4, A, 16));
            passengers.add(new Person(18,"Elizabeth", "Jackson", 22, "NO", 3, A, 17));
            passengers.add(new Person(19,"Nicholas", "Thompson", 30, "Y", 5, A, 18));
            passengers.add(new Person(20,"Addison", "White", 25, "NO", 1, A, 19));
            passengers.add(new Person(21,"Natalie", "Harris", 24, "YES", 3, A, 20));
            passengers.add(new Person(22,"Evelyn", "Young", 29, "NO", 4, A, 21));
            passengers.add(new Person(23,"Landon", "Allen", 31, "YES", 3, A, 22));
            passengers.add(new Person(24,"Avery", "King", 20, "NO", 4, A, 23));
            passengers.add(new Person(26,"Eli", "Wright", 26, "YES", 5, A, 24));
            passengers.add(new Person(27,"Aurora", "Scott", 23, "NO", 5, A, 25));
            A.setPassengers(passengers);
        }
        Train B = new Train();// Creating a new Train object
        A.setMaxWagon(10);// Setting max number of wagons for the train
        B.setPassengers(new ArrayList<>());// Setting passengers for the train
        B.setName("Blue");// Setting name of the train
        ArrayList<Wagon> temp1 = new ArrayList<>();// Creating a temporary list of wagons
        // Adding wagons to the temporary list
        temp1.add(new Lux());
        temp1.add(new Kupe());
        temp1.add(new Platskart());
        B.setWagons(temp1);// Setting the wagons for the train

        // Adding passengers to the train
        {
            ArrayList<Passenger> passengers = new ArrayList<>();
            passengers.add(new Person(28,"Name", "Surname", 77, "NO", 1, B, 3));
            passengers.add(new Person(29,"Zatvat", "Kunal", 17, "YES", 1, A, 1));
            passengers.add(new Person(30,"Jane", "Doe", 77, "NO", 2, B, 4));
            passengers.add(new Person(31,"John", "Smith", 77, "NO", 2, B, 5));
            passengers.add(new Person(32,"Bob", "Johnson", 20, "NO", 3, B, 6));
            passengers.add(new Person(33,"Alice", "Williams", 21, "YES", 4, B, 7));
            passengers.add(new Person(34,"Charlie", "Jones", 15, "NO", 5, B, 8));
            passengers.add(new Person(35,"David", "Brown", 32, "YES", 5, B, 9));
            passengers.add(new Person(36,"Emily", "Davis", 55, "NO", 4, B, 10));
            passengers.add(new Person(37,"Michael", "Miller", 65, "NO", 1, B, 11));
            passengers.add(new Person(38,"Sarah", "Garcia", 77, "YES", 2, B, 12));
            passengers.add(new Person(39,"Jessica", "Martinez", 77, "NO", 5, B, 13));
            passengers.add(new Person(40,"Jacob", "Anderson", 26, "NO", 4, B, 14));
            passengers.add(new Person(41,"Amanda", "Taylor", 57, "YES", 3, B, 15));
            passengers.add(new Person(42,"Matthew", "Thomas", 27, "NO", 2, B, 16));
            passengers.add(new Person(43,"Ashley", "Hernandez", 78, "NO", 4, B, 17));
            passengers.add(new Person(44,"Joshua", "Moore", 77, "NO", 5, B, 18));
            B.setPassengers(passengers);
        }
        // Setting max number of wagons for the train
        B.setMaxWagon(3);
        // Creating a list of trains
        ArrayList<Train> Trains = new ArrayList<>();
        // Adding trains to the list
        Trains.add(A);
        Trains.add(B);

        // Infinite loop to display menu options to user
        while (true) {
            System.out.println("""
                    1.Search passenger by name
                    2.Add a new passenger to train
                    3.Remove passenger
                    4.Information about all passenger
                    5.Change the passenger information
                    6.Show the exact group of passengers(Seniors, Adults, Minors):
                    *.Exit menu""");
            // Reading user input
            int n = in.nextInt();
            // Switch statement to handle user input
            switch (n) {
                case 1 -> {
                    // Prompting user for name of passenger to search for
                    System.out.print("Enter name of passenger to search for: ");
                    // Reading user input
                    String searchName = in.next();
                    boolean found = false;// Flag to check if passenger was found
                    // Getting list of passengers from the train
                    ArrayList<Passenger> passengers = findTrain(Trains).getPassengers();
                    // Loop through the passengers to find the matching name
                    for (Passenger passenger : passengers) {
                        if (passenger.getName().equalsIgnoreCase(searchName)) {
                            found = true;
                            // Displaying information about the passenger
                            passenger.infoAboutPassenger();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Passenger not found.");
                    }

                }
                case 2 -> addPassenger(Trains);
                case 3 -> {
                    ArrayList<Passenger> passengers = findTrain(Trains).getPassengers();
                    //Check if the train is empty
                    if (passengers.isEmpty()) {
                        System.out.println("This is empty train");
                        break;
                    }
                    removePassenger(passengers);
                }
                case 4 -> {
                    ArrayList<Passenger> passengers = findTrain(Trains).getPassengers();
                    //Check if the train is empty
                    if (passengers.isEmpty()) {
                        System.out.println("This is empty train");
                        break;
                    }
                    infoAboutAllPassengers(passengers);
                }
                case 5 -> {
                    ArrayList<Passenger> passengers = findTrain(Trains).getPassengers();
                    //Check if the train is empty
                    if (passengers.isEmpty()) {
                        System.out.println("This is empty train");
                        break;
                    }
                    changeInfo(passengers);
                }
                //Case 6: View information of passengers based on age group
                case 6 -> {
                    System.out.println("1. Passengers who are 65 and older");
                    System.out.println("2. Adult passengers (18-65 years of age)");
                    System.out.println("3. Minors (under 18 years of age)");
                    int option = in.nextInt();
                    ArrayList<Passenger> passengers = findTrain(Trains).getPassengers();
                    switch (option) {
                    //View information of passengers who are 65 and older
                        case 1 -> {
                            for (Passenger passenger : passengers) {
                                if (passenger.getAge() >= 65) {
                                    passenger.infoAboutPassenger();
                                }
                            }
                        }
                        //View information of adult passengers (18-65 years of age)
                        case 2 -> {
                            for (Passenger passenger : passengers) {
                                if (passenger.getAge() >= 18 && passenger.getAge() < 65) {
                                    passenger.infoAboutPassenger();
                                }
                            }
                        }
                        //View information of minors (under 18 years of age)
                        case 3 -> {
                            for (Passenger passenger : passengers) {
                                if (passenger.getAge() < 18) {
                                    passenger.infoAboutPassenger();
                                }
                            }
                        }
                    }
                }
                //Case 0: Exit the program
                case 0 -> {
                    return;
                }
            }
        }
    }
    //This method is used to change information of a passenger
    private static void changeInfo(ArrayList<Passenger> passengers) {
        Scanner in = new Scanner(System.in);
        System.out.print("Id of this passenger :");
            //get the id of the passenger to be changed
        int id = in.nextInt();
        for (Passenger newPas : passengers) {
            //check if the passenger id matches the id entered
            if (newPas.getId() == id) {
                newPas.infoAboutPassenger();
                System.out.println("""
                        Сhoose what you want to change:
                        1.Name
                        2.Surname\s
                        3.Age
                        4.The disability status
                        *.Exit""");
                int n = in.nextInt();
                System.out.print("Not correct");
                switch (n) {
                    //Change the name of the passenger
                    case 1 -> {
                        System.out.print("name : ");
                        String name = in.next();
                        newPas.setName(name);
                        System.out.println("Name changed!\n");
                        return;
                    }
                    //Change the surname of the passenger
                    case 2 -> {
                        System.out.print("surname : ");
                        String surname = in.next();
                        newPas.setSurname(surname);
                        System.out.println("Surname changed!\n");
                        return;
                    }
                    //Change the age of the passenger
                    case 3 -> {
                        System.out.print("age : ");
                        int age = in.nextInt();
                        newPas.setAge(age);
                        System.out.println("Age changed!\n");
                        return;
                    }
                    //Change the disability status of the passenger
                    case 4 -> {
                        System.out.print("form (YES/NO):");
                        String dis = in.next();
                        while (!dis.equalsIgnoreCase("YES") && dis.equalsIgnoreCase("NO")) {
                            System.out.print("Write 'YES' or 'NO': ");
                            dis = in.next();
                        }
                        newPas.setDisabled((dis.equalsIgnoreCase("YES")));
                        System.out.println("Disability status changed!\n");
                        return;
                    }
                    //Exit
                    case 0 -> {
                        return;
                    }
                }
            }
        }
        System.out.println("Passenger was not found.");
    }

    //This method prints information about all passengers in the train
    private static void infoAboutAllPassengers(ArrayList<Passenger> passengers) {
        int count = 0;
        for (Passenger pas : passengers) {
            pas.infoAboutPassenger();
            count++;
        }
        System.out.println(count + " passenger in this train.\n");
    }

    //This method removes a passenger from the train based on the name given by the user
    private static void removePassenger(ArrayList<Passenger> passengers) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of passenger that must be removed: ");
        String searchName = in.next();
        boolean found = false;
        for (Passenger passenger : passengers) {
            if (passenger.getName().equalsIgnoreCase(searchName)) {
                found = true;
                passenger.infoAboutPassenger();
                System.out.print("This passenger will be removed without the right to resume? Are you sure you want to remove this " +
                        "passenger(YES/NO) :");
                String ans = in.next();
                if (ans.equals("YES")) {
                    passengers.remove(passenger);
                    System.out.println("Passenger was removed!\n");
                } else {
                    System.out.println("Passenger was not removed.\n");
                }
                return;
            }
            break;
        }
        System.out.println("Passenger was not found.");
    }
    private static void addPassenger(ArrayList<Train> Trains) {
        //initialize scanner to read input from user
        Scanner in = new Scanner(System.in);
        //prompt user to select a train
        System.out.println("Select the train : ");
        //loop through list of trains and display information
        for (Train train : Trains) {
            infoTrain(train);
        }
        //prompt user to enter the name of the train they want to select
        System.out.print("Name of train : ");
        String trainName = in.next();
        //validate that the train exists
        while (!trainName.equalsIgnoreCase("Scotsman") && !trainName.equalsIgnoreCase("Blue")) {
            System.out.print("Train with such name does not exist: ");
            trainName = in.next();
        }
        //assign the selected train to a variable
        Train train = (trainName.equalsIgnoreCase("Blue") ? Trains.get(1) : Trains.get(0));

        //prompt user to select a wagon
        System.out.println("Select the id of wagon.");

        //display information about the train and wagons
        infoTrain(train);
        int idWagon = in.nextInt();

        //validate that the wagon id entered exists
        while (idWagon < 1 || idWagon > train.getMaxWagon()) {
            System.out.print("Wagon with such id does not exist. ");
            idWagon = in.nextInt();
        }
        //get the selected wagon
        Wagon wagon = train.getWagon(idWagon - 1);
        //display the empty seats in the wagon
        wagon.showEmptySeats();
        //prompt user to enter a seat number
        System.out.print("Enter the number of seat place : ");
        int seat = in.nextInt();
            //validate that the seat number entered is valid
        while (seat < 1 || seat > wagon.getMaxSeats()) {
            System.out.print("This data not correct.Try again, and write correctly. ");
            seat = in.nextInt();
        }
        //confirm that the seat is booked
        System.out.println("Place is booked.");
        //prompt user to enter passenger's name
        System.out.print("Enter the name of passenger : ");
        String name = in.next();

        //prompt user to enter passenger's surname
        System.out.print("Surname of the passenger : ");
        String surname = in.next();

        //prompt user to enter passenger's age
        System.out.print("Age of the passenger : ");
        int age = in.nextInt();

        //prompt user to enter whether the passenger has a disability
        System.out.print("The passenger has a disability?(YES/NO):");
        String disabled = in.next();
        //validate the input
        while (!disabled.equalsIgnoreCase("YES") && !disabled.equalsIgnoreCase("NO")) {
            System.out.print("Enter 'YES' or 'NO'");
            disabled = in.next();
        }

    }



    //This function prompts the user to select a train from a list of options
    private static Train findTrain(ArrayList<Train> Trains) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which train is the passenger on?\n1.Scotsman\n2.Blue");
        int k = in.nextInt();
        //Validate user input
        while (k != 1 && k != 2) {
            System.out.print("Enter 1 to select Scotsman , 2 to select Blue : ");
            k = in.nextInt();
        }
        return Trains.get(k - 1);
    }
        //This function prints information about a specific train
    private static void infoTrain(Train train) {
        System.out.println("In the train " + train.getName() + " has:");
        for (Wagon wagon : train.getWagons()) {
            System.out.println("\tID : " + wagon.getId() + " | In " + wagon.getType() + " has " + wagon.emptySeats() + " empty seats.");
        }
        System.out.println();
    }
}
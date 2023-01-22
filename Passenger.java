public abstract class Passenger {
    private int id;
    private int counter;
    private String name;
    private String surname;
    private int age;
    private boolean disabled;
    private int idOfWagon;
    private Train train;
    private int seat;
    //Initialize a passenger with specific information
    public Passenger(int id, String name , String surname, int age, String disabled, int idOfWagon, Train train){
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.disabled = (disabled.equalsIgnoreCase("YES"));
        this.id = id;
        this.train = train;
        this.idOfWagon = idOfWagon;
        //Increment the number of passengers
        counter++;
    }

    //Prints information about a specific passenger
    public void infoAboutPassenger(){
        System.out.println("ID : " + id + " | Name : " + name + " | Surname : " + surname + " | Age : " + age + "  | Disability status : " + isDisabled());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Get whether the passenger is disabled or not
    public boolean isDisabled() {
        return disabled;
    }
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

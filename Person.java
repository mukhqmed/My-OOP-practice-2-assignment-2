public  class Person extends Passenger{


    public Person(int id,String name , String surname,int age,String disabled ,int idOfWagon,Train train) {
        super(id, name, surname, age,disabled,idOfWagon,train);
    }
    public Person(int id, String name , String surname,int age,String disabled ,int idOfWagon,Train train,int seat){
        super(id, name, surname, age,disabled,idOfWagon,train);
    }



}

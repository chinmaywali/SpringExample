package car.example.constructor.injection;

public class car {
    private Specification specification;

    public car(Specification specification) { // constructor injection
        this.specification = specification;
    }


    public void displayDetails(){
        System.out.println("Car Details : "+specification.toString());
    }
}

Constructor 
    Constructors are use to initialize an object.
* Normal Constructor
Normal Constructors are excute by using pre deterime values or  default values.
Example:    
    Car(){
    brand= "Toyata";
    }

* Parameterized constructor

coustructor that use one or more parameters.
these type of parameters are mostly use in programmes where requried user inputs.
Example:

    Car(String brand) {
    this.brand = brand;
    }
Example 02: Constructors with more than one parameters

    Employee(String Name,String ServiceID,Double Salary){
    this.Name= Name;
    this.ServiceID= ServiceID;
    this.Salary =Salary;
    }

* Why we use key word "this" in Parameterized Constructors ?
  this refers to the particular/current object and lets us access its values (fields)

* FINAL EXAMPLE
    public class Car{ // creating class named car
        String brand;           // attiributes of the car class
        Car(String brand){      // creating parameterized constructor "brand " is the parameter to this constructor 
        this.brand=brand
        
    
    }
public class main(String args[]){
Car CAR1= new Car(Toyata);      //by passing values to constructors 
System.out.println("Car Brand: " + CAR1.brand);
}
}
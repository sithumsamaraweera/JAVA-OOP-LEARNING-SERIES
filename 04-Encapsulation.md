# Encapsulation
Encapsulation is the OOP concept of bundling data and 
methods together in a class and controlling access to the data or method.
## How to secure/control the data?

To prevent direct access to data from outside the class, we use the `private` keyword.

Example:

private String name;

private void calculateBalance() {
// ...
}

A `private` member can only be accessed directly from within the same class.

## Get and Set Methods

Getter and setter methods provide controlled access to private variables.

- **Getter (`get`)** → used to read/access the value of a private variable.
- **Setter (`set`)** → used to change/update the value of a private variable.


  * Example 01 ;

  public class ENCA {
  private String name;
  private int AccountNumber;

      public String getName(){ 
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getAccountNumber() {
          return AccountNumber;
      }

      public void setAccountNumber(int accountNumber) {
          AccountNumber = accountNumber;
      }
  }
* Example 02 ;
  public class ENCA {
  private String name;
  private int AccountNumber;

  public String getName() {
  return name;
  }

  public void setName(String name) {
  this.name = name;
  }

  public int getAccountNumber() {
  return AccountNumber;
  }

  public void setAccountNumber(int accountNumber) {
  AccountNumber = accountNumber;
  }

  public void main(String args[]) {
  ENCA holder = new ENCA();
  holder.setName("Jennie"); //setting up the value as Jennie by using setmethod
  holder.setAccountNumber(123);

System.out.println("Account Holder Name " + holder.getName());//retriving the values which store in private variable
System.out.println("Account Holder Name " + holder.getAccountNumber());

  }
  }


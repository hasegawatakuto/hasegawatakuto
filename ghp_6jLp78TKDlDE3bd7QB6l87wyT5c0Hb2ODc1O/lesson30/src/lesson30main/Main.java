package lesson30main;

import bicycle.Bicycle;
import car.Car;
import person.Person;
class Main {
	  public static void main(String[] args) {
	    Person person1 = new Person("鈴木太郎",20,1.7,86.7);
	    person1.print();
	    Person person2 = new Person("山田花子",22,1.5,56.25);
	    person2.print();
	    
	    Person.printCount();
	    Car car = new Car();
	    Bicycle bicycle = new Bicycle();
	    
	    car.setOwner(person1.name);
	    bicycle.setOwner(person2.name);
	    System.out.println(car.getOwner());   System.out.println(bicycle.getOwner());
	    person1.buy(car);
	    person2.buy(bicycle);
	  }
	  }
	
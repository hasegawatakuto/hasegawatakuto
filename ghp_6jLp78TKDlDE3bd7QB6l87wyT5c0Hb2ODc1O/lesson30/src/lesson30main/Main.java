package lesson30main;

import person.Person;
class Main {
	  public static void main(String[] args) {
	    Person person1 = new Person("鈴木太郎",20,1.7,86.7);
	    person1.print();
	    Person person2 = new Person("山田花子",22,1.5,56.25);
	    person2.print();
	    
	    Person.printCount();
	  }
	}
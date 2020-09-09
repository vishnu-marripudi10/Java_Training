package day1;

class Animal{
	public static void main(String[] args){
	      Dog dog = new Dog();
	      dog.walk();
	      dog.eat();
	      dog.bark();
	   }
	void walk(){
		System.out.println("I am walking");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("I am eating");
	}
	void bark() {
		System.out.println("I am barking");
	}


   
}

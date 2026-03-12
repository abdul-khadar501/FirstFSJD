package com.pack1;

/*	
	Syntax :
	<AccessModifier>interface<InterfaceName>
	{

	}
*/

/*	public interface FirstInterface
	{
		
	}
*/

interface Vehicle 
{
    void start();
}

class Car implements Vehicle 
{
    public void start() 
    {
        System.out.println("Nexon Car starts with a button");
    }

}

class Bike implements Vehicle 
{
    public void start() 
    {
        System.out.println("Activa_5g Bike starts with a key");
    }

}

public class FirstInterface {

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();

    }

}

/*	public interface FirstInterface
	{
		
	}
*/

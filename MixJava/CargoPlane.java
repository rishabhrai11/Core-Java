package Mypackage;

class CargoPlane extends Aeroplane // inheriting Aeroplane class
{
	public void fly() //overriding method
	{
		System.out.println("CargoPlane fly at low height");
	}
	public void carryGoods() //specialized method
	{
		System.out.println("Cargo Plane carries goods");
	}
}

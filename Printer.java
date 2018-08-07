/*********************
 * Author: Micah L
 * Lab - Printer
 *********************/

package labPrinter;

public abstract class Printer 
{
	private int serialNumber;

	public Printer(int number) 
	{
		serialNumber = number;
	}

	public abstract void print();

	@Override
	public String toString() 
	{
		return this.getClass().getSimpleName() + " #" + serialNumber;
	}
}

/*********************
 * Author: Micah L
 * Lab - Printer
 *********************/

package labPrinter;

public class LaserPrinter extends Printer 
{
	private int remainingToner;

	public LaserPrinter(int sNumber) 
	{
		super(sNumber);
		remainingToner = 100;
	}

	public int getRemainingToner() 
	{
		return remainingToner;
	}

	public void print() {
		if (this.getRemainingToner() == 0) 
		{
			System.out.println("Toner is empty.");
		} else 
		{
			remainingToner -= 10;
			System.out.println("LaserPrinter is printing. remaining toner is " + this.getRemainingToner() + "%");
		}
	}
}
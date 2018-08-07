/*********************
 * Author: Micah L
 * Lab - Printer
 *********************/

package labPrinter;

public class PrinterApp 
{
	public static void main(String[] args) 
	{
		InkJetPrinter iPrinter = new InkJetPrinter(246810);
		LaserPrinter lPrinter = new LaserPrinter(13579);

		System.out.println(iPrinter);
		System.out.println("Remaining Cartridge: " + iPrinter.getRemainingCartridge() + "%");
		System.out.println();

		System.out.println(lPrinter);
		System.out.println("Remaining Toner: " + lPrinter.getRemainingToner() + "%");

		System.out.println();
		System.out.println("List of Printers:");
		Printer printers[] = { iPrinter, lPrinter };
		for (Printer p : printers) 
		{
			System.out.println(p);
				for(int i = 0; i < 11; i++) 
				{
					p.print();
				}
			System.out.println();
		}
	}
}
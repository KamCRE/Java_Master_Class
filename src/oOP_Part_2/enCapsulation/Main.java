/**
 * 
 */
package oOP_Part_2.enCapsulation;

/**
 * @author lancre
 *
 */
public class Main {
	public static void main(String[] args) {
		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim",200,"Sword");
		System.out.println("Initial health is " + enhancedPlayer.getHealth());
		
		Printer printer = new Printer(50,5, true);
		System.out.println(printer.getTonerLevel());
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		
		int pagesPrinted = printer.pagePrinting(4);
		System.out.println("Pages printed was " + pagesPrinted +"new total print count for printer = "
				+ printer.getPagesPrinted());

		
	}
	 
}

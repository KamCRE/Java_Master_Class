/**
 * 
 */
package oOP_Part_2.enCapsulation;

/**
 * @author lancre
 *
 */
public class Printer {

	private double tonerLevel;
	private double tonerLevelLeft;
	private int pagesPrinted;
	private boolean isDuplex;


	public Printer(double tonerLevel, int pagesPrinted, boolean isDuplex) {
		super();
		if(tonerLevel >= 1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		}else {
			this.tonerLevel = -1;
		}
		this.pagesPrinted = pagesPrinted;
		this.isDuplex = isDuplex;
	}

	public double fillToner(double tonerAmount) {
		if(tonerAmount > 0 && tonerAmount <=100) {
			if(this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}else {
			return -1;
		}
	}
	
	public double getTonerLevel() {
		return tonerLevel;
	}

	public int pagePrinting(int pages) {
		int pagesToPrint = pages;
		if(this.isDuplex) {
			pagesToPrint /= 2;
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
		

	}
	public void ifDuplex() {
		if(isDuplex()) {
			System.out.println("The Printer used is a Duplex Printer");
		}else {
			System.out.println("The Printer used is not a Duplex Printer");
		}
	}

	private boolean isDuplex() {
		return isDuplex;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	
}
  
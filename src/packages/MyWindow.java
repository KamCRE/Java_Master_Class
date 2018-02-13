/**
 * 
 */
package packages;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author lancre
 *
 */
public class MyWindow extends Frame {
	
	public MyWindow(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
	
			
		});
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSerifLarge =  new Font("SanSerif", Font.BOLD, 18);
		Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
		g.setFont(sansSerifLarge);
		g.drawString("The Complete Java Developer Course",60, 60);
		g.setFont(sansSerifSmall);
		g.drawString("by Lan Cre", 60, 100);
	}

}

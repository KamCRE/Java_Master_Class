/**
 * 
 */
package inTerfaces;

/**
 * @author lancre
 *
 */
public interface ITelephone {
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean callPhone(int phoneNumber);
	public boolean isRinging();
	
	

}

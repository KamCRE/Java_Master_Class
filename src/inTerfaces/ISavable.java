/**
 * 
 */
package inTerfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lancre
 *
 */
public interface ISavable {
	List<String> write();
	void read(List<String> savedValues);

}

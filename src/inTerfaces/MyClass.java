/**
 * 
 */
package inTerfaces;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lancre
 *
 */
public class MyClass implements SaveToMedium {
	private String gameState;
	


	
	
	public MyClass(String gameState) {
		super();
		this.gameState = gameState;
	}

	@Override
	public ArrayList<String> saveValues() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(this.gameState);
		
		return arrayList;
	}

	public String getGameState() {
		return gameState;
	}

	public void setGameState(String gameState) {
		this.gameState = gameState;
	}

	@Override
	public void populateValues(ArrayList<String> arrayList) {
		if(arrayList != null  && arrayList.size() >0) {
			this.gameState = arrayList.get(0);	
		}
		
		
	}

	@Override
	public String toString() {
		return "These are my Game states: "+ gameState;
	}

}

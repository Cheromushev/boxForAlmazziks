package Practise;

public class SimpleBatery implements Batery {
	
	private int power = 1;

	/*public SimpleBatery(int power) {
		this.power = power;
	}
*/
	@Override
	public boolean charge() {
		
		boolean charge = power > 0;
		
		power--;
		
		return charge;
	}

}

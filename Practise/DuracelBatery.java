package Practise;

public class DuracelBatery implements Batery {

	private int power = 5;

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

package Practise;

public class SecondFlashing extends FirstFlashing {

	public SecondFlashing() {
		
		super(null);

	}
	
	public void setBatery(Batery batery) {
		
		this.batery = batery;
		
	}
	
	@Override
	public void on() {
		if (batery != null) {
			
			super.on();
			
		}
		
		else {
			
			super.off();
			
		}
	}

}

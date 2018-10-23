package Practise;

public class FirstFlashing implements Flashing {

	private boolean light;
	protected Batery batery;

	public FirstFlashing(Batery batery) {

		this.batery = batery;

	}

	@Override
	public void on() {

		boolean charge = batery.charge();

		if (charge) {

			light = true;

		}

		else {

			light = false;

		}

	}

	@Override
	public void off() {

		light = false;
	}

	@Override
	public boolean isLight() {
		
		if (light) {

			return true;

		}

		return false;
	}

}

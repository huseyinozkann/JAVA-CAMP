package week3;

public abstract class BaseCreditManager implements ICreditManager {

	
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("Kaydedildi.");
	}

}

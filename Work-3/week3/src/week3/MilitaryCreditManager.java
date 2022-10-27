package week3;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker Kredisi Hesaplandı.");	
	}
	
	@Override
	public void save() {
		super.save();
	}
	

}

package week3;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println(this.customer.getId() + " müşterisi eklendi.");
	}
	
	public void delete() {
		System.out.println(this.customer.getId() + " müşterisi silindi.");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi Hesaplandı.");
	}

}

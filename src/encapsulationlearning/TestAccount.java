package encapsulationlearning;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account();
		a.setAccNum(123456789);
		System.out.println(a.getAccNum());
		a.setAccName("John");
		System.out.println(a.getAccName());
		a.setBalance(390000);
		System.out.println(a.getBalance());

	}

}

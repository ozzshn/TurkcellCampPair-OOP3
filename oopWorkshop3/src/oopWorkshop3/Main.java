package oopWorkshop3;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new DbLogger(),new FileLogger()};
		CreditManager manager=new CreditManager(new HibernateCreditDao(), loggers);
		
		Credit credit=new Credit(1, " Tar�m Kredisi", 5000, 10000);
		manager.save(credit, 7500);
		//manager.save(credit,4000);
	}

}

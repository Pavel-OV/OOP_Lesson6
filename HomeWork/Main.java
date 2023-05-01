
public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister users = new Persister(user);
		Report report = new Report();
		report.report( user);
		users.save();
	}
}
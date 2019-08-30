package builder;

public class Client {
	public static void main(String[] args) {
		User user = new User.UserBuilder("Saheb", "jana")
							.age(28)
							.phone("456456456")
							.address("Pune")
							.build();
		System.out.println(user.getFirstName());
	}
}

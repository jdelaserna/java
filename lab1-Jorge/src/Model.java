
public class Model {
	/* Creating all the variables */
	private String firstName;
	private String lastName;
	private int height;
	private double weight;
	private boolean canTravel;
	private boolean smoke;

	/* 
	 * @param name 
	 * setting the rules for the variables
	 */
	
	public final void setFirstName(String firstName) {
		if ((firstName.length() >= 3) && (firstName.length() <= 20)) {
			this.firstName = firstName;
		}
	}

	public final void setLastName(String lastName) {
		if ((lastName.length() >= 3) && (lastName.length() <= 20)) {
			this.lastName = lastName;
		}
	}

	public final void setHeight(int height) {
		if ((height >= 24) && (height <= 84)) {
			this.height = height;
		}
	}

	public final void setWeight(double weight) {
		if ((weight >= 80) && (weight <= 280)) {
			this.weight = weight;
		}
	}

	public final void setCanTravel(boolean canTravel) {
		this.canTravel = canTravel;
	}

	public final void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}
	
	/**
	 * selecting the instances
	 * @param name
	 */

	public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smoke) {
		setFirstName(firstName);
		setLastName(lastName);
		setHeight(height);
		setWeight(weight);
		setCanTravel(canTravel);
		setSmoke(smoke);
	}
	
	/**
	 * Creating the get method for each instance variable
	 * @param name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Printing the instances 
	 * @param name
	 */
	
	public void printDetails() {
		System.out.println("Name: " + getFirstName() + " " + getLastName());
		System.out.println("Height: " + getHeight() + " inches");
		System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
		if (canTravel == true) {
			System.out.println("Can travel: Yes");
		} else {
			System.out.println("Can travel: No");
		}
		if (smoke == true) {
			System.out.println("Smoke: Yes");
		} else {
			System.out.println("Smoke: No");
		}
	}
	
}
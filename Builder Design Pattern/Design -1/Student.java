package builderdesign;

public class Student {
	
	private int age;
	private String fname;
	private String lname;
	private double weight;
	
	
	public Student(Builder builder) {
		this.age=builder.getAge();
		this.fname=builder.getFname();
		this.lname=builder.getLname();
		this.weight=builder.getWeight();
	}
	
	public static Builder createBuild() {
		return new Builder();
	}
	
	public int getAge() {
		return age;
	}
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
}		

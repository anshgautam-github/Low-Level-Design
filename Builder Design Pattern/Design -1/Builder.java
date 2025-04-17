package builderdesign;

public class Builder {
	
	private int age;
	private String fname;
	private String lname;
	private double weight;
	
	public Student build() {
		return new Student(this);
		//so here "this" -> is refering to the builder
		//we needed to pass the builder object when we were creating in the Client class
		//so now see-> in this Client -> we need to pass builder obj
		//here we pass this -> means builder -> lke s. we used to do
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}

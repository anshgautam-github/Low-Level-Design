package builderdesign;

public class Client {

	public static void main(String[] args) {
		
		Student.Builder builder= Student.createBuild(); 
		
		builder.setAge(12);
		builder.setFname("Ansh");
		builder.setLname("Gautam");
		builder.setWeight(50);
		
	
		Student s1= builder.build();
		
		
//		Student s2=new Student(null);
		//now we can't pass null, we have to use the builder class only 	

		
		System.out.println(s1.getFname());
	}

}

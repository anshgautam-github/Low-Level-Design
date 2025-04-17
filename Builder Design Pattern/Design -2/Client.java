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

		
		//we can also write it like->
		
		//PRODUCTION READY CODE FOR BUILDER DESIGN PATTERN
		
//		Student s2= Student.createBuild()
//				.setAge(12)
//				.setFname("aAndh")
//				.setLname("Gau")
//				.setWeight(49)
//				.build();
		
		//first it will give error 
		//we need to chnage the type of setter to-> Builder
//		and at last return this
		
		System.out.println(s1.getFname());
	}

}

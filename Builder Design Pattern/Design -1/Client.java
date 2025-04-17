package builderdesign;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Builder builder=new Builder(); //confusing to make the builder like this to understand the reln.
		//refer to the below line
		Builder builder= Student.createBuild(); //line important 
		
		builder.setAge(12);
		builder.setFname("Ansh");
		builder.setLname("Gautam");
		builder.setWeight(50);
		
		
//		Student s1=new Student(builder);
		
		//here on the client side, people can pass (null) instead of the builder obj
		//then we will get the null. -> it will acess -> we get an error in the student class
		//easy sol-> as we did for the rel thing -> don't create object here 
		//create in the builder class and return from there 
		
		//SO the new line becomes ->
		Student s1= builder.build();
		
		//now u think the null problem has been solved 
		//no -> the client will directly call the student constrcuotr as it is public
		//and can do like this -> Student s2 = new Student(null);
		//now u think -> make the private constructor 
		//make it-> then it won't be able to acess in the builder too
		
		//Solution -> don;t make this builder class a separate , make it inside the Student class
		//bcoz we know the private things are accessible inside the same class only 
		
		//whenver u create the nested class -> remember the inner class must be static 
		
		
		System.out.println(s1.getFname());
	}

}

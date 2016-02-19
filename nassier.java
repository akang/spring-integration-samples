public class HelloWorld {

	public static void main(String[] args){
		System.out.println("Hello World");
		float a=2.0f;
		System.out.println(a);



		if(true){
			System.out.println("It's true");
		}else{
			System.out.println("Oopssiiee. It's false");
		}



		for(int i=0;i<10;i++){
			System.out.println("It's" + i);
		}
		
		/*
		
		try{
			for(int i=0;i<1000;i++){
			Thread.sleep(1000);
			System.out.println(i);
			}
		}
		catch(Exception e){

		}*/
		
	
		doSomething("Flyingg");
		
	Father father = new Father();    
	father.setFirstName("Mark");    
	father.setLastName("Ang");    
	System.out.println(father.getFirstName());    
	System.out.println(father.getLastName());    
	Son son = new Son();    
	son.setFirstName("Allan");    
	son.setLastName("Ang");    
	System.out.println(son.getFirstName());    
	System.out.println(son.getLastName());


	}
	
	public static void doSomething(String action){   
		System.out.println(action);
	}

}
class Man{  
	private String name;    
	private double height;  
	private double weight;   
	public String getName() {      
	return name;    }   
	public void setName(String name) {        
	this.name = name;    }    
	public double getHeight() {        
	return height;    }    
	public void setHeight(double height) {        
	this.height = height;    }    
	public double getWeight() {        
	return weight;    }    
	public void setWeight(double weight) {        
	this.weight = weight;    }}
	
class Father{    
	private String firstName;    
	protected String lastName; 
	public String getFirstName() {        
	return firstName;    }
	public void setFirstName(String firstName) {        
	this.firstName = firstName;    }    
	public String getLastName() {        
	return lastName;    }    
	public void setLastName(String lastName) {        
	this.lastName = lastName;   
	}
}

class Son extends Father{
	public String getFirstName() {        
	return "I have my own First Name";    } 
	}



	



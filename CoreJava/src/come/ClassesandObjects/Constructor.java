package come.ClassesandObjects;

public class Constructor {
	String sname;
	int age;
	
	Constructor(){
		sname="Jenil";
		age=25;
	}
	Constructor(String s,int a){
		sname=s;
		age=a;
	}
	
	void display() {
			System.out.println("Your Name Is "+ sname +" And Your Age "+ age);
	}
	
	public static void main(String[] args) {
		Constructor c=new Constructor();
		Constructor c1=new Constructor("Tirth",20);
		c.display();
		c1.display();
	}

}

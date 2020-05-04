class Promote{
	String name;
	int section, year;
	double cgpa;
	public void appoint(String n,int s,int y,double c){
		name=n;
		section=s;
		year=y;
		cgpa=c;
		System.out.println("Appoint Function");
	}
	public int evaluate(String n,int s,double c){
		System.out.println("Evaluate function Function");
		if(c>=6)
			return 1;
		else 
			return 2;
		
	}
	public boolean decision(String name){
		System.out.println("decision Function");
		int a=evaluate(name,section,cgpa);
		if(a==1)
			return true;
		else
			return false;
	
	}
	public void show_status(){
		boolean b=decision(name);
		System.out.println("Name	: "+name);
		System.out.println("Section	: "+section);
		System.out.println("CGPA	: "+cgpa);
		if(b==true)
			System.out.println("Year	: "+(year+1));
		else 
			System.out.println("Name	: "+year);
	}
}
class Honour{
	public void check(Promote p){	
		System.out.println("check Function");	
		if(p.cgpa>=9){
			show_status();
		}
	}
	public void show_status(){
		System.out.println("Eligible");
	}

}
class test{
	public static void main(String as[]){
		Promote p1=new Promote();
		p1.appoint("ABC",123,2,9.2);
		p1.show_status();
		Honour h=new Honour();
		h.check(p1);
	}
}
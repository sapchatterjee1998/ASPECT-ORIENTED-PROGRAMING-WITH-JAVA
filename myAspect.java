aspect myAspect{

	pointcut p1():(call(void Promote.show_status(..)));
	pointcut p2():(call(void Honour.check(..)));
	pointcut p3():(execution(* *(..)));
	pointcut p4():(call(void Honour.show_status()));

	before():p1(){
		System.out.println("Before Class Promote Function call");
	}
	before():p2(){
		System.out.println("Before Class Honour Function call");
	}
	after():p3(){
		System.out.println("A function is executed");
	}
	after():p4(){
		System.out.println("Congratulations  for Honour");
	}
}
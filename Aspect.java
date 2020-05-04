aspect Aspect
{
	pointcut p0():call(void Seminar.submit_concert(..));
	pointcut p1():call(void Seminar.change_type(..));
	pointcut p2():call(void Seminar.deny_concert(..));
	pointcut p3():call(void Seminar.show_details());
	before():p0()
	{
		System.out.println("Input");
	}
	before():p1()
	{
		System.out.println("Change concert");
	}
	before():p2()
	{
		System.out.println("Deny Concert");
	}
	after():p2()
	{
		System.out.println("Concert Denied");
	}
	before():p3()
	{
		System.out.println("Show Details");
	}
	
}
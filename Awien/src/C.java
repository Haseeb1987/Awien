
class A{
	A(){
		System.out.println("i am a constructor of class A ");
	}
	void testfun(){
		System.out.println("i am a function of class A ");
	}
	protected void finalize (){
		System.out.println("i am a destructor of class A ");
	}
}

class B extends A{
	B(){
		System.out.println("i am a constructor of class B");
	}
	void testfun(){
			System.out.println("i am a function of class B ");
	}
	protected void finalize (){
			System.out.println("i am a destructor of class B ");
	}
}

class C extends B{
	C(){
		System.out.println("i am a constructor of class C ");
	}
	void testfun(){
			System.out.println("i am a function of class C ");
	}
	protected void finalize (){
			System.out.println("i am a destructor of class C ");
	}


	public static void main(String[]args){
		//C c=new C();
		//B b=new B();
		//A a=new A();
		//c.testfun();
		//b.testfun();
		//a.testfun();
		//b.finalize();
		//a.finalize();
		//c.finalize();
		//A a1=new A();
		//a1.testfun();
		//A a2=new B();
		//a2.testfun();
		//a2.finalize();
		B b1=new A();
	}
}
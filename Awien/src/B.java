
class A{

	A(){
		System.out.println("i am A");
	}
	A(int i){
		System.out.println("i am A parameterized constructor");
	}

	void sum(){
		System.out.println("i am from class A");
	}

	void see(){
		System.out.println("let see A");
	}
}

class B extends A{
	void A(){
		System.out.println("i am A frm B");
	}
	B(){
		System.out.println("i am B");
	}

	void sum(){
		System.out.println("i am from class B");
	}

	void see(){
		//super.see();
		System.out.println("let see B");
	}

	public static void main(String[]args){
			//A a=new A();
			B b=new B();
			//A a1=new B();
			//B b1=new A();
			//System.out.println("okie");
			//a1.sum();
			//((A)b).sum();
			//a.see();
			//A a2=new A(3);
			//b.see();
			//b.sum();
			//a1.see();
	}
}
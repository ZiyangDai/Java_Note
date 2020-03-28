package UseofThis;

public class Test {
	
	//带static的方法
	public static void method1() {
		//访问i
		//完整方式调用
		Test t = new Test();
		System.out.println(t.i);
		//省略方式调用
		
		//调用doSome
		//完整方式调用
		Test.doSome();
		//省略方式调用
		doSome();
		
		//调用doOther
		//完整方式调用
		t.doOther();
		//省略方式调用
	}
	
	//没有static的方法
	public void method2() {
		//访问i
		//完整方式调用
		System.out.println(this.i);
		//省略方式调用
		System.out.println(i);
		
		//调用doSome
		//完整方式调用
		Test.doSome();
		//省略方式调用
		
		//调用doOther
		//完整方式调用
		this.doOther();
		//省略方式调用
		doOther();
	}

	//主方法
	public static void main(String[] args) {
		//调用method1
		//完整方式调用
		Test.method1();
		//省略方式调用
		method1();
		
		//调用method2
		//完整方式调用
		Test tt = new Test();
		tt.method2();
		//省略方式调用
	}
	
	// 没有static的变量
	int i =10;
		
	//带有static的方法
	public static void doSome() {
		System.out.println("do some!");
		}
		
    //没有static的方法
	public void doOther() {
		System.out.println("do other!");
		}
	
	} 

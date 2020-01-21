package Exercises;
class Mythread implements Runnable{
private String threadName;
//constructor
Mythread()
{
	threadName="Mythread";
	Thread.currentThread().setName(threadName);
System.out.println("Thread"+threadName+"created");
	
}		
@Override
public void run() {
System.out.println("Mythread running successfully");	
}
}
public class Runnablethreaddemo {

	public static void main(String[] args)throws InterruptedException {
	
		System.out.println("threadname"+"running successfully");
	Mythread mt=new Mythread();
			mt.run();
	
	
	}
	

}




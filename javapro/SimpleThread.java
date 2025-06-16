package javapro;
class Car implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("bmw car moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}
	}
}
}
class Bike implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninja bike is moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}
	}
}
}
public class SimpleThread {
public static void main(String[]args) {
	Thread caThread=new Thread(new car());
	Thread baThread=new Thread(new Bike());
	System.out.println("good");
	caThread.start();
	baThread.start();
}
}

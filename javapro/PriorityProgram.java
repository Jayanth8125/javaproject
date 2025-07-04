package javapro;

public class PriorityProgram {
	public static void main(String[]args)
	{
		Thread lowPriorityThread=new Thread(()->{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Low Priority Thread"+i);
		}
		});
		Thread HighPriorityThread=new Thread(()->
				{
			for(int i=1;i<=5;i++)
			{
				System.out.println("High priority Thread"+i);
			}
				});
			lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
			HighPriorityThread.setPriority(Thread.MAX_PRIORITY);
			   
			lowPriorityThread.start();
			HighPriorityThread.start();
				}
	}

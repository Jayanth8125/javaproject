package list;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<String>();
		
		while(true)
		{
			System.out.println("simple To Do List App");
			System.out.println("1.Add a Task");
			System.out.println("2.view a task");
			System.out.println("3.Delete a task");
			System.out.println("4.exit");
			System.out.println("choose an option(1-4)");
			
			
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.println("enter your task");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("task added successfully");
			}
			else if(choice==3) {
				if(tasks.isEmpty()) {
					System.out.println("nothing to delete");
				}else {
					System.out.println("enter task number to delete");
					int tasknum=sc.nextInt();
					if(tasknum>=1 && tasknum<=tasks.size()) {
						tasks.remove(tasknum-1);
						System.out.println("task deleted");
					}else {
						System.out.println("invalid number");
					}
				}
			}else if(choice==4) {
				System.out.println("goodbye!");
				break;
			}else {
				System.out.println("plese choose a valid option");
			}
		}
		sc.close();
		
		
		

	}

}

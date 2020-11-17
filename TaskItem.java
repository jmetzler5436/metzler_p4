package metzler_p4;

import java.util.Scanner;

public class TaskItem {

	public static String TaskCreation() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String taskInput = null;
		String title, desc, date;
		
		System.out.print("Task title: ");
		title = sc.nextLine();
		if(title.equals("")) 
			System.out.println("WARNING: title must be at least 1 character long; task not created");
		else {
			System.out.print("Task description: " );
			desc = sc.nextLine();
			
			System.out.print("Task due date (YYYY-MM-DD): ");
			date = sc.nextLine();
				if(date.equals("")) 
					System.out.println("WARNING: invalid due date; task not created");
				else {
					taskInput = "[" + date + "] " + title + ": " + desc;
				}
		}
		System.out.println(taskInput);
		return taskInput;
	} 
	
	public static String TaskModify(int taskNum) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String taskInput = null;
		String title, desc, date;		
		
		System.out.print("Enter a new title for task ");
		System.out.print(taskNum);
		System.out.print(": ");
		title = sc.nextLine();
		if(title.equals("")) 
			System.out.println("WARNING: title must be at least 1 character long; task not created");
		else {
			System.out.print("Enter a new description for task " );
			System.out.print(taskNum);
			System.out.print(": ");
			desc = sc.nextLine();
			
			System.out.print("Enter a new task due date (YYYY-MM-DD) for task ");
			System.out.print(taskNum);
			System.out.print(": ");
			date = sc.nextLine();
				if(date.equals("")) 
					System.out.println("WARNING: invalid due date; task not created");
				else {
					taskInput = "[" + date + "] " + title + ": " + desc;
				}
		}
				
		System.out.println(taskInput);
		return taskInput;
	}
	
	public static String TaskRemoval() {
		return null;
	}
	
	public static String TaskCompletion(String taskInput) {
		taskInput = "*** " + taskInput;
		
		return taskInput;
	}
	public static String TaskUnCompletion(String taskInput) {
		taskInput = "*** " + taskInput;
		
		return taskInput;
	}

	public static void ListTasks(int taskNum, String taskInput[]) {
		int i;
		
		System.out.println("Current Tasks");
		System.out.println("-------------");
		System.out.println("");
		for(i=0;i<taskNum;i++) {
			System.out.print(i);
			System.out.print(") ");
			System.out.print(taskInput[i]);
		}
	}
}

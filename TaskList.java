package metzler_p4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskList {
	
	static int MainMenu() {
		int intI;
		String strI;
		int i=0, j=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		FileInputStream in = null;
		while(i==0) {
			System.out.println("Main Menu");	
			System.out.println("=-=-=-=-=");
	
			System.out.println("");
			System.out.println("1) Create a new List");
			System.out.println("2) Load an existing List");
			System.out.println("3) Quit");
	
			System.out.println("> ");
			intI = sc.nextInt();
		
			while(j==0) {
				if(intI == 1) {
					System.out.println("new task list has been created");
					ListAccess(in);
				}
				else if(intI == 2) {
					System.out.println("Enter the filename to load: ");
					strI = sc.nextLine();
				
					try {
						in = new FileInputStream(strI);
						System.out.println("task list has been loaded");
						ListAccess(in);
					} catch (FileNotFoundException e) {
						System.out.println("task list cannot be found");
					}
				
				
				}
				else if(intI == 3) {
					System.exit(0);
				}
			}
		}
		
		
		
		
		return 0;
	}
	
	@SuppressWarnings("null")
	public static void ListAccess(FileInputStream in) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input;
		String[] taskInput = null;
		int intI;
		int taskNum = 0;
		
		System.out.println("");
		System.out.println("List Operation Menu");
		System.out.println("-------------------");
		System.out.println("");
		System.out.println("1) view the list");
		System.out.println("2) add an item");
		System.out.println("3) edit an item");
		System.out.println("4) remove an item");
		System.out.println("5) mark an item as completed");
		System.out.println("6) unmark an item as completed");
		System.out.println("7) save the current list");
		System.out.println("8) quit to the main menu");
		
		System.out.println("");
		System.out.println("> ");
		intI = sc.nextInt();
		
		switch(intI) {
		case 1: 
			TaskItem.ListTasks(taskNum, taskInput);			
		case 2:
			taskInput[taskNum] = TaskItem.TaskCreation();
			if(taskInput[taskNum] == null);
			else {
				taskNum++;
			}
		case 3:
			System.out.print("Which task will you edit? ");
			
			intI = sc.nextInt();
			
			input = TaskItem.TaskModify(intI);
			if(input == null);
			else
				taskInput[intI] = input;
		case 4:
			System.out.print("Which task will you remove? ");
			
			intI = sc.nextInt();
			
			taskInput[intI] = TaskItem.TaskRemoval();
			taskNum--;
		case 5:
			System.out.print("Which task will you remove? ");
			
			intI = sc.nextInt();
		
			taskInput[intI] = TaskItem.TaskCompletion(taskInput[intI]);
		case 6:
			System.out.print("Which task will you unmark as completed? ");
			
			intI = sc.nextInt();
			
			taskInput[intI] = TaskItem.TaskUnCompletion(taskInput[intI]);
		case 7:
			try {
		         
		         File file = new File("outputFile.txt");
		         if (!file.exists()) {
		            file.createNewFile();
		         } 
		         FileWriter fw = new FileWriter(file.getAbsoluteFile());
		         BufferedWriter bw = new BufferedWriter(fw);
		         for(int i = 0;i<taskNum; i++) {
		        	 bw.write(i);
		        	 bw.write(") ");
		        	 bw.write(taskInput[i]); 
		         }
		         
		         bw.close();
		         
		         System.out.println("Done");
		      } catch (IOException e) {
		         e.printStackTrace();
		      } 
		case 8:
			System.exit(0);
		}
	}	
	
}

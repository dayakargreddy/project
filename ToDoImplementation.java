package com.todoproject;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ToDoImplementation implements ToDoList {
	Scanner scan = new Scanner(System.in);
	List<String> doList = new Vector<String>(); 
	public String priorityAndDueDate() {
		System.out.println("Enter priority");
		int priority = scan.nextInt();
		System.out.println("Enter due date year");
		int year = scan.nextInt();
		System.out.println("Enter due date month");
		int month = scan.nextInt();
		System.out.println("Enter due date day");
		int day = scan.nextInt();
		return "(Priority "+priority+" Due Date "+ year+"-"+month+"-"+ day+")";

	}



	@Override
	public void printAllCurentToDos() {

		System.out.println("you have "+doList.size()+" TODOs:");
		if(doList.size()!=0) {
			for(int i=0;i<doList.size();i++) {
				System.out.println("OPEN: "+doList.get(i));
			}
		}
		else {
			try {
				String msg= "Your TODO is Empty...! Nothing to Show ";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}

	}

	@Override
	public void addNewToDos() {

		System.out.println("Enter your new TODO");
		String todo = scan.nextLine().toLowerCase();
		doList.add(todo);
	}

	@Override
	public void markAsDone() {
		
		if(doList.size()!=0) {
		System.out.println("Enter TODO to change to DONE");
		String todo = scan.nextLine().toLowerCase();
		if(doList.contains(todo)) {
		System.out.println("Done: "+ todo);
		doList.remove(todo);
		}
		else {
			try {
				String msg= "The Entered TODO is Not Present...! please check the list once again and enter the correct TODO to mark as done ";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}
		
		}
		else {
			try {
				String msg= "you havent Added the dolist and  completed a single task yet please complete and mark as done";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}
	}

	@Override
	public void updatePriorityAndDueDate() {
		// TODO Auto-generated method stub

	}


}

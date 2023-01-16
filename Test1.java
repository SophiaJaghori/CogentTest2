package com.cogent.testQ2;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("This is Sophia ");
		
		int taskId;
		String task1 = "Planing";
		String task2 = "Controling";
		String task3 = "Evaluating";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the task Id ");
		taskId = sc.nextInt();
		if(taskId == 1) {
			System.out.println("The Id is  for " + task1);
		}
		else if(taskId == 2) {
			System.out.println("the task id is for " + task2);
		}
		else if (taskId == 3 ) {
			System.out.println("the task is for evaluating " + task3);
		}
		else {
			System.out.println("there is no task with this id ");
		}
		

	}

}

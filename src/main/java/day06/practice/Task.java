package day06.practice;

import java.util.ArrayList;

public class Task {

	private String taskName;
	private int priority;

	public static void main(String[] args) {
		
		ArrayList<Task> taskList = new ArrayList<>();
		Task task1 = new Task();
		task1.taskName = "Task1";
		taskList.add(task1);
		task1.priority = 5;
		
		
		Task task2 = new Task ();
		taskList.add(task2);
		task2.taskName = "Task2";
		task2.priority = 4;
		
		Task task3 = new Task();
		taskList.add(task3);
		task3.taskName = "Task3";
		task3.priority = 3;
		
		System.out.println(taskList);
	   
		
	}
	
}

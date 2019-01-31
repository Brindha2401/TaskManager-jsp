package com.programmingfree.springservice.domain;

public class Task {
	
	 private String user_name;
	 private int task_id;
	 private String task_name;
	 private String task_description; 
	 private String task_priority;
	 private String task_status;
	 
	 public int getTaskId() {
	  return task_id;
	 }
	 public void setTaskId(int taskId) {
	  this.task_id = taskId;
	 }
	 public String getTaskName() {
	  return task_name;
	 }
	 public void setTaskName(String taskName) {
	  this.task_name = taskName;
	 }
	 public String getTaskDescription() {
	  return task_description;
	 }
	 public void setTaskDescription(String taskDescription) {
	  this.task_description = taskDescription;
	 }
	 
	 
	 public String getTaskPriority() {
	  return task_priority;
	 }
	 public void setTaskPriority(String taskPriority) {
	  this.task_priority = taskPriority;
	 }
	 
	 public String getTaskStatus() {
			return task_status;
		}
	 
	public void setTaskStatus(String taskStatus) {
			this.task_status = taskStatus;
		}
	public String getUserName() {
		return user_name;
	}
	public void setUserName(String userName) {
		this.user_name = userName;
	}
	@Override
	public String toString() {
		return "Task [user_name=" + user_name + ", task_id=" + task_id
				+ ", task_name=" + task_name + ", task_description="
				+ task_description + ", task_priority=" + task_priority
				+ ", task_status=" + task_status + "]";
	}
		
	
	  

}

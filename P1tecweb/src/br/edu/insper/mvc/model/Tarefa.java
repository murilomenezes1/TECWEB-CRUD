package br.edu.insper.mvc.model;

import java.sql.Date;
import java.util.Calendar;

public class Tarefa {
	
	
	private Integer id;
	private String task;
	private String data;

	
	
	
	public Integer getId() {	
		return this.id;
		
	}
	public void setId(Integer id) {
		this.id = id;
		
	}
	public void setTask(String task) {
		this.task = task;	
	
	}
	public String getTask() {
		return this.task;

	
	}
	public String getData() {
		return this.data;
	
	}
	public void setData(String data) {	
		this.data = data;
		
	}
	
}
 
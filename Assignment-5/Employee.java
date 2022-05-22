// Batuhan Baþtürk 150119035

class Employee {

private int id;
private String name;
private String surname;
private int workHour;
private int speed;
private Item[] items;
private Payroll payroll;

public Employee (int id , String name, String surname , int workHour, int speed){
	this.id = id;
	this.name = name;
	this.surname = surname;
	this.workHour = workHour;
	this.speed = speed;
	
}
public Item[] startShift() {
	//creating new array that will have length of how many items employee created
	items = new Item[ workHour * speed];
	//than randomly generate id of items and put it into array
	for(int i = 0; i < items.length;i++) {
		 items[i] = new Item((int)(Math.random() * 100) + 1);
		 
	}
	return items;
}
//  method creates a Payroll object with employee’s work hour and the number of items s/he creates. It assigns this object to payroll data field. It then returns payroll object.
     public Payroll endShift() {
	    Payroll new_payroll = new Payroll(workHour, items.length);
	    this.payroll = new_payroll;
	    return this.payroll;
}
	public String toString() {
	return "This is the employee with id " + id + " speed " + speed + "." + "The work hour is " + workHour + " and the produced item count is " + (workHour * speed) + "." ;
}
	
	
	//getter setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public Payroll getPayroll() {
		return payroll;
	}
	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}






}

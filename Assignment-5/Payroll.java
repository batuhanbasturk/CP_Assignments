

class Payroll {
	
private int workHour;
private int  itemCount;

//implementation of constructors
public Payroll (int workHour,int itemCount){
	this.workHour = workHour;
	this.itemCount = itemCount;
}
// every hour employee worked it earns 3 lira and every product it makes 2 lira
public int calculateSalary(){
	return 3 * workHour + 2 * itemCount;
}
//returning the string
public String toString() {
	return "The work hour is " + workHour + " and the produced item count is " + itemCount + "."; 
}


//getter setter methods
public int getWorkHour() {
	return workHour;
}
public void setWorkHour(int workHour) {
	this.workHour = workHour;
}

}
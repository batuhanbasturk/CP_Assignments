//Batuhan Baþtürk 150119035

class Factory {
private String name;
private Employee[] employees;
private Storage storage;
private Payroll[] payrolls;
private double itemPrice;

public Factory(String name, int capacity, double itemPrice) {
	//creating new storage object and with given capacity assign it to storage data field
	Storage storage = new Storage(capacity);
	//implementation constructors
	this.name = name;
	this.itemPrice = itemPrice;
	
}

public double getRevenue() {
	//price of items multiplied by item number will give us revenue
	return 	itemPrice * Item.numberOfItems;
	
}
public double getPaidSalaries() {
// 
	double sum = 0.0;
	for(int i = 0; i < payrolls.length;i++) {
		// payrolls array transfered to payroll object
		Payroll payroll = payrolls[i];
		//gets everysalary that payrolls
	    sum += payroll.calculateSalary();
	}
	return sum;
	
}
public void addEmployee(Employee employee) {
	//from start we dont have any employee 
		int a = 0;
		Employee[] employees = new Employee[a];
		//create new array with size of +1 
		Employee[] newemployees = new Employee[a+1];
		// if it has employee copy it the values of it.
		for(int i = 0; i < a; i++) {
			newemployees[i] = employees[i];
		}
		////copy array data with array length that increased
		employees = newemployees;
		//and add employee's information
		newemployees[a] = employee;
	    
		//get startshift method for every employee's information to items array 
		Item[] items = employees[employees.length].startShift(); 
		// get generated random item ids to storage add item
		for(int i = 0; i < items.length;i++) {
			Item item = items[i];
	      storage.addItem(item);
    }
    	
	
	
}
public Employee removeEmployee(int id) {
	// (?)
	//if i dont have any array length that means there are no employees so:
	 if(employees.length == 0) {
         System.out.println("There are no employees!");
}       
	  
	
}
private void addPayroll(Payroll payroll) {
	// (?)
 


}

//getter setter methods
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Employee[] getEmployees() {
	return employees;
}

public void setEmployees(Employee[] employees) {
	this.employees = employees;
}

public Storage getStorage() {
	return storage;
}

public void setStorage(Storage storage) {
	this.storage = storage;
}

public Payroll[] getPayrolls() {
	return payrolls;
}

public void setPayrolls(Payroll[] payrolls) {
	this.payrolls = payrolls;
}

public double getItemPrice() {
	return itemPrice;
}

public void setItemPrice(double itemPrice) {
	this.itemPrice = itemPrice;
}

}

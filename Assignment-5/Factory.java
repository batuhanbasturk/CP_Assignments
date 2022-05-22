//Batuhan Baþtürk 150119035
class Factory {

	private String name;
	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls;
	private double itemPrice;

	public Factory(String name, int capacity, double itemPrice) {
		//creating new storage object and with given capacity assign it to storage data field
		this.storage = new Storage(capacity);
		//implementation constructors
		this.name = name;
		this.itemPrice = itemPrice;
		
	}

	public double getRevenue() {
		//price of items multiplied by item number will give us revenue
		return 	itemPrice * Item.numberOfItems;
		
	}
	public double getPaidSalaries() {
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
        //from start employee array is null 
        if (employees == null) {
        	//so create employee array w length 1
            employees = new Employee[1];
            //than assign employee to that
            employees[0] = employee;
        } else {
            Employee[] new_employees = new Employee[employees.length + 1];
            // if it has employee copy it the values of it.
            for(int i = 0; i < employees.length; i++) {
                new_employees[i] = employees[i];
            }
            //and add employee's information
            new_employees[employees.length] = employee;
          //copy array data with array length
            employees = new_employees;
        }

        //get startshift method for every employee's information to items array 
        Item[] items = employees[employees.length - 1].startShift(); 
        // get generated random item id's data to storage add item
        for(int i = 0; i < items.length;i++) {
            Item item = items[i];
            storage.addItem(item);
        }
    }

	public Employee removeEmployee(int id) {
		//employees array will be null in the beginning so if it starts with null than we cant remove employee 
        if (employees == null) {
            System.out.println("There are no employees!");
            return null;
        } 
        else {
        	//creating removed_employee array start will be null
            Employee removed_employee = null;
            //since we need to remove i need to reduce employees length by 1 
            Employee[] removed_employees = new Employee[employees.length - 1];
            //create cursor with value of 0
            int cursor = 0;
            //check id till employees array length
            for(int i = 0; i < employees.length; i++) {
            	// if employees id is not id what i search for and if its bigger than one i will assign array 1 to array 0 in summary i'm reducing array length
                if (employees[i].getId() != id) {
                	if(employees.length > 1) {
                    removed_employees[cursor] = employees[i];
                  }
                    
                	cursor++;
               } 
                //assigning part
                else {
                    removed_employee = employees[i];
                }
          }
            
         //if i cant find id print employee does not exist
            if (removed_employee == null) {
                System.out.println("Employee does not exist!");
                return null;
            }
            //in the end copy array data with array length
            else {
            	employees = removed_employees;
            }
            //calling endshift method and add payroll object to addpayroll method
            Payroll payroll = removed_employee.endShift();
            addPayroll(payroll);
            return removed_employee;

        }
    }
	private void addPayroll(Payroll payroll) {
		
        if (payrolls == null) {
            payrolls = new Payroll[1];
            payrolls[0] = payroll;
        } 
        else {
        	//creating new array that called new payrolls since i need to do add in that method i need to increase array length by 1
            Payroll[] new_payrolls = new Payroll[payrolls.length + 1];
            
            for(int i = 0; i < payrolls.length; i++) {
                new_payrolls[i] = payrolls[i];
            }
            //adding part
            new_payrolls[payrolls.length] = payroll;
            //copy new data to old one with increased length
            payrolls = new_payrolls;
        }
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

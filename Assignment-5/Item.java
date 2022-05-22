//Batuhan Baþtürk 150119035
/*Purpose of this program is calculating the earnings you earn with 
the products produced together with the calculation of the salary 
to be given to the employees in the factory while you can also search for employee and the work they do.*/

class Item {
	
private int id;
public static int numberOfItems;

//increasing number of items with every new item id
public Item(int id) {
	this.id = id;
	numberOfItems++;
	
}

//getter setter methods
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}




}

//Batuhan Baþtürk 150119035

class Storage {
private int capacity;
private Item[] items;

public Storage(int capacity) {
	this.capacity = capacity;
	
}


public void addItem(Item item) {
	
	int availableitem = items.length;
	//create new items array to add new items to array and increase length + 1 to add it
	Item[] newitems = new Item[availableitem + 1];
	//copying items array to new items array 
	for(int i = 0; i < availableitem; i++) {
		newitems[i] = items[i];
	}
	items = newitems;
	//copy array data with array length
	newitems[availableitem] =item;
	//than add the new item to the array 
	
	
	
	
 }

//getter setter methods
public Item[] getItems() {
	return items;
}


public void setItems(Item[] items) {
	this.items = items;
}

}

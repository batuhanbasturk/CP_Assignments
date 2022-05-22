//Batuhan Baþtürk 150119035

class Storage {
private int capacity;
private Item[] items;

public Storage(int capacity) {
	this.capacity = capacity;
	
}


public void addItem(Item item) {
    //at first the items array will be null 
	if (items == null) {
		//so create item array w length 1
        items = new Item[1];
        //than assign item to array
        items[0] = item;
    } 
    else {
        int availableitem = items.length;
        //create new items array to add new items to array and increase length + 1 to add it
        Item[] newitems = new Item[availableitem + 1];
        //copying items array to new items array 
        for(int i = 0; i < availableitem; i++) {
            newitems[i] = items[i];
        }
        //assign a item into array
        newitems[availableitem] = item;
      //copy array data with array length
        items = newitems;
    }
    
 }

//getter setter methods
public Item[] getItems() {
	return items;
}


public void setItems(Item[] items) {
	this.items = items;
}

}

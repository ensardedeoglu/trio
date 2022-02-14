

public class Trio<T> {
	private T firstItem;
	private T secondItem;
	private T thirdItem;

	//First constructor three items as parameters
	public Trio(T firstItem, T secondItem, T thirdItem) {
		this.first = firstItem;
		this.second = secondItem;
		this.third = thirdItem;
	}
	//First constructor three items as parameters
	public Trio(T itemGroup) {
		this(itemGroup.firstItem, itemGroup.secondItem, itemGroup.thirdItem);
	}

	//Gets first item
	public T getFirst() {
        return firstItem;
    }

	//Sets first item
    public void setFirst(T firstItem) {
        this.firstItem = firstItem;
    }

	////Gets second item
    public T getSecond() {
        return secondItem;
    }

	//Sets second item
    public void setSecond(T secondItem) {
        this.secondItem = secondItem;
    }

	//Gets third item
    public T getThird() {
        return thirdItem;
    }

	//Sets third item
    public void setThird(T thirdItem) {
        this.thirdItem = thirdItem;
    }

	// elements separated by space
	public String toString() {
        return "(" + firstItem + ", " + secondItem + ", " + thirdItem + ")";
    }

	// Replace all method "takes in one item as a parameter and modifies the current Trio so that it holds three of that item."
	public void replaceAll(T item) {
		this.firstItem = item;
		this.secondItem = item;
		this.thirdItem = item;                                
}

	//Has Duplicates method "returns true if at least two items within the Trio are equivalent to each other"
	public void hasDuplicate(){
		if(this.firstItem == this.secondItem && this.firstItem == this.thirdItem){
			return true;
		}else if(this.thirdItem == this.secondItem && this.firstItem == this.thirdItem){
			return true;
		}else{
			return false;
		}
	}	

	//Count method "takes in an item as a parameter and returns a count of how many times that item is in the Trio"
	public void count(T item){
		int count = 0;
		if(this.firstItem.contains(item)){
			count++;
		}else if(this.secondItem.contains(item)){
			count++;
		}else if(this.thirdItem.contains(item)){
			count++;
		}else{
			return "No item in trio";
		}
		return count;
	}


}




   //overriding equals method to see if two Trios are equal, regardless of order of elements
   @Override
   public boolean equals(Object obj){
	   if(obj == this){
		return true;
	   } else if(!(obj instanceof Trio)){
		return false;
	   }
	   Trio<T> trio = (Trio<T>) obj;
   }
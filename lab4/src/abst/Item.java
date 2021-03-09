package abst;

abstract class Item {
private int id;
private String title;
private int numCopy;


public Item(int id, String title, int numCopy) {
	super();
	this.id = id;
	this.title = title;
	this.numCopy = numCopy;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNumCopy() {
	return numCopy;
}
public void setNumCopy(int numCopy) {
	this.numCopy = numCopy;
}
public void checkin() {
	numCopy=numCopy+1;
}
public void checkout() {
	numCopy=numCopy-1;
}
public void addItem(int id,String title,int numCopy) {
	setId(id);
	setTitle(title);
	setNumCopy(numCopy);
}

public void print() {
	System.out.println("Title:"+getTitle());
	System.out.println("ID:" +getId());
	System.out.println("Number of copies: " +getNumCopy());

}

public void equals() {
	
}


}



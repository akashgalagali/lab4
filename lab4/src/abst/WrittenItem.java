package abst;

abstract public class WrittenItem extends Item {
private String author;
	public WrittenItem(int id, String title, int numCopy,String author) {
		super(id, title, numCopy);
		// TODO Auto-generated constructor stub
		this.author=author;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIdNum(){
		return super.getId();
		}
		public String getTitle(){
		return super.getTitle();
		}
		public int getNumCopies(){
		return super.getNumCopy();
		}
		
		public void print(){
		
		super.print();
		}
		public void checkIn(){
		super.checkin();
		}
		public void checkOut(){
		super.checkout();
		}
}

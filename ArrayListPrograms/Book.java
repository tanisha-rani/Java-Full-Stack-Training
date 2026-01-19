package ArrayListPrograms;

public class Book implements Comparable<Book>{
	int price;
	 Book(){
		 
	 }
	 Book(int price){
		 this.price=price;
	 }
	 @Override
	 public String toString() {
		return "Book [price=" + price + "]";
	 }
	 
	
	 
	 @Override
	 public int compareTo(Book o) {
		 return this.price- o.price;
	 }
	 
	 
}

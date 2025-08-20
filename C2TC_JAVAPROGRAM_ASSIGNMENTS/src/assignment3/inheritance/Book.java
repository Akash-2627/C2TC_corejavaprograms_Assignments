package assignment3.inheritance;

class Book extends Item{
	String Author;
	Book(int Id,String Title,String Author){
		super(Id,Title);
		this.Author=Author;
		
	}
	void  displayInfo(){
		System.out.println("Id: " + Id );
		System.out.println("Title: " + Title);
		System.out.println("Author: " + Author);
	}
}
package Inheritance.assignment3;

	public class Item {
		int Id;
		String Title;
		Item(int Id,String Title){
			this.Id=Id;
			this.Title= Title;
			
		}
	void  displayInfo(){
		System.out.println("Id: " + Id );
		System.out.println("Title: " + Title);
		
	}
}
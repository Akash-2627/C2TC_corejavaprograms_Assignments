package assignment3.inheritance;

class Magazine extends Item{
	int issuenumber;
	Magazine(int Id,String Title,int issuenumber ){
		super(Id,Title);
		this.issuenumber=issuenumber;
	}
	void  displayInfo(){
		System.out.println("Id: " + Id );
		System.out.println("Title: " + Title);
		System.out.println("IssueNumber: " + issuenumber);
	}

}
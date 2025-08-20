package Inheritance.assignment3;
import java.util.Scanner;

public class Bookfair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER: Id and Title");
		Item i = new Item(scan.nextInt(),scan.next());
		i.displayInfo();
		System.out.println("ENTER: Id and Title and Author");
		Book b = new Book(scan.nextInt(),scan.next(),scan.next());
		b.displayInfo();
		System.out.println("ENTER: Id and Title and IssueNumber");
		Magazine m = new Magazine(scan.nextInt(),scan.next(),scan.nextInt());
		m.displayInfo();
	}

}

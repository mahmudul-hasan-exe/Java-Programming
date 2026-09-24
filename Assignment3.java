import java.util.Scanner;

public class Assignment3 {
   public static void main(String[] arge){

    int id,price;
    String title,description,category;
   
    Scanner input_id = new Scanner(System.in);
    System.out.println("Enter Id: ");
    id = input_id.nextInt();

    Scanner input_title = new Scanner(System.in);
    System.out.println("Enter Title: ");
    title = input_title.nextLine();

    Scanner input_price = new Scanner(System.in);
    System.out.println("Enter Price: ");
    price = input_price.nextInt();

    Scanner input_description = new Scanner(System.in);
    System.out.println("Enter description: ");
    description = input_description.nextLine();

    Scanner input_category = new Scanner(System.in);
    System.out.println("Enter category: ");
    category = input_category.nextLine();


    System.out.println("Id: "+id);
	System.out.println("Title: "+title);
	System.out.println("Price: "+price+" euros");
	System.out.println("Description: "+description);
	System.out.println("Category: "+category);

   }
}

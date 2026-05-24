class Book {
  int bookId;
  String title;
  String author;
  boolean issues;

  Book(int bookId,String title,String author,boolean issues) {
    this.bookId = bookId;
    this.title = title;
    this.author = author;
    issued = false;
  }

  void issueBook (){
    if(!issued) {
      System.out.println(title + " issued successfully");
        } else {
            System.out.println(title + " is already issued");
        }
    }

    void returnBook() {
        issued = false;
        System.out.println(title + " returned successfully");
    }

   void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "James Gosling");

        Student s1 = new Student(1, "Anant");

        b1.displayBook();
        s1.displayStudent();

        b1.issueBook();
        b1.returnBook();
    }
}
  

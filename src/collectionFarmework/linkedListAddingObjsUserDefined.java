package collectionFarmework;

import java.util.*;  
class Booklib {  
int id;  
String name,author,publisher;  
int quantity;  
public Booklib(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class linkedListAddingObjsUserDefined {  
public static void main(String[] args) {  
     
    List<Book> list=new LinkedList<Book>();  
    
    Book b1=new Book(101,"C languge","Laxman","BBB",8);  
    Book b2=new Book(102,"Data & Networks","Sony","SSS",4);  
    Book b3=new Book(103,"Operating System","luck","PPP",6);  
    
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
   
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
} 

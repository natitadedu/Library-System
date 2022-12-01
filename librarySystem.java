public class librarySystem {

    String renterList;
    String booksList;

    int returnPeriod;


    void addRenter(int id, String renterName){
          renterList=renterName;
        System.out.println("Welcome to hiber library " +renterName);

    }
    void addBooks(String bookName){
        booksList =bookName;
        System.out.println("your book is "+bookName+" is that correct?");

    }

}

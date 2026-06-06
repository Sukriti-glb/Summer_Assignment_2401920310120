interface LibUser {
    void registerAcc();
    void requestBook();
}
class KidUser implements LibUser {

    int age;
    String bookType;

    @Override
    public void registerAcc() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibUser {

    int age;
    String bookType;

    @Override
    public void registerAcc() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        // Testcase1

        KidUser kid1 = new KidUser();
        kid1.age = 10;
        kid1.registerAcc();

        kid1.bookType = "Kids";
        kid1.requestBook();

        System.out.println();

        KidUser kid2 = new KidUser();
        kid2.age = 18;
        kid2.registerAcc();

        kid2.bookType = "Fiction";
        kid2.requestBook();

        System.out.println();

        // Testcase2

        AdultUser adult1 = new AdultUser();
        adult1.age = 5;
        adult1.registerAcc();

        adult1.bookType = "Kids";
        adult1.requestBook();

        System.out.println();

        AdultUser adult2 = new AdultUser();
        adult2.age = 23;
        adult2.registerAcc();

        adult2.bookType = "Fiction";
        adult2.requestBook();
    }
}
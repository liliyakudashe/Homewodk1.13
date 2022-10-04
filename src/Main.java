public class Main {

    public static void main(String[] args) {

            Author joanneRowling = new Author("Joanne Rowling");
            Book hp = new Book("Harry Potter the Philosopher's Stone", "1997", joanneRowling);


            Author antoineDeSaintExupery = new Author("Antoine de Saint Exupery");
            Book lp = new Book("The little prince", "1942", antoineDeSaintExupery);
            System.out.println(lp);
            System.out.println(hp);

            hp.setYearOfPublicationOfTheBook("2022");

            lp.setYearOfPublicationOfTheBook("2021");

        }
    }

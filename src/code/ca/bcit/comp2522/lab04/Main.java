package ca.bcit.comp2522.lab04;

public class Main
{

    static Book book1, book2, book3, book4, book5;
    static Biography bio1, bio2, bio3, bio4, bio5;
    static Autobiography auto1, auto2, auto3, auto4, auto5;
    static Author georgeOrwell, harperLee, janeAusten, fScottFitzgerald, hermanMelville;

    static {
        // Create authors for the books
        Date georgeOrwellBirth = new Date(1903, 5, 25);
        Date georgeOrwellDeath = new Date(1950, 1, 21);
        Name georgeOrwellName = new Name("George", "Orwell");
        georgeOrwell = new Author(georgeOrwellBirth, georgeOrwellDeath, georgeOrwellName, "Dystopian");

        Date harperLeeBirth = new Date(1926, 3, 28);
        Date harperLeeDeath = new Date(2016, 1, 19);
        Name harperLeeName = new Name("Harper", "Lee");
        harperLee = new Author(harperLeeBirth, harperLeeDeath, harperLeeName, "Fiction");

        Date janeAustenBirth = new Date(1875, 11, 16);
        Date janeAustenDeath = new Date(1917, 6, 18);
        Name janeAustenName = new Name("Jane", "Austen");
        janeAusten = new Author(janeAustenBirth, janeAustenDeath, janeAustenName, "Romance");

        Date fScottFitzgeraldBirth = new Date(1896, 8, 24);
        Date fScottFitzgeraldDeath = new Date(1940, 11, 21);
        Name fScottFitzgeraldName = new Name("F. Scott", "Fitzgerald");
        fScottFitzgerald = new Author(fScottFitzgeraldBirth, fScottFitzgeraldDeath, fScottFitzgeraldName, "Modernist");

        Date hermanMelvilleBirth = new Date(1819, 7, 1);
        Date hermanMelvilleDeath = new Date(1891, 8, 28);
        Name hermanMelvilleName = new Name("Herman", "Melville");
        hermanMelville = new Author(hermanMelvilleBirth, hermanMelvilleDeath, hermanMelvilleName, "Adventure");

        // Create 5 Books
        book1 = new Book("1984", 1949, georgeOrwell);
        book2 = new Book("To Kill a Mockingbird", 1960, harperLee);
        book3 = new Book("Pride and Prejudice", 1813, janeAusten);
        book4 = new Book("The Great Gatsby", 1925, fScottFitzgerald);
        book5 = new Book("Moby-Dick", 1851, hermanMelville);

        // Biography subjects
        Person robertMoses = new Person(new Date(1888, 11, 18), new Date(1981, 6, 29), new Name("Robert", "Moses"));
        Person steveJobs = new Person(new Date(1955, 1, 24), new Date(2011, 9, 5), new Name("Steve", "Jobs"));
        Person winstonChurchill = new Person(new Date(1874, 10, 30), new Date(1965, 1, 24), new Name("Winston", "Churchill"));
        Person alexanderHamilton = new Person(new Date(1855, 1, 11), new Date(1904, 6, 12), new Name("Alexander", "Hamilton"));
        Person albertEinstein = new Person(new Date(1879, 2, 14), new Date(1955, 3, 18), new Name("Albert", "Einstein"));

        // Biography authors
        Author robertCaro = new Author(new Date(1936, 9, 30), null, new Name("Robert", "Caro"), "Biography");
        Author walterIsaacson = new Author(new Date(1952, 4, 20), null, new Name("Walter", "Isaacson"), "Biography");
        Author martinGilbert = new Author(new Date(1936, 9, 25), new Date(2015, 1, 3), new Name("Martin", "Gilbert"), "History");
        Author ronChernow = new Author(new Date(1949, 2, 3), null, new Name("Ron", "Chernow"), "Biography");

        // Biographies
        bio1 = new Biography("The Power Broker", 1974, robertCaro, robertMoses);
        bio2 = new Biography("Steve Jobs", 2011, walterIsaacson, steveJobs);
        bio3 = new Biography("Churchill: A Life", 1991, martinGilbert, winstonChurchill);
        bio4 = new Biography("Alexander Hamilton", 2004, ronChernow, alexanderHamilton);
        bio5 = new Biography("Einstein: His Life and Universe", 2007, walterIsaacson, albertEinstein);

        // Autobiographies
        Author anneFrank = new Author(new Date(1929, 5, 12), new Date(1945, 1, 1), new Name("Anne", "Frank"), "Diary");
        Author nelsonMandela = new Author(new Date(1918, 6, 18), new Date(2013, 11, 5), new Name("Nelson", "Mandela"), "Autobiography");
        Author mahatmaGandhi = new Author(new Date(1869, 9, 2), new Date(1948, 1, 30), new Name("Mahatma", "Gandhi"), "Autobiography");
        Author mayaAngelou = new Author(new Date(1928, 3, 4), new Date(2014, 4, 28), new Name("Maya", "Angelou"), "Autobiography");
        Author malcolmX = new Author(new Date(1925, 4, 19), new Date(1965, 1, 21), new Name("Malcolm", "X"), "Autobiography");

        auto1 = new Autobiography("The Diary of a Young Girl", 1947, anneFrank);
        auto2 = new Autobiography("Long Walk to Freedom", 1994, nelsonMandela);
        auto3 = new Autobiography("The Story of My Experiments with Truth", 1927, mahatmaGandhi);
        auto4 = new Autobiography("I Know Why the Caged Bird Sings", 1969, mayaAngelou);
        auto5 = new Autobiography("Autobiography of Malcolm X", 1965, malcolmX);
    }

    public static void main(String[] args)
    {

//        Date georgeOrwellBirth = new Date(1903, 5, 25);
//        Date georgeOrwellDeath = new Date(1950, 0, 21);
//        Name georgeOrwellName = new Name("George", "Orwell");
//        Author georgeOrwell = new Author(georgeOrwellBirth, georgeOrwellDeath, georgeOrwellName, "Dystopian");
//        Date harperLeeBirth = new Date(1926, 3, 28);
//        Date harperLeeDeath = new Date(2016, 1, 19);
//        Name harperLeeName = new Name("Harper", "Lee");
//        Author harperLee = new Author(harperLeeBirth, harperLeeDeath, harperLeeName, "Fiction");
//        Date janeAustenBirth = new Date(1775, 11, 16);
//        Date janeAustenDeath = new Date(1817, 6, 18);
//        Name janeAustenName = new Name("Jane", "Austen");
//        Author janeAusten = new Author(janeAustenBirth, janeAustenDeath, janeAustenName, "Romance");
//        Date fScottFitzgeraldBirth = new Date(1896, 8, 24);
//        Date fScottFitzgeraldDeath = new Date(1940, 11, 21);
//        Name fScottFitzgeraldName = new Name("F. Scott", "Fitzgerald");
//        Author fScottFitzgerald = new Author(fScottFitzgeraldBirth, fScottFitzgeraldDeath, fScottFitzgeraldName,
//                                                                                     "Modernist");
//        Date hermanMelvilleBirth = new Date(1819, 7, 1);
//        Date hermanMelvilleDeath = new Date(1891, 8, 28);
//        Name hermanMelvilleName = new Name("Herman", "Melville");
//        Author hermanMelville = new Author(hermanMelvilleBirth, hermanMelvilleDeath, hermanMelvilleName, "Adventure");
//
//        Book book1 = new Book("1984", 1949, georgeOrwell);
//        Book book2 = new Book("To Kill a Mockingbird", 1960, harperLee);
//        Book book3 = new Book("Pride and Prejudice", 1813, janeAusten);
//        Book book4 = new Book("The Great Gatsby", 1925, fScottFitzgerald);
//        Book book5 = new Book("Moby-Dick", 1851, hermanMelville);
//
//        Date robertMosesBirth = new Date(1888, 11, 18);
//        Date robertMosesDeath = new Date(1981, 6, 29);
//        Name robertMosesName = new Name("Robert", "Moses");
//        Person robertMoses = new Person(robertMosesBirth, robertMosesDeath, robertMosesName);
//        Date steveJobsBirth = new Date(1955, 1, 24);
//        Date steveJobsDeath = new Date(2011, 9, 5);
//        Name steveJobsName = new Name("Steve", "Jobs");
//        Person steveJobs = new Person(steveJobsBirth, steveJobsDeath, steveJobsName);
//        Date winstonChurchillBirth = new Date(1874, 10, 30);
//        Date winstonChurchillDeath = new Date(1965, 0, 24);
//        Name winstonChurchillName = new Name("Winston", "Churchill");
//        Person winstonChurchill = new Person(winstonChurchillBirth, winstonChurchillDeath, winstonChurchillName);
//        Date alexanderHamiltonBirth = new Date(1755, 0, 11);
//        Date alexanderHamiltonDeath = new Date(1804, 6, 12);
//        Name alexanderHamiltonName = new Name("Alexander", "Hamilton");
//        Person alexanderHamilton = new Person(alexanderHamiltonBirth, alexanderHamiltonDeath, alexanderHamiltonName);
//        Date albertEinsteinBirth = new Date(1879, 2, 14);
//        Date albertEinsteinDeath = new Date(1955, 3, 18);
//        Name albertEinsteinName = new Name("Albert", "Einstein");
//        Person albertEinstein = new Person(albertEinsteinBirth, albertEinsteinDeath, albertEinsteinName);
//
//        Date robertCaroBirth = new Date(1936, 9, 30);
//        Name robertCaroName = new Name("Robert", "Caro");
//        Author robertCaro = new Author(robertCaroBirth, null, robertCaroName, "Biography");
//        Date walterIsaacsonBirth = new Date(1952, 4, 20);
//        Name walterIsaacsonName = new Name("Walter", "Isaacson");
//        Author walterIsaacson = new Author(walterIsaacsonBirth, null, walterIsaacsonName, "Biography");
//        Date martinGilbertBirth = new Date(1936, 9, 25);
//        Date martinGilbertDeath = new Date(2015, 1, 3);
//        Name martinGilbertName = new Name("Martin", "Gilbert");
//        Author martinGilbert = new Author(martinGilbertBirth, martinGilbertDeath, martinGilbertName, "History");
//        Date ronChernowBirth = new Date(1949, 2, 3);
//        Name ronChernowName = new Name("Ron", "Chernow");
//        Author ronChernow = new Author(ronChernowBirth, null, ronChernowName, "Biography");
//
//        Biography bio1 = new Biography("The Power Broker", 1974, robertCaro, robertMoses);
//        Biography bio2 = new Biography("Steve Jobs", 2011, walterIsaacson, steveJobs);
//        Biography bio3 = new Biography("Churchill: A Life", 1991, martinGilbert, winstonChurchill);
//        Biography bio4 = new Biography("Alexander Hamilton", 2004, ronChernow, alexanderHamilton);
//        Biography bio5 = new Biography("Einstein: His Life and Universe", 2007, walterIsaacson, albertEinstein);
//
//        Date anneFrankBirth = new Date(1929, 5, 12);
//        Date anneFrankDeath = new Date(1945, 1, 1);
//        Name anneFrankName = new Name("Anne", "Frank");
//        Author anneFrank = new Author(anneFrankBirth, anneFrankDeath, anneFrankName, "Diary");
//        Date nelsonMandelaBirth = new Date(1918, 6, 18);
//        Date nelsonMandelaDeath = new Date(2013, 11, 5);
//        Name nelsonMandelaName = new Name("Nelson", "Mandela");
//        Author nelsonMandela = new Author(nelsonMandelaBirth, nelsonMandelaDeath, nelsonMandelaName, "Autobiography");
//        Date mahatmaGandhiBirth = new Date(1869, 9, 2);
//        Date mahatmaGandhiDeath = new Date(1948, 0, 30);
//        Name mahatmaGandhiName = new Name("Mahatma", "Gandhi");
//        Author mahatmaGandhi = new Author(mahatmaGandhiBirth, mahatmaGandhiDeath, mahatmaGandhiName, "Autobiography");
//        Date mayaAngelouBirth = new Date(1928, 3, 4);
//        Date mayaAngelouDeath = new Date(2014, 4, 28);
//        Name mayaAngelouName = new Name("Maya", "Angelou");
//        Author mayaAngelou = new Author(mayaAngelouBirth, mayaAngelouDeath, mayaAngelouName, "Autobiography");
//        Date malcolmXBirth = new Date(1925, 4, 19);
//        Date malcolmXDeath = new Date(1965, 1, 21);
//        Name malcolmXName = new Name("Malcolm", "X");
//        Author malcolmX = new Author(malcolmXBirth, malcolmXDeath, malcolmXName, "Autobiography");
//
//        Autobiography auto1 = new Autobiography("The Diary of a Young Girl", 1947, anneFrank);
//        Autobiography auto2 = new Autobiography("Long Walk to Freedom", 1994, nelsonMandela);
//        Autobiography auto3 = new Autobiography("The Story of My Experiments with Truth", 1927, mahatmaGandhi);
//        Autobiography auto4 = new Autobiography("I Know Why the Caged Bird Sings", 1969, mayaAngelou);
//        Autobiography auto5 = new Autobiography("Autobiography of Malcolm X", 1965, malcolmX);

        System.out.println("=== BOOKS ===");
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();

        System.out.println("\n=== BIOGRAPHIES ===");
        bio1.display();
        bio2.display();
        bio3.display();
        bio4.display();
        bio5.display();

        System.out.println("\n=== AUTOBIOGRAPHIES ===");
        auto1.display();
        auto2.display();
        auto3.display();
        auto4.display();
        auto5.display();

        System.out.println("\n=== REVERSIBLE OUTPUT ===");
        book1.backward();
        book2.backward();
        book3.backward();
        book4.backward();
        book5.backward();
        georgeOrwell.backward();
        harperLee.backward();
        janeAusten.backward();
        fScottFitzgerald.backward();
        hermanMelville.backward();

        System.out.println("\n=== COMPARISONS ===");
        System.out.println("Comparing books by publication year:");
        System.out.println(book1.getTitle() + " vs " + book2.getTitle() + ": " + book1.compareTo(book2));
        System.out.println(book3.getTitle() + " vs " + book4.getTitle() + ": " + book3.compareTo(book4));
        System.out.println("\nComparing authors by birthdate:");
        System.out.println(georgeOrwell.getName().getFullName() + " vs " + harperLee.getName().getFullName() + ": " + georgeOrwell.compareTo(harperLee));
        System.out.println(janeAusten.getName().getFullName() + " vs " + fScottFitzgerald.getName().getFullName() +
                           ": " + janeAusten.compareTo(fScottFitzgerald));

        System.out.println("\nComparing biographies by subjects:");
        System.out.println(bio1.getTitle() + " equals " + bio2.getTitle() + ": " + bio1.equals(bio2));
        System.out.println(bio3.getTitle() + " equals " + bio4.getTitle() + ": " + bio3.equals(bio4));

//        Biography bio2Copy = new Biography("Steve Jobs: The Biography", 2015, ronChernow, steveJobs);
//        System.out.println(bio2.getTitle() + " equals " + bio2Copy.getTitle() + ": " + bio2.equals(bio2Copy));
    }
}
class Library {
    private String book;

    Library(String book) {
        this.book = book;
    }

    public String getBook() {
        return book;
    }
}

class Student {
    private String name;
    private Library library;

    Student(String name) {
        this.name = name;
        this.library = new Library("Java Programming"); // Early Instantiation
    }

    public String getName() {
        return name;
    }

    public Library getLibrary() {
        return library;
    }
}

class Ear1 {
    public static void main(String[] args) {
        Student s = new Student("Amit");
        System.out.println(s.getName());
        System.out.println(s.getLibrary().getBook());
    }
}

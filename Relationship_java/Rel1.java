class Library{
    private String Books;

    public String getBooks() {
        return Books;
    }

    public void setBooks(String books) {
        Books = books;
    }

    Library(String books){
        setBooks(books);
    }
}

class Student{
    private String sName;
    private Library library; // HAS-A relationship

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    Student(String sName){
        setSName(sName);
    }
}

class Rel1{
    public static void main(String[] args) {
        Student student = new Student("King");
        Library library = new Library("Introduction to Java");

        student.setLibrary(library);

        System.out.println("Student Name: " + student.getSName());
        System.out.println("Library Book: " + student.getLibrary().getBooks());
    }
}
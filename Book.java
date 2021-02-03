package school;

class Book {

    private int id;
    private String name;
    private String authorName;
    private int numberOfPages;
    private int releaseYear;

    public Book(int id, String name, String authorName, int numberOfPages, int releaseYear) {

        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
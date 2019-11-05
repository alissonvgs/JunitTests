public class Post{
    
    private User author;
    private String description;
    
    public void setAuthor(User author) {
        this.author = author;
    }
    
    public User getAuthor() {
        return author;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}

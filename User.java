import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class User {
    
    private String email;
    private String password;
    private String login;
    private String bio;
    private Date created;
    private List<Post> posts = new ArrayList<Post>();
    private List <Relation> myFollowers = new ArrayList<Relation>();
    private List <Relation> myFolloweds = new ArrayList<Relation>();
   
    
    public User() {
        this.created = new Date();
    }
    
    public void addFollowed(User toBeFollowed) {
        Relation relation = new Relation ();
        relation.setFollower(this);
        relation.setFollowed(toBeFollowed);
        this.myFolloweds.add(relation);
        toBeFollowed.myFollowers.add(relation);
    }
    
    public List<User> getFolloweds(){
        List<User> temp = new ArrayList<User>();
        for( Relation r : myFolloweds){
            temp.add(r.getFollowed());
        }
        return temp;
    }
    
    public List<User> getFollowers(){
        List<User> temp = new ArrayList<User>();
        for( Relation r : myFollowers){
            temp.add(r.getFollower());
        }
        return temp;
    }
    
    public List<Post> getFeed() {
        ArrayList<Post> feed = new ArrayList<>();
        for(Post post: this.getPosts()){
            feed.add(post);
        }
        for(Relation relation: this.myFolloweds){
            List<Post>followedPosts = relation.getFollowed().getPosts();
            for(Post post: followedPosts){
                feed.add(post);
            }
        }
        return feed;
    }
    
    public void addPost(Post post) {
        this.posts.add(post);
    }
    
    public List<Post> getPosts() {
        return posts;
    }
    
    public Date getCreated() {
        return created;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getBio() {
        return bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}

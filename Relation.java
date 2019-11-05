

public class Relation{

    private User follower;
    private User followed;
    
    public User getFollower(){
        return this.follower;
    }
    
    public User getFollowed(){
        return this.followed;
    }
   
    public void setFollower(User follower){
        this.follower = follower;
    }

    public void setFollowed(User followed){
        this.followed = followed;
    }
}


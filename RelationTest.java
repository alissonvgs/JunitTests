
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RelationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RelationTest
{
    /**
     * Default constructor for test class RelationTest
     */
    public RelationTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void relateThreeUsers()
    {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setLogin("jose");
        user2.setLogin("joao");
        user3.setLogin("maria");
        user1.addFollowed(user2);
        user1.addFollowed(user3);
        user2.addFollowed(user3);

        assertEquals(0, user1.getFollowers().size());
        assertEquals(2, user1.getFolloweds().size());

        assertEquals(1, user2.getFollowers().size());
        assertEquals(1, user2.getFolloweds().size());

        assertEquals(2, user3.getFollowers().size());
        assertEquals(0, user3.getFolloweds().size());

        Post post1 = new Post();
        post1.setAuthor(user2);
        post1.setDescription("Eu sou Joao");
        user2.addPost(post1);

        Post post2 = new Post();
        post2.setAuthor(user1);
        post2.setDescription("Eu sou Jose");
        user1.addPost(post2);

        Post post3 = new Post();
        post3.setAuthor(user3);
        post3.setDescription("Segue a lider");
        user3.addPost(post3);

        assertEquals(3, user1.getFeed().size());
        assertEquals(2, user2.getFeed().size());
        assertEquals(1, user3.getFeed().size());
    }

    @Test
    public void miniTestAPS()
    {
        User user1 = new User();
        User user2 = new User();
        user1.setLogin("Alisson");
        user2.setLogin("Victor");
        assertEquals("Alisson", user1.getLogin());
        assertEquals("Victor", user2.getLogin());
        
        user1.addFollowed(user2);
        user2.addFollowed(user1);
        assertEquals(1,user1.getFolloweds().size());
        assertEquals(1,user2.getFolloweds().size());
        
        Post post1 = new Post();
        Post post2 = new Post();
        post1.setAuthor(user1);
        post1.setDescription("idk");
        post2.setAuthor(user2);
        post2.setDescription("idk too");
        assertEquals(user1, post1.getAuthor());
        assertEquals(user2, post2.getAuthor());
        assertEquals("idk", post1.getDescription());
        assertEquals("idk too", post2.getDescription());
        
        user1.addPost(post1);
        user2.addPost(post2);
        assertEquals(2, user1.getFeed().size());      
        assertEquals(2, user2.getFeed().size()); 
        
    }
}


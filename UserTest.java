import java.util.List;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UserTest
{
    /**
     * Default constructor for test class UserTest
     */
    public UserTest()
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
    public void basicUser()
    {
        User user1 = new User();
        user1.setEmail("jose@gmail.com");
        assertEquals("jose@gmail.com", user1.getEmail());
    }

    @Test
    public void fullUser()
    {
        User user1 = new User();
        user1.setBio("Bio 1");
        user1.setEmail("email1@gmail.com");
        user1.setLogin("login1");
        user1.setPassword("123");
        assertEquals("Bio 1", user1.getBio());
        assertEquals("email1@gmail.com", user1.getEmail());
        assertEquals("login1", user1.getLogin());
        assertEquals("123", user1.getPassword());
    }

    @Test
    public void postToUser()
    {
        User user1 = new User();
        user1.setLogin("rodrigo");
        Post post1 = new Post();
        post1.setDescription("Partiu APS");
        post1.setAuthor(user1);
        assertEquals("Partiu APS", post1.getDescription());
        assertEquals(user1, post1.getAuthor());
        assertEquals("rodrigo", post1.getAuthor().getLogin());
    }


    @Test
    public void twoUsersWithPosts()
    {
        User user1 = new User();
        User user2 = new User();
        user1.setLogin("douglas");
        user2.setLogin("vinnicius");
        Post post1 = new Post();
        post1.setDescription("Partiu Tekfim");
        post1.setAuthor(user1);
        user1.addPost(post1);
        Post post2 = new Post();
        post2.setDescription("Tô riko!");
        post2.setAuthor(user1);
        user1.addPost(post2);
        Post post3 = new Post();
        post3.setDescription("APS é peso!");
        post3.setAuthor(user1);
        user1.addPost(post3);
        Post post4 = new Post();
        post4.setAuthor(user2);
        post4.setDescription("Ouviram do Ipiranga");
        user2.addPost(post4);
        Post post5 = new Post();
        post5.setAuthor(user2);
        post5.setDescription("O choro é livre");
        user2.addPost(post5);
        List<Post> douglasPosts = user1.getPosts();
        assertEquals(3, douglasPosts.size());
        List<Post> vinniciusPosts = user2.getPosts();
        assertEquals(2, vinniciusPosts.size());
        assertEquals(post1, douglasPosts.get(0));
        assertEquals(post2, douglasPosts.get(1));
        assertEquals(post3, douglasPosts.get(2));
        assertEquals(post4, vinniciusPosts.get(0));
        assertEquals(post5, vinniciusPosts.get(1));
    }
}






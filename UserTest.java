

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste UserTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class UserTest
{
    /**
     * Construtor default para a classe de teste UserTest
     */
    public UserTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        User user1 = new User();
        user1.setEmail("ali@email.com");
        user1.setLogin("ali");
        user1.setPassword("ali00");
        user1.setbio("bio1");
        assertEquals("bio1", user1.getBio());
        user1.getCreated();
        assertEquals("ali@email.com", user1.getEmail());
        assertEquals("ali00", user1.getPassword());
        assertEquals("ali", user1.getLogin());
    }
    
    @Test
    public void TestWithError()
    {
        User user1 = new User();
        user1.setEmail("ali@email.com");
        user1.setLogin("ali");
        user1.setPassword("ali00");
        user1.setbio("bio1");
        assertEquals("bio 1", user1.getBio());
        user1.getCreated();
        assertEquals("alisson@email.com", user1.getEmail());
        assertEquals("ali00", user1.getPassword());
        assertEquals("ali", user1.getLogin());
    }
    
    @Test
    public void user2created()
    {
        User user2 = new User();
        user2.setEmail("peixe@gmail.com");
        user2.setLogin("peixe");
        user2.setPassword("tilapia");
        user2.setbio("bio0");
        assertEquals("bio0", user2.getBio());
        user2.getCreated();
        assertEquals("peixe@gmail.com", user2.getEmail());
        assertEquals("tilapia", user2.getPassword());
        assertEquals("peixe", user2.getLogin());
    }
    
    @Test
    public void userToPost()
    {
    User user1 = new User();
    user1.setEmail("alisson@gmail.com");
    user1.setLogin("alissonvgs");
    assertEquals("alissonvgs", user1.getLogin());
    Post post1 = new Post();
    post1.setAuthor(user1);
    post1.setDescription("Alguma descriçao");
    assertEquals(user1, post1.getAuthor());
    assertEquals("Alguma descriçao", post1.getDescription());    
    }
}


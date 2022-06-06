import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestLionAlex {

    private LionAlex lionAlex = new LionAlex();

    public TestLionAlex() throws Exception {
    }

    @Test
    public void testLionAlexConstructor(){
        Assert.assertEquals(true,lionAlex.doesHaveMane());
    }

    @Test
    public void testGetFriends() throws Exception {
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"),lionAlex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving(){
        Assert.assertEquals("Нью-Йоркский зоопарк",lionAlex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens(){
        Assert.assertEquals(0,lionAlex.getKittens());
    }
}

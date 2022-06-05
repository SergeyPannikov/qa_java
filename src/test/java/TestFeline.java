import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class TestFeline {

    Feline feline = new Feline();

    @Test
    public void testGetFamilyMethod(){

        Assert.assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void testGetKittensWithoutParameters(){
        int actualKittensNumber = feline.getKittens();
        Assert.assertEquals(1,actualKittensNumber);
    }

    @Test
    public void testGetKittensWithParameter(){
        int actualKittensNumber = feline.getKittens(100);
        Assert.assertEquals(100,actualKittensNumber);
    }
}

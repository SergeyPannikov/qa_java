import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Mock
    Feline feline;


    @Test
    public void testGetFamilyMethod(){
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void testGetKittensWithoutParameters(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensNumber = feline.getKittens();
        Assert.assertEquals(1,actualKittensNumber);
    }

    @Test
    public void testGetKittensWithParameters(){
        Mockito.when(feline.getKittens(0)).thenReturn(1);
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        Mockito.when(feline.getKittens(100)).thenReturn(100);
        int actualKittensNumber = feline.getKittens(0);
        Assert.assertEquals(1,actualKittensNumber);
        actualKittensNumber = feline.getKittens(1);
        Assert.assertEquals(1,actualKittensNumber);
        actualKittensNumber = feline.getKittens(100);
        Assert.assertEquals(100,actualKittensNumber);
    }
}

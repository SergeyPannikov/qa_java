import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    Lion lion = Mockito.mock(Lion.class);

    @Test
    public void testGetKittensMethod(){
        Mockito.when(lion.getKittens()).thenReturn(1);
        Assert.assertEquals(1,lion.getKittens());
    }

    @Test
    public void testDoesHaveManeMethod(){
        Mockito.when(lion.doesHaveMane()).thenReturn(true);
        Assert.assertEquals(true,lion.doesHaveMane());
    }

    @Test
    public void testGetFoodMethod() throws Exception {
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }


}

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
/*
Тут все можно проверить если вот сделать  private Cat cat = new Cat(new Feline()); - но насколько это правильно и можно ли так делать для этого задания ?
*/
@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Feline feline;

    private Cat cat = new Cat(feline);

    @Test
    public void checkGetSoundMethodWork(){
        String actual = cat.getSound();
        Assert.assertEquals("Мяу", actual);
    }

    @Test
    public void checkGetFoodMethodWork() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }
}

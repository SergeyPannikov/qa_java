import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

@RunWith(Parameterized.class)
public class TestLion {

    private final String sex;
    private final boolean expected;

    public TestLion(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самец",true},
                {"Самка",false},
                {"Нечто",false},
        };
    }

    Lion lion = Mockito.mock(Lion.class);

    @Test
    public void testGetKittensMethod(){
        Mockito.when(lion.getKittens()).thenReturn(1);
        Assert.assertEquals(1,lion.getKittens());
    }

    @Test
    public void testDoesHaveManeMethod(){
        Mockito.when(lion.doesHaveMane()).thenReturn(false);
        Assert.assertEquals(false,lion.doesHaveMane());
    }

    @Test
    public void testGetFoodMethod() throws Exception {
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test
    public void testLionConstructor() throws Exception {
        try {
            Lion lion = new Lion(sex);
            Assert.assertEquals(expected,lion.doesHaveMane());
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}

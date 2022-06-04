import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestLionParameterized {
    private final String sex;
    private final boolean expected;

    public TestLionParameterized(String sex, boolean expected) {
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

    @Test
    public void testLionConstructor() throws Exception {
        try {
            Lion lion = new Lion(sex,new Feline());
            Assert.assertEquals(expected,lion.doesHaveMane());
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}

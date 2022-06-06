import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class TestLionParameterized {
    private final String sex;
    private final boolean expectedMane;

    public TestLionParameterized(String sex, boolean expected) {
        this.sex = sex;
        this.expectedMane = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самец",true},
                {"Самка",false},
        };
    }

    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void testDoesHaveManeMethod() throws Exception {
            Lion lion = new Lion(sex,feline);
            Assert.assertEquals(expectedMane,lion.doesHaveMane());
    }
}

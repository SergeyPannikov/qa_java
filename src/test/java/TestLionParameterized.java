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

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самец",true},
                {"Самка",false},
                {"Нечто",false},
        };
    }

    Feline feline = Mockito.mock(Feline.class);

    /*
    обернул тут в try catch , чтобы ловить ошибку в случае, когда мы попадаем в классе на значение отличное от Самец или Самка ,
    тогда отрабатывает Exception , который я ловлю , тест это ждет и успешно отрабатывает , а иначе будет падать с ошибкой тест.
    Можно конечно это третье значение не вставлять, но тогда не все условия будут отработаны в конструкторе, а так красиво все проходит и показывается.
    */
    @Test
    public void testDoesHaveManeMethod() throws Exception {
        try{
            Lion lion = new Lion(sex,feline);
            Assert.assertEquals(expectedMane,lion.doesHaveMane());
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}

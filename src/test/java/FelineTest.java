import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(food, feline.eatMeat());
    }

    @Test
    public void eatNotMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of("Трава", "Различные растения");
        Assert.assertNotEquals(food, feline.eatMeat());
    }

    @Test
    public void eatMeatExceptionTest() {
        Feline feline = new Feline();
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            feline.getFood("Микроб");
        });
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}

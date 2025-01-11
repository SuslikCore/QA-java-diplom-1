import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {

    @Test
    public void getFirstValueofEnumTest(){
        IngredientType firstValue = IngredientType.values()[0];
        Assert.assertEquals(firstValue, IngredientType.SAUCE);
    }

    @Test
    public void CorrectSizeOftheEnumTest(){
        int size = IngredientType.values().length;
        Assert.assertEquals(size, IngredientType.values().length);
    }

}

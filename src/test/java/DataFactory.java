import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class DataFactory {

    private int param;

    @Factory(dataProvider = "dataMethod")
    public DataFactory(int param) {
        this.param = param;
    }

    @DataProvider
    public static Object[][] dataMethod() {
        return new Object[][] { { 1 }, { 2 } };
    }

}

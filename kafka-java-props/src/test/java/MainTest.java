import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Test
    public void shouldStartApplication() {
        Main.main(new String[]{});
    }
}
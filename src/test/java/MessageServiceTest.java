import com.Study.Service.MessageService;
import com.Study.Service.Impl.AdvancedMessageService;
import com.Study.Service.Impl.SimpleMessageService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTest {

    @Test
    public void testSimpleMessageService() {
        MessageService messageService = new SimpleMessageService();
        assertEquals("Hello this is Simple Message.", messageService.getMessage());
    }

    @Test
    public void testAdvancedMessageService() {
        MessageService messageService = new AdvancedMessageService();
        assertEquals("Hello this is an advance message.", messageService.getMessage());
    }
}

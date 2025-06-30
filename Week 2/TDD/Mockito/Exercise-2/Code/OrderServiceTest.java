import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {
    @Test
    public void testPaymentProcessed() {
        PaymentGateway gateway = mock(PaymentGateway.class);
        when(gateway.process(100.0)).thenReturn(true);

        OrderService service = new OrderService(gateway);
        boolean result = service.placeOrder(100.0);

        assertTrue(result);
        verify(gateway).process(100.0);
    }
}

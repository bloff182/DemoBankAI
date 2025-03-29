package bank;

The issue here is that the `Mockito` library is not imported in the test class. To fix this, you need to add the necessary import statement at the top of your test class.

Here's an example of how you can correct the error:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// ... rest of your code ...

@Test
void testSomething() {
    // Your test code here...
}

import org.example.PhoneBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Alice", "12345"));
        assertEquals(-1, phoneBook.add("Alice", "54321")); // Повторяющееся имя
        assertEquals(2, phoneBook.add("Bob", "98765"));
        assertEquals(3, phoneBook.add("Charlie", "2468"));
    }
}

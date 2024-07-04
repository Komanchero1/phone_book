import org.example.PhoneBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {


    //тест проверяет, что при добавлении нового контакта в телефонную книгу,
    // метод add() возвращает правильное значение, соответствующее количеству контактов
    // в телефонной книге
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();//создается объект класса PhoneBook
        //вызывается метод add с аргументами Alice и 12345 метод проверяет есть такое имя или нет ,
        // если нет добавляет контакт и возвращает число контактов , ожидаемо 1
        assertEquals(1, phoneBook.add("Alice", "12345"));
        //тоже что и первый раз с теми же аргументами ожидаемый возврат -1, контакт повторяется не добавлен
        assertEquals(-1, phoneBook.add("Alice", "54321")); // Повторяющееся имя
        //тоже что и первый раз  только меняем аргументы ожидаемый возврат 2
        assertEquals(2, phoneBook.add("Bob", "98765"));
        //тоже что и первый раз  только меняем аргументы ожидаемый возврат 3
        assertEquals(3, phoneBook.add("Charlie", "2468"));
    }


    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "98765");
        assertEquals("Alice", phoneBook.findByNumber("12345"));
        assertEquals("Bob", phoneBook.findByNumber("98765"));
        assertNull(phoneBook.findByNumber("99999")); // Несуществующий номер
    }
}

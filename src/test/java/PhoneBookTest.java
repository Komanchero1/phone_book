import org.example.PhoneBook;
import org.junit.Test;

import static org.junit.Assert.*;

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

//тест метода для поиска имени по номеру
    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();//создается объект класса PhoneBook
        phoneBook.add("Alice", "12345");//добавляем контакт
        phoneBook.add("Bob", "98765");//добавляем контакт
        //вызываем метод findByNumber передаем ему номер 12345 ожидаемый возврат "Alice"
        assertEquals("Alice", phoneBook.findByNumber("12345"));
        //вызываем метод findByNumber передаем ему номер 98765 ожидаемый возврат "Bob"
        assertEquals("Bob", phoneBook.findByNumber("98765"));
        //вызываем метод findByNumber передаем ему номер 99999 ожидаемый возврат null
        assertNull(phoneBook.findByNumber("99999")); // Несуществующий номер
    }


    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();//создается объект класса PhoneBook
        phoneBook.add("Alice", "12345");//добавляем контакт
        phoneBook.add("Bob", "98765");//добавляем контакт
        //вызываем метод findByName передаем ему имя  Alice метод ищет имя в мапе  contactsByName
        // ожидаемый возврат 12345
        assertEquals("12345", phoneBook.findByName("Alice"));
        //вызываем метод findByName передаем ему имя  Bob метод ищет имя в мапе  contactsByName
        // ожидаемый возврат 98765
        assertEquals("98765", phoneBook.findByName("Bob"));
        //вызываем метод findByName передаем ему имя  Eve метод ищет имя в мапе  contactsByName
        // ожидаемый возврат null
        assertNull(phoneBook.findByName("Eve")); // Несуществующее имя
    }
// думаю этот тест не имеет смысла
    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        phoneBook.add("Bob", "98765");
        phoneBook.add("Charlie", "2468");

        // Проверяем вывод всех имен
        String[] expectedNames = {"Alice", "Bob", "Charlie"};
        String[] actualNames = new String[phoneBook.allNames.size()];
        phoneBook.allNames.toArray(actualNames);
        assertArrayEquals(expectedNames, actualNames);
    }
}

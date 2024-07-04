package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class PhoneBook {
    public Map<String, String> contactsByName;//мапа в качестве ключей имена
    public Map<String, String> contactsByNumber;//мапа в качестве ключей телефоны
    public SortedSet<String> allNames;//коллекция для сортировки контактов


    //в конструкторе  инициализируются три коллекции, которые будут использоваться
    // для хранения и поиска контактов в телефонной книге
    public PhoneBook() {
        contactsByName = new HashMap<>();
        contactsByNumber = new HashMap<>();
        allNames = new TreeSet<>();
    }
    //метод добавляет контакт в телефонную книгу, принимает два аргумента name и  number
    public int add(String name, String number) {
        if (!contactsByName.containsKey(name)) {//проверяем наличие имени в книге
            contactsByName.put(name, number);//если нет добавляем в мапу в качестве ключа выступает имя
            contactsByNumber.put(number, name);//в эту мапу добавляем в качестве ключа выступает номер
            allNames.add(name);//добавляем контакт в коллекцию
            return contactsByName.size();//возвращается количество контактов
        } else {
            return -1; // если имя существует возвращается -1 контакт не добавлен
        }
    }
}

package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class PhoneBook {
    public Map<String, String> contactsByName;
    public Map<String, String> contactsByNumber;
    public SortedSet<String> allNames;

    public PhoneBook() {
        contactsByName = new HashMap<>();
        contactsByNumber = new HashMap<>();
        allNames = new TreeSet<>();
    }

public int add(String name, String number) {
        return 0;
}
}

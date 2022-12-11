/**
 * Assignment 3 - Family Tree
 * Author: uzrzro
 * Dec 10, 2022
 */
public class TestClass {

    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        // Details for Anna Eleanor Roosevelt
        tree.addPerson("Anna Eleanor Roosevelt", 1884, 1962); // DOB, death
        tree.addEvent("Anna Eleanor Roosevelt",  1961, "1st Chair of the Presidential Commission on the Status of Women");
        tree.addEvent("Anna Eleanor Roosevelt",  1947, "1st United States Representative to the United Nations Commission on Human Rights");
        tree.addEvent("Anna Eleanor Roosevelt",  1946, "1st Chair of the United Nations Commission on Human Rights");

        // Details & marriage for Franklin Delano Roosevelt
        tree.addPerson("Franklin Delano Roosevelt", 1882, 1945); // DOB, death
        tree.addRelationship("Anna Eleanor Roosevelt", "Franklin Delano Roosevelt", "married");

        // Details & parents for Franklin Delano Roosevelt Jr.
        tree.addPerson("Franklin Delano Roosevelt Jr.", 1914, 0);
        tree.addEvent("Franklin Delano Roosevelt Jr.",1949, "Member of the U.S. House of Representatives from New York's 20th district");
        tree.addEvent("Franklin Delano Roosevelt Jr.", 1963, "United States Under Secretary of Commerce");
        tree.addRelationship("Anna Eleanor Roosevelt", "Franklin Delano Roosevelt Jr.", "parent");

        // Details for Franklin Delano Roosevelt III
        tree.addPerson("Franklin Delano Roosevelt III", 1938, 0);
        tree.addRelationship("Franklin Delano Roosevelt Jr.", "Franklin Delano Roosevelt III", "parent");

        // Anna Eleanor Roosevelt Halsted
        tree.addPerson("Anna Eleanor Roosevelt Halsted", 1906, 0);
        tree.addRelationship("Anna Eleanor Roosevelt", "Anna Eleanor Roosevelt Halsted", "parent");

        // Anna Eleanor Roosevelt Dall
        tree.addPerson("Anna Eleanor Roosevelt Dall", 1927, 0);
        tree.addRelationship("Anna Eleanor Roosevelt Halsted", "Anna Eleanor Roosevelt Dall", "parent");

        // Curtis Roosevelt Dall
        tree.addPerson("Curtis Roosevelt Dall", 1930, 0);
        tree.addRelationship("Anna Eleanor Roosevelt Halsted", "Curtis Roosevelt Dall", "parent");

        // Details for John Roosevelt Boettiger
        tree.addPerson("John Roosevelt Boettiger", 1939, 0);
        tree.addRelationship("Anna Eleanor Roosevelt Halsted", "John Roosevelt Boettiger", "parent");

        // Elliott Roosevelt
        tree.addPerson("Elliott Roosevelt", 1910, 0);
        tree.addRelationship("Anna Eleanor Roosevelt", "Elliott Roosevelt", "parent");

        // James Roosevelt II
        tree.addPerson("James Roosevelt II", 1907, 0);
        tree.addRelationship("Anna Eleanor Roosevelt", "James Roosevelt II", "parent");

        // Sara Delano Roosevelt
        tree.addPerson("Sara Delano Roosevelt", 1932, 0);
        tree.addRelationship("James Roosevelt II", "Sara Delano Roosevelt", "parent");

        // James Roosevelt III
        tree.addPerson("James Roosevelt III", 1945, 0);
        tree.addRelationship("James Roosevelt II", "James Roosevelt III", "parent");

        // John Aspinwall Roosevelt II
        tree.addPerson("John Aspinwall Roosevelt II", 1916, 0);
        tree.addRelationship("Anna Eleanor Roosevelt", "John Aspinwall Roosevelt II", "parent");

        tree.addRelationship("Elliott Roosevelt", "John Aspinwall Roosevelt II", "married");

        // Print Tree
        tree.printFamilyTree("Anna Eleanor Roosevelt");

    }
}

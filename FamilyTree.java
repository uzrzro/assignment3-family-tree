/**
 * Assignment 3 - Family Tree
 * Author: uzrzro
 * Dec 10, 2022
 */

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class FamilyTree {
    // array of parents, array of children
    public Map<String, FamilyNode> root;

    /**
     * Constructor
     */
    public FamilyTree() {
        root = new HashMap<>();
    }

    /**
     * Method to add a person to the family tree
     * @param name Person's name
     * @param dob person's date of birth
     * @param dod person's date of death
     */
    public void addPerson(String name, int dob, int dod) {
        FamilyNode person = new FamilyNode(name, dob, dod);
        this.root.putIfAbsent(name, person);
    }
    
    /**
     * Method to add an event associated with a person
     * @param name Person's name
     * @param year event year
     * @param event event
     */
    public void addEvent(String name, int year, String event) {
        FamilyNode person = this.root.get(name);
        person.setEvent(year, event);
    }

    /**
     * Method to add relationship between two people
     * @param person1 first person
     * @param person2 second person
     * @param relation their relationship
     */
    public void addRelationship(String person1, String person2, String relation) {
        FamilyNode person = this.root.get(person1);
        FamilyNode subject = this.root.get(person2);

        switch (relation.toLowerCase()) {
            case "children", "child", "parent" -> {
                // Change relationship
                subject.parent = person;
                person.addChild(subject);
                for (FamilyNode spouse : person.getSpouse()) {
                    subject.parent = spouse;
                    spouse.addChild(subject);
                }
            }
            case "spouse", "married", "wife", "husband" -> {
                if (person != null && subject != null) {
                    // parents not allowed to marry kids
                    if (person.getChildren().contains(subject) || subject.getChildren().contains(person)) {
                        System.out.println(person1 + " not allowed to marry " + person2 + "!");
                        System.out.println();
                        break;

                    } else if (person.parent == subject.parent) {
                        if (person.parent == null && subject.parent == null) {

                        } else {
                            System.out.println(person1 + " not allowed to marry sibling " + person2 + "!");
                            System.out.println();
                            break;
                        }
                    }

                    // Change relationship
                    person.addSpouse(subject);
                    subject.addSpouse(person);

                } else {
                    System.out.println("No matches found!");
                }

            }
            default -> System.out.println("Done!");
        }
    }

    /**
     * Method for printing the family tree
     * @param rootName root person
     */
    public void printFamilyTree(String rootName) {
        // Get the root node of the tree
        FamilyNode root = this.root.get(rootName);
        root.parent = new FamilyNode("Root", 0, 0);

        // Print the root node
        System.out.println(root);

        // Recursively print the children of the root node
        printChildren(root, 1);
    }

    /**
     * Helper method for recursively printing the children of a node
     * @param node root person
     * @param level generations
     */
    private void printChildren(FamilyNode node, int level) {
        // Get the children of the current node
        List<FamilyNode> children = node.getChildren();

        // Print each child with the appropriate indentation
        for (FamilyNode child : children) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.println(child);

            // Recursively print the children of the child node
            printChildren(child, level + 1);
        }
    }

}
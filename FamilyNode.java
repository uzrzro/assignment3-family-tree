/**
 * Assignment 3 - Family Tree
 * Author: uzrzro
 * Dec 10, 2022
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FamilyNode {
    // Personal Information
    String name;
    int dob;
    int dod;

    // Relations
    FamilyNode parent;
    List<FamilyNode> spouse;
    List<FamilyNode> children;

    // Life events
    HashMap<Integer, String> event = new HashMap<>();

    // Constructor for creating a new node
    public FamilyNode(String name, int dob, int dod) {
        this.name = name;
        this.dob = dob;
        this.dod = dod;
        this.spouse = new ArrayList<>();
        this.children = new ArrayList<>();
        
    }

    // Method for adding a spouse to the node
    public void addSpouse(FamilyNode person) {
        this.spouse.add(person);
    }

    // Method for adding a child to the node
    public void addChild(FamilyNode child) {
        this.children.add(child);
    }

    // Method for getting list of spouses
    public List<FamilyNode> getSpouse () {
        return this.spouse;
    }

    // Method for getting list of children
    public List<FamilyNode> getChildren() {
        return this.children;
    }

    // Method for setting event
    public void setEvent(Integer year, String s) {
        event.putIfAbsent(year, s);
    }

    /**
     * Helper method to returns list of events fo this person
     * @return lis of events
     */
    public String getEvents() {
        String s = "";
        ArrayList<Integer> sortedKeys = new ArrayList<>(event.keySet());
        Collections.sort(sortedKeys);

        // Display the sorted list
        for (Integer x : sortedKeys)
            s = s.concat(x + " : " + event.get(x) + "; ");

        return s;
    }

    /**
     * To string method returns person's information if exists
     * @return information
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.name);
        result.append(" (").append(this.dob).append("-");

        if (this.dod != 0)
            result.append(this.dod);

        result.append(") ");

        if (!this.getEvents().isEmpty())
            result.append("- ").append(this.getEvents());

        return result.toString();
    }

}
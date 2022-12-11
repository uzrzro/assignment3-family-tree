# Assignment 3 - Family Tree

## Dependencies
* `Java List`
* `Java ArrayList`
* `Java Collections`
* `Java Map`
* `Java HashMap`

## Program Overview 
The program accepts information about a family tree. This information includes, person's name, date of birth, death of death and events throughout their life. Then through series of method calls adds relationships about their spouses and children. Lastly, it displays the family tree.

As an example, I use the famous American Roosevelt family, which includes several political figures, inventors and socialites. Among the members of this family are Anna Eleanor Roosevelt (mostly known without her first name, i.e. as “Eleanor Roosevelt”) and her husband Franklin Delano Roosevelt.

The program uses a graph data structure to model the Roosevelt family tree.

### Capabilities:
* The program can add person with their personal information i.c. name, dob, and date of death.
* The program can add events to specified person with the corresponding year.
  * The program take events in random order and display person's events in chronological order.
* The program can add relationship between two people after their have been added to the family tree*.
  * The program can check for and doesn't allow parent to marry their child.
  * The program can check for and doesn't allow siblings to marry each other.

### Sources
* `https://www.codecademy.com/learn/graph-data-structures-java/modules/graphs-java/cheatsheet`
* `https://docs.oracle.com/javase/8/docs/api/java/util/Map.html`
* `https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html`
* `https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html`

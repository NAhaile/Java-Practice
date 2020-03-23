import java.util.*;
public class String3 {
 public static void main(String args[]) {
   ArrayList<String> name = new ArrayList<String>();
   
   name.add("Nate");
   name.add("Really"); // <---- Empty Space, Really Unneded but I wanted to add it anyway
   name.add("ROCKS!");
   

   System.out.println(" --> For Loop ");
   for(int i = 0; i < name.size(); i++) { // <---- using the size of the array to print
     System.out.println(name.get(i));
   }
   

   System.out.println(" --> Enhanced For Loop "); //<--- also using the size of an array just in a different way
   for(String i:name) { 
     System.out.println(i);
   }
   
   System.out.println(" --> Iterator ");
   Iterator<String> nameIterator = name.iterator();
   while(nameIterator.hasNext()) {
     System.out.println(nameIterator.next());
   }
   
   System.out.println(" --> While Loop ");
   int i = 0;
   while(i<name.size()) { // <--- this will get every string
     System.out.println(name.get(i));
     i++;  // <----- Incrementing I to keep going in the while loop(i++ being after the first time i is called upon)
   }
   
   
  
}

}

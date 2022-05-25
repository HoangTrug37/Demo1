/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;

/**
 *
 * @author HP
 */
public class app105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         TreeMap<Integer, Character> treeMap = new TreeMap<>();
         treeMap.put(6, 'a');
         treeMap.put(5, 'B');
         treeMap.put(1, 'C');
         treeMap.put(2, 'D');
         treeMap.put(8, 'E');
         Set<Entry<Integer, Character>> SetTreeMap = treeMap.entrySet();
         System.out.println(" các entry có trong  setTreeMap: ");
         System.out.println("setTreeMap");
        // TODO code application logic here
    }
    
}

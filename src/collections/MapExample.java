package collections;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Bob", 900);
        salaryMap.put("John", 920);
        salaryMap.put("John", 1000);
        System.out.println(salaryMap);

        //Get value from key
        System.out.println("John`s salary: "+ salaryMap.get("John"));
        System.out.println(salaryMap.keySet());
        System.out.println(salaryMap.size());
        System.out.println(salaryMap.containsValue(920));
        salaryMap.remove("Bob");

        //Example
        Map<String, String> capitalCity = new HashMap<>();
             capitalCity.put("Estonia", "Tallin");
             capitalCity.put("Finland", "Helsinki");
             capitalCity.put("Latvia", "Riga");
        System.out.println(capitalCity.get("Finland"));
        /*  for(String s: capitalCity.keySet()) {
              System.out.println(capitalCity.get(s));
          } */

          for(Map.Entry<String, String> entry: capitalCity.entrySet()) {
              System.out.println(entry.getKey() + " has a capital city of " + entry.getValue());
          }
    }
}

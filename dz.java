package homework;

import java.util.HashMap;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;

public class dz {
    /*Задание
  
    Выполнил Королёв Александр. Факультет Java-разработка. 

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
 Вывод должен быть отсортирован по убыванию числа телефонов.
 */

    
    
        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }

        public static void printBook(Map<String, ArrayList<Integer>> map){
            for (var item : map.entrySet()) {
                String phones = " ";
                for(int el: item.getValue()){
                    phones = phones + el + " ";
                }
                System.out.printf("%s: %s \n", item.getKey(), phones);
            }
        }
        public static void main(String[] args) {
            Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
            addNumber("Ivanov", 123, bookPhone);
            addNumber("Ivanov", 1234, bookPhone);
            addNumber("Petrov", 546585, bookPhone);
            addNumber("Sidorov", 8956477, bookPhone);
            addNumber("Ivanov", 12356233, bookPhone);
            addNumber("Petrov", 787897, bookPhone);
            printBook(bookPhone);
           }
    }

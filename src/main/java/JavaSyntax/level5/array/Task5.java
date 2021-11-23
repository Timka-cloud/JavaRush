package JavaSyntax.level5.array;

import java.util.*;

public class Task5 {
    /**
     * Считать 6 строк и заполнить ими массив strings.
     * Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
     * Примеры.
     *
     * Массив после чтения строк:
     * {"Hello", "Hello", "World", "Java", "Tasks", "World"}
     * Массив после удаления повторяющихся строк:
     * {null, null, null, "Java", "Tasks", null}
     */
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }

//        for (int i = 0; i < strings.length; i++) { //another variant
//            String currentString = strings[i];
//            for (int j = i + 1; j < strings.length; j++) {
//                if (currentString == null) {
//                    break;
//                }
//                if (currentString.equals(strings[j])) {
//                    strings[j] = null;
//                    strings[i] = null;
//                }
//            }
//        }

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if(map.containsKey(strings[i])){
               list.add(strings[i]);
                map.put(strings[i],map.get(strings[i]) + 1);
            } else {
                map.put(strings[i],1);
            }

        }
        System.out.println(map);
        System.out.println(list);
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(strings[i].equals(list.get(j))){
                    strings[i] = null;
                    break;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

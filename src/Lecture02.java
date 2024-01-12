import java.util.*;
class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?
        // An ArrayList is a dynamic array that allows the modification of it's size. You would use an ArrayList
        // to contain information that is constantly changing, for example, daily attendance for a class.
        // An Array would be more useful in storing the number of students enrolled in the class for the quarter.
        // ArrayLists have much more overhead in terms of performance and memory usage because of their dynamic nature,
        // Resulting in Arrays being noticeably faster.

        // Put your answer for #3 here:
        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?
        ArrayList<String> poem = new ArrayList<>(5);
        poem.add("It");
        poem.add("was");
        poem.add("a");
        poem.add("stormy");
        poem.add("night");

        poem.forEach(word -> System.out.print(word + " "));
        System.out.println();
        // The initial capacity of the ArrayList is 5 and the type is String.

        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]
        poem.add(3, "dark");
        poem.add(4, "and");
        poem.forEach(word -> System.out.print(word + " "));
        System.out.println();

        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]
        poem.set(1, "IS");
        poem.forEach(word -> System.out.print(word + " "));
        System.out.println();

        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.
        ArrayList<Integer> multiplesOf2 = new ArrayList<>(10);
        for (int i = 0; i < 10; i ++) {
                multiplesOf2.add(i * 2);
        }
        for (int i = 0; i < multiplesOf2.size(); i++) {
            System.out.print(multiplesOf2.get(i) + " ");
        }
        System.out.println();

        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Was", "IS", "Where", "Why", "When"));

        if (words.contains("IS")) {
            System.out.println("This list Contains \"IS\" ");
        } else {
            System.out.println("This list Does not contain \"IS\" ");
        }
        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.

        // A wrapper class allows you to encapsulate primitive data types, such as char, int, double, and boolean,
        // as objects.
        // int is a primitive data type that stores a number but cannot be used in an object setting.
        // Integer is the wrapper class for int that allows its use in ArrayList and other object use cases.

        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.

        // The code that follows does not compile because the ArrayList is initialized utilizing a primitive data type.
        // For this code to work, we need to utilize the wrapper class, 'Integer', to encapsulate the primitive data type 'int'.

        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // A. [2, 6, 1, 8]
        // B. [30, 20, 10, 60, 50, 40]
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-4, 16, 9, 1, 64, 25, 36, 4, 49));
        mystery1(list);
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        // A. 1 2 6 8
        // B. 10 30 40 20 60 50
        // C. -4 1 25 4 16 9 64 36 49
    }
    public static void mystery1(ArrayList<Integer> list) {

        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i - 1)) {
                int element = list.get(i);
                list.remove(i);
                list.add(0, element);
            }
        }
    }

}

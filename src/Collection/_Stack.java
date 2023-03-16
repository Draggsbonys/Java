package Collection;

import java.util.Stack;

/*
 Stack - это класс в Java, который представляет стек, т.е. коллекцию элементов,
 которые добавляются и удаляются в соответствии с принципом "последний вошел - первый вышел" (LIFO - last-in, first-out).
*/
public class _Stack {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        // Метод push() - добавляет элемент вверх списка
        stringStack.push("Pit");
        stringStack.push("Loly");
        stringStack.push("Bob");
        stringStack.push("Drake");
        // Метод peek() - находит последний элемент списка
        System.out.println(stringStack.peek());
        while (!stringStack.isEmpty()){
            //  Метод pop() - находит и удаляет последний элемент списка
            stringStack.pop();
            System.out.println(stringStack);
        }
    }

}

package Tree;
public class Main {
    public static void main(String[] args) {
        // Создаем бинарное дерево
        Tree root =
                new Tree (3,
                        new Tree (9),
                        new Tree (20,
                                new Tree (15),
                                new Tree (7)));

        System.out.println("Максимальная глубина дерева: " + root.maxDepth(root));
        System.out.println("Минимальная глубина дерева: " + root.minDepth(root));
    }
}

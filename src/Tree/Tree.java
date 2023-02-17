package Tree;

public class Tree {
    int value;
    Tree left;
    Tree right;
    public Tree (){

    }
    public Tree (int value) {
        this.value = value;
    }
    public Tree (int value, Tree left, Tree right) {
        this.value = value;
        this.right = right;
        this.left = left;
    }
    // Функция нахождения максимальной глубины дерева рекурсивным методом
    public int maxDepth(Tree root) {
        // Если корень дерева пуст, возвращаем 0, потому что пустое дерево не имеет глубины
        if (root == null) {
            return 0;
        } else {
            // Накапливаем в переменную типа int все узлы ветки left
            int leftDepth = maxDepth(root.left);
            // Накапливаем в переменную типа int все узлы ветки right
            int rightDepth = maxDepth(root.right);
            // Сравниваем две переменные между собой и возвращаем максимальное значение +1 за корневой узел
            return Math.max(leftDepth, rightDepth)+1;
        }
    }
    // Функция нахождения минимальной глубины дерева рекурсивным методом
    public int minDepth(Tree root) {
        // Если корень дерева пуст, возвращаем 0, потому что пустое дерево не имеет глубины
        if (root == null) {
            return 0;
          // Если ветка left равна null возвращаем всю длину ветки right +1 за корневой узел
        } else if (root.left == null) {
            return minDepth(root.right)+1;
          // Если ветка right равна null возвращаем всю длину ветки left +1 за корневой узел
        } else if (root.right == null) {
            return minDepth(root.left)+1;
        } else {
            // Накапливаем в переменную типа int все узлы ветки left
            int leftDepth = minDepth(root.left);
            // Накапливаем в переменную типа int все узлы ветки right
            int rightDepth = minDepth(root.right);
            // Сравниваем две переменные между собой и возвращаем минимальное значение +1 за корневой узел
            return Math.min(leftDepth, rightDepth)+1;
        }
    }
}

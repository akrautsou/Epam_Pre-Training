package by.epam.preTraining.krautsou.tasks.task7.code.customBinaryTree;

public class BinaryTree<E extends Comparable<E>> implements Cloneable {
    private TreeNode<E> root;
    private int size = 0;

    public BinaryTree() {
    }

    public BinaryTree(E[] objects) {
        for (E object : objects) add(object);
    }

    public boolean contains(E e) {
        TreeNode<E> current = root;

        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else
                return true;
        }

        return false;
    }

    public void add(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null)
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return;
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }

        size++;
    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    public StringBuilder output() {
        return inorder(root, new StringBuilder());
    }

    private StringBuilder inorder(TreeNode<E> root, StringBuilder result) {
        if (root != null) {
            inorder(root.left, result);
            result.append(root.element).append(" ");
            inorder(root.right, result);
        }
        return result;
    }

    public StringBuilder postorder() {
        return postorder(root, new StringBuilder());
    }

    private StringBuilder postorder(TreeNode<E> root, StringBuilder result) {
        if (root != null) {
            inorder(root.left, result);
            inorder(root.right, result);
            result.append(root.element).append(" ");
        }
        return result;
    }

    public StringBuilder preorder() {
        return preorder(root, new StringBuilder());
    }

    private StringBuilder preorder(TreeNode<E> root, StringBuilder result) {
        if (root != null) {
            result.append(root.element).append(" ");
            inorder(root.left, result);
            inorder(root.right, result);
        }
        return result;
    }

    public static class TreeNode<E extends Comparable<E>> {
        public E element;
        public TreeNode<E> left;
        public TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }

    public int size() {
        return size;
    }

    public void remove(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else
                break;
        }

        if (current == null)
            return;
        if (current.left == null) {

            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        } else {
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            current.element = rightMost.element;

            if (parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else
                parentOfRightMost.left = rightMost.left;
        }

        size--;
    }

    public void clear() {
        root = null;
        size = 0;
    }

}
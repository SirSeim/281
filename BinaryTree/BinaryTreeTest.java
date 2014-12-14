public class BinaryTreeTest {
    public static void main (String[] args) {
        if (args.length > 1) {
            if (args[0].equals("1")) {
                BinaryTree tree = new BinaryTree(args[1]);
                for (int i = 2; i < args.length; i++) {
                    tree.add(args[i]);
                }

                for (Object str : tree) {
                    System.out.println(str);
                }
                System.out.println("Contains \'Defeat\': " + tree.contains("Defeat"));


            } else if (args[0].equals("2")) {
                BinaryTree tree1 = new BinaryTree();
                BinaryTree tree2 = new BinaryTree();
                boolean second = false;
                String root = args[1];
                for (int i = 2; i < args.length; i++) {
                    if (args[i].equals("split")) {
                        second = true;
                    } else if (second) {
                        tree2.add(args[i]);
                    } else {
                        tree1.add(args[i]);
                    }
                }

                BinaryTree tree = BinaryTree.createFromData(root, tree1, tree2);

                for (Object str : tree) {
                    System.out.println(str);
                }
                System.out.println("Contains \'Defeat\': " + tree.contains("Defeat"));
            }
        }
    }
}
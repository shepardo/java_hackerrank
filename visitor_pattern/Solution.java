import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;
    public int getResult() {
      	//The SumInLeavesVisitor implementation must return the sum of the values in the tree's leaves only.
        return sum;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
          sum += leaf.getValue();
    }
}

// The ProductRedNodesVisitor implementation must return the product of values stored in all red nodes, including leaves, computed modulo . Note that the product of zero values is equal to . 
class ProductOfRedNodesVisitor extends TreeVis {
    private int product = 1;
    public int getResult() {
        if (product == 0) {
            return 1;
        } else {
            return product % (1000000000 + 7);
        }
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == RED) {
            product *= node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == RED) {
          product *= leaf.getValue();
        }
    }
}

// The FancyVisitor implementation must return the absolute difference between the sum of values stored in the tree's non-leaf nodes at even depth and the sum of values stored in the tree's green leaf nodes. Recall that zero is an even number.
class FancyVisitor extends TreeVis {
    int sum_nodes_even = 0;
    int sum_green_leafs = 0;
    public int getResult() {
      	//implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
    	//implement this
        if (node.getDepth() % 2 == 0) {
            sum_nodes_even += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
    	if (leaf.getColor() == GREEN) {
            sum_green_leafs += leaf.getValue();
        }
    }
}

public class Solution {
  
    /*
    0 -> red, 1 -> green
    Sample input
    5
    4 7 2 5 12
    0 1 0 0 1
    1 2
    1 3
    3 4
    3 5
    */
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        private ArrayList<Integer> values = new ArrayList<>();
        private ArrayList<Integer> colors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
         int total_nodes = scan.nextInt();
         int i = total_nodes;
         while (i > 0) {
             values.add(scan.nextInt());
             i--;
         }
         i = total_nodes;
         while (i > 0) {
             colors.add(scan.nextInt());
             i--;
         }
    }


    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}

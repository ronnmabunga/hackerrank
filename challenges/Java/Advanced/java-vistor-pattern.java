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
    private int result = 0;
    public int getResult() {
      	return result;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int MODDER = 1000000007;
    public int getResult() {
        return (int) result;
    }

    public void visitNode(TreeNode node) {
      	//implement this
        if(node.getColor().equals(Color.RED))
            result = ( result * node.getValue() ) % MODDER;
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        if(leaf.getColor().equals(Color.RED))
            result = ( result * leaf.getValue() ) % MODDER;
    }
}

class FancyVisitor extends TreeVis {
    int evenDepthNodes = 0;
    int greenLeaves = 0;
    public int getResult() {
      	//implement this
        return Math.abs(evenDepthNodes - greenLeaves);
    }

    public void visitNode(TreeNode node) {
    	//implement this
        if(node.getDepth()%2==0)
            evenDepthNodes += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
        if(leaf.getColor().equals(Color.GREEN))
            greenLeaves += leaf.getValue();
    }
}

public class Solution {
    static Integer [] c;
    static Integer [] x;
    static HashMap<Integer, HashSet<Integer>> map;
    public static Tree solve(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Integer n = Integer.parseInt(br.readLine());
            x = new Integer[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i ++){
                x[i] = Integer.parseInt(st.nextToken());
            }
            c = new Integer[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i ++){
                c[i] = Integer.parseInt(st.nextToken());
            }
            
            if(n==1)
                return new TreeLeaf(x[0],(c[0]==0?Color.RED:Color.GREEN),0);
            
            map = new HashMap();
            Integer u; Integer v;
            HashSet<Integer> temp;
            for(int i = 0; i < n-1; i ++){
                st = new StringTokenizer(br.readLine());
                u = Integer.parseInt(st.nextToken()) - 1;
                v = Integer.parseInt(st.nextToken()) - 1;
                if(!map.containsKey(u)){
                    temp = new HashSet();
                    temp.add(v);
                    map.put(u,temp);
                }else{
                    temp = map.get(u);
                    temp.add(v);
                    map.put(u,temp);
                }
                if(!map.containsKey(v)){
                    temp = new HashSet();
                    temp.add(u);
                    map.put(v,temp);
                }else{
                    temp = map.get(v);
                    temp.add(u);
                    map.put(v,temp);
                }
            }
            br.close();

            Tree root = new TreeNode( x[0], (c[0]==0?Color.RED:Color.GREEN), 0);
            createNodes(0,(TreeNode)root);
            
            return root;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
            return new TreeLeaf(0,(0==0?Color.RED:Color.GREEN),0);
        }
        //read the tree from STDIN and return its root as a return value of this function
    }

    static void createNodes(int index, TreeNode parent){
        HashSet<Integer> childs = map.get(index);
        HashSet<Integer> temp;
        for(Integer child:childs){
            if(map.get(child).size()==1){
                parent.addChild(new TreeLeaf(x[child],(c[child]==0?Color.RED:Color.GREEN),parent.getDepth()+1));
                temp = map.get(child);
                temp.remove(index);
                map.put(child,temp);
            }
            else{
                TreeNode childNode = new TreeNode(x[child],(c[child]==0?Color.RED:Color.GREEN),parent.getDepth()+1);
                parent.addChild(childNode);
                temp = map.get(child);
                temp.remove(index);
                map.put(child,temp);
                createNodes(child, childNode);
            }
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
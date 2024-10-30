import java.util.*;
class Solution{
    static LinkedList<Character>stack;
	public static void main(String []argh)
	{
        stack = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            stack.clear();
            char [] chs = input.toCharArray();
            solve(chs);  
		}
	}
    static void solve(char [] chs){
        for(char c:chs){
                //System.out.println("c:"+c);
                try{
                    if(c=='}'){
                        if(stack.peekFirst()=='{')
                            stack.pop();
                        else{
                            System.out.println("false");
                            return;
                        }
                    }else if(c==')'){
                        if(stack.peekFirst()=='(')
                            stack.pop();
                        else{
                            System.out.println("false");
                            return;
                        }
                    }else if(c==']'){
                        if(stack.peekFirst()=='[')
                            stack.pop();
                        else{
                            System.out.println("false");
                            return;
                        }
                    }else{
                        stack.push((Character)c);
                    }
                }catch(Exception e){
                    System.out.println("false");
                    return;
                }
                //System.out.println("stack"+stack);
            }
            if(stack.size()==0)
                    System.out.println("true");
                else
                    System.out.println("false");
    }
}




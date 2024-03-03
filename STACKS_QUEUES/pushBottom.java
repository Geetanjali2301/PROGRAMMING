import java.util.*;
public class pushBottom {

    public static void pushBottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.add(data);
            return;
        }
        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       

        pushBottom(s,4);
        
        
        for(int i=0;i<s.size();i++)
        {
            System.out.print(s.get(i)+" ");

        }

    }
    
}

import java.util.*;
import java.io.*;
//Dijkstra's Algorithm is used in calculating arithmetic expression
//It uses Two stack method.
//First Stack is Number stack while second stack is operator stack.
public class DijkstaAlgo
{
    public static void main(String args[])
    {
        Stack<String> op=new Stack<String>();
        Stack<Double> val=new Stack<Double>();

        String S="(1+((2+3)*(4*5)))";
        
        for(int i=0;i<S.length();i++)
        {
            String s=Character.toString(S.charAt(i));
            if(s.equals("("));
            else if(s.equals("+"))
                op.push("+");

            else if(s.equals("-"))
                op.push("-");

            else if(s.equals("*"))
                op.push("*");

            else if(s.equals(")"))
            {
                String oper=op.pop();
                if(oper.equals("+"))
                    val.push(val.pop()+val.pop());
                else if(oper.equals("-"))
                    val.push(val.pop()-val.pop());
                else
                    val.push(val.pop()*val.pop());

            }
            else
                val.push(Double.parseDouble(s));
        }

        System.out.println(val.pop());
            
        }
 }

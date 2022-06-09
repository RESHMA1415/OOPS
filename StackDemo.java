import java.util.*;
public class StackDemo
{
public static void main(String args[])
{
Stack<String>stack= new Stack<String>();
stack.add("Geeks");
stack.add("for");
stack.add("Geeks");
stack.add("10");
stack.add("20");
System.out.println("stack:"+stack);
String rem_ele=stack.remove(4);
System.out.println("Removed element:"+rem_ele);
System.out.println("Final stack:"+stack);
}
}

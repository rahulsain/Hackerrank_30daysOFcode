import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
  LinkedList s=new LinkedList();


    LinkedList q= new LinkedList();

void pushCharacter(char c)
{
    s.push(c);

}

char popCharacter()
{   

   return (char)s.pop();

}


void enqueueCharacter(char c)
{
    q.add(c);
}

char dequeueCharacter()
{
    
    return (char)q.remove();
}



    

    public static void main(String[] args) {
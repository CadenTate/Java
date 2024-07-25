import java.util.ArrayList;
class Recursion
{
   public static void main(String[] args)
   {
       ArrayList<Character> myArrayList = new ArrayList<Character>();
       myArrayList.add('A');
       myArrayList.add('B');
       myArrayList.add('C');
       myArrayList.add('D');

       mystery(myArrayList,myArrayList.size()-1);
   }
   private static void mystery(ArrayList<Character> data, int index)
   {
       if (index < 0)
       {
           return;  
       }
       System.out.print(data.get(index));
       mystery(data,index-1);
   }
}
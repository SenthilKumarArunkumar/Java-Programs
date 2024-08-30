import java.util.*;
class HelloWorld {
    public static void main(String[] args) {char arr[][]=new char[100][100];
    
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=obj1.nextLine();
        char[] arr1=word.toCharArray();
        for(int i=0;i<arr1.length;i++)
            {arr[i][i]=arr1[i];}
           
       for(int i=0;i<arr1.length;i++)
        {for(int j=arr1.length-1;j>=0;j--)
         {if(i+j==arr1.length-1)
          {
            arr[i][j]=arr1[i];
          }
         }
        }
        for(int i=0;i<arr1.length;i++)
       {for(int j=0;j<arr1.length;j++)
         { System.out.print(arr[i][j]);
         }
         System.out.println();
        }
        obj1.close();
    }
}
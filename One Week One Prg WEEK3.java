import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of words: ");
        int no=obj.nextInt();
        int asciino;
        int arr[]=new int[no];
        for(int i=0;i<no;i++)
        {
         System.out.println("Enter the word ");
         String word=obj.nextLine();
         word=word.toLowerCase();
         char ch=word.charAt(0);
         asciino=(int)ch;
         arr[i]=asciino;
         }
    for(int i=0;i<no;i++)
        {for(int j=0;j<no;j++)
         {if(arr[j]>arr[i])
            arr[i]=arr[j];
         }
        }
        System.out.println(arr);
        obj.close();
    }
}
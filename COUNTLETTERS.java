import java.util.*;
public class COUNTLETTERS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String A=in.nextLine();
        int n=A.length(),counter=0;;
        char ch1,chr=' ';
        String str="";
        char arr[]=new char[n];
        char arr2[]=new char[n];
        int count[]=new int[n];
        for(int i=0;i<n;i++)
        {
           char ch=A.charAt(i);
           arr[i]=ch;  
        }
        for(int i=0;i<n;i++)
        {
        if(arr[i]=='@')
        continue;
        else
        arr2[counter]=arr[i];
        count[counter] = 1; 
        for(int j=i+1;j<n;j++)
        {
          if(arr[i]==arr[j])
           {
            count[counter]=count[counter]+1;
            arr[j]='@';
          }
        }
        counter++;
        }
        for(int i=0;i<counter;i++)
        {
                    System.out.print(arr2[i]);
                    System.out.println("---->"+count[i]);
        }
    }
}
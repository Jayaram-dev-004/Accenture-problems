import java.util.Scanner;

public class MissingChar {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if(isPanagram(str))
            System.out.println(" Panagram");
        
        else
            System.out.println(" Not Panagram");
    
        sc.close();
    }
    
    
    public static boolean isPanagram(String str){
        int[] map = new int[26];

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c ==' ') continue;

            map[c - 'a']++;
        }
        boolean status = false;
        for(int i = 0; i < 26; i++){

            if(map[i] == 0){
                System.out.print((char)(i + 'a') + ", ");
                status = true;
            }
        }
        return (status) ? false : true;
    }
}

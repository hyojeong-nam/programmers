import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] a_list = a.split("");
        
        for(int i = 0; i<a_list.length;i++){
            System.out.println(a_list[i]);
        }

    }
}
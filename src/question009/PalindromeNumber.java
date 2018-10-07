package question009;

import java.util.Scanner;

/**
 * PalindromeNumber
 *
 * @author Zoey
 * @date 2018/10/08 07:08
 * @email 571002217@qq.com
 * @description Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(PalindromeNumber.isPalindrome(scanner.nextInt()));
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        //将数字倒序
        int resumeNum=0;
        int xCopy=x;
        while(xCopy>0){
            int temp=xCopy%10;
            resumeNum=resumeNum*10+temp;
            xCopy=xCopy/10;
        }
        return resumeNum==x;
    }
}

/*
小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯
把任何一串拆散了卖。于是小红要你帮忙判断一下，某串珠子里是否包含了全部自己想要
的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。

为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。例如，YrR8RrY是小红想做的珠串；
那么ppRYYGrrYBR2258可以买，因为包含了全部她想要的珠子，还多了8颗不需要的珠子；
ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗红色的珠子。

输入描述:
每个输入包含1个测试用例。每个测试用例分别在2行中先后给出摊主的珠串和小红想做的珠串，
两串都不超过1000个珠子。

输出描述:
如果可以买，则在一行中输出“Yes”以及有多少多余的珠子；如果不可以买，则在一行中输出“No”
以及缺了多少珠子。其间以1个空格分隔。
示例1
输入

ppRYYGrrYBR2258
YrR8RrY
输出

Yes 8
*/
package bishi0613;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int len = s2.length();
            int[] nums = new int[len];
            for(int i = 0;i<s1.length();i++){
                for(int j = 0;j<len;j++){
                    if(s1.charAt(i) == s2.charAt(j) && nums[j] == 0){
                        nums[j] = 1;
                        break;
                    }
                }
            }
            int count = 0;
            for(int i = 0;i<len;i++){
                if(nums[i] == 1){
                    count ++;
                }
            }
            if(count == len){
                System.out.print("Yes"+" ");
                System.out.print(s1.length()-len );
                return;
            }
            System.out.print("No"+" ");
            System.out.print(len -count );

        }
    }
}

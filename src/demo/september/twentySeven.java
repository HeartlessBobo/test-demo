package demo.september;

import java.io.*;
import java.util.*;

public class twentySeven {

    /* public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(2932));
    }

    public static int smallestEvenMultiple(int num) {
        String str = Integer.toString(num);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < 4; i++) {
            String s1 = str.substring(0, i);
            String s2 = str.substring(i, 4);
            map.put(Integer.parseInt(s1), Integer.parseInt(s2));
        }

        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();

        for (int i = 1; i < 4; i++) {
            String s1 = reverse.substring(0, i);
            String s2 = reverse.substring(i, 4);
            map.put(Integer.parseInt(s1), Integer.parseInt(s2));
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getKey() + entry.getValue());
        }
        return list.stream().min(Integer::compareTo).orElse(null);
    }*/

    /*public static int minimumSum(int num) {

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        return (arr[0]*10+arr[3])+arr[1]*10+arr[2];
    }*/

    /*public static int countDigits(Integer num) {
        if (num == 0)
            return 1;
        int abs = Math.abs(num);
        int digits = (int) Math.log10(abs) + 1;
        int sum = 0;
        int nums = num;
        for (int i = 0; i < digits; i++) {

            int a = nums % 10;
            if (num % a == 0) {
                sum++;
            }
            nums /= 10;
        }

        return sum;
    }*/

    /* public static int numberOfMatches(int num) {
        if (num % 2 == 0) {
            int num1 = num / 2;
            System.out.println("配对次数为" + num1 + "次，" + "有" + num1 + "支队伍晋级");
            return num1;
        } else {
            int num1 = num / 2;  //   7/23
            System.out.println("配对次数为" + num1 + "次，" + "有" + (num1 + 1) + "支队伍晋级");
            return num1;
        }
    }*/

    /* public static int numberOfMatches(int n) {
        //  n为队伍晋级数
        int ans = 0;  //配对次数
        while (n > 1) {
            if (n % 2 == 0) {
                ans += n / 2;
                n = n / 2;
            } else {
                ans += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return ans;
    }
*/


    /*public static int aa(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10; 
            num = num / 10;
        }
        Arrays.sort(arr);
        return (arr[0]*10+arr[3])+(arr[1]*10+arr[2]);
    }*/


//    public static void main(String[] args) throws IOException {

    /*Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            FileInputStream i1 = null;
            try {
                i1 = new FileInputStream("D:\\a.txt");
                byte[] bytes = new byte[1];
                while ((i1.read(bytes)) != -1) {
                    System.out.println(new String(bytes));
                    Thread.sleep(500);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    });


    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            FileInputStream i1 = null;
            try {
                i1 = new FileInputStream("D:\\b.txt");
                byte[] bytes = new byte[1];
                while ((i1.read(bytes)) != -1) {
                    System.out.println(new String(bytes));
                    Thread.sleep(500);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    });

    t1.start();
    t2.start();


*/
   /* public static void main(String[] args) throws IOException {
        //给你一组字符串如:7i8hy4jjnb2.让你编程输出里面的数字:7842(5分)
        String str = "7i8hy4jjnb2";
        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            if (aByte >=48 && aByte<=57){
                char c=(char)aByte;
                System.out.println(Character.getNumericValue(c));
            }
        }

    }*/
}

//}


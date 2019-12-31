/**
 * @author : forlxh
 * @date : 20:53 2019/12/31
 */
public class StringTest {
    public static void main(String[] args) {
        String hello = "hello world!";
        String hello1 = new String("hello world!");
        System.out.println(hello == hello1); //1
         String hello2="hello world!";
         System.out.println(hello==hello2); //2
         String append="hello"+" world!";
         System.out.println(hello==append); //3
         final String pig = "length: 10";
         final String dog = "length: " + pig.length();
         System.out.println(pig==dog); //4
         final String dog1 = ("length: " + pig.length()).intern();
         System.out.println(pig==dog1); //5
         System.out. println("Animals are equal: "+ pig == dog);//6
    }
}

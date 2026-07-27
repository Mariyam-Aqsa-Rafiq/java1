package Strings;

public class Intro {
    //Mutable string- StringBuilder,StringBuffer
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Java");
        System.out.println(s);
        StringBuffer s1=new StringBuffer("Python");
        System.out.println(s1);
        s1.append(" Language");
        System.out.println(s1);
        s1.insert(7,"is a ");
        System.out.println(s1);
        s1.replace(0,6," Java");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.delete(2,5);
        System.out.println(s1);

        String s2="NSAM";
        String s3="NSAM";
        System.out.println(s2==s3);

        String s4=new String("NSAM");
        String s5=new String("NSAM");
        System.out.println(s4==s5);

        String p="abcdefgh";
        char a[]=new char[10];
        for(char ch:p.toCharArray())
        {
            System.out.println(ch);
        }
    }
}

package foot;

public class StrBuilder {
    public static void main(String[] args) {
      /*  StringBuilder str =new StringBuilder("Hello");
        System.out.println(str.insert(0,"A"));
        System.out.println(str.insert(4,"A"));
        System.out.println(str.append('a'));
        System.out.println(str.append("Azerii"));
        System.out.println(str.reverse());
        System.out.println(str.charAt(1));*/
        StringBuilder str1=new StringBuilder("Azerii");
        System.out.println(str1.deleteCharAt(4));
        System.out.println(str1.reverse());
        String sz="Hello";
        StringBuilder as=new StringBuilder(sz);
        System.out.println(as.reverse());


    }
}

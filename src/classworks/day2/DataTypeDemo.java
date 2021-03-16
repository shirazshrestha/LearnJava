package classworks.day2;

public class DataTypeDemo {

    public static void main(String[] args) {

        byte b1 = 127; //max range
        byte b2 = -128; //min range

        System.out.println("-----------Byte------------");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);

        System.out.println("-----------Short------------");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);

        System.out.println("-----------Int------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        System.out.println("-----------Long------------");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Long.BYTES);

        System.out.println("-----------Float------------");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.SIZE);
        System.out.println(Float.BYTES);

        System.out.println("-----------Double------------");
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.SIZE);
        System.out.println(Double.BYTES);

        System.out.println("-----------Character------------");
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.SIZE);
        System.out.println(Character.BYTES);

        char c1 = 65535; //max range
        char c2 = 0; //min range
     }
}
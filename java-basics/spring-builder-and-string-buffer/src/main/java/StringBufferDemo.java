public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dinindu");
        sb.append(" Lokugamage");
        sb.setCharAt(7, ' ');
        /*String Builder class is not thread safe since its' performance better than the String Buffer class.
        * String Buffer class is thread safe*/

        System.out.println(sb.toString());

        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("Sandepani");

        System.out.println(sBuffer.toString());

    }
}

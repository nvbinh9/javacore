public interface Animal {
    default String Gra() {
        return "test";
    }
    static String Gre() {
        return "static method in java 8";
    }
}

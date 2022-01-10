public interface Animal {
    default String Gra() {
        return "test";
    }

    static String Gre(){
        return "checkout commit";
    }
}

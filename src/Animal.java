import java.util.stream.BaseStream;

public interface Animal extends BaseStream {
    default String Gra() {
        return "test";
    }

    static String Gre(){
        return "checkout commit";
    }
}

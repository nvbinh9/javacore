public class Developer {
    public void read() {
        System.out.println("Developer");
    }
}

class JavaDeveloper extends Developer {
    public void read() {
        System.out.println("Java Developer");
    }
}

class JavascriptDeveloper extends Developer {
    public void read() {
        System.out.println("Javascript Developer");
    }
}

class Entry {
    public static void main(String [] args) {
        Developer developer = new Developer();
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        JavascriptDeveloper javascriptDeveloper = new JavascriptDeveloper();
        test(developer);
        test(javaDeveloper);
        test(javascriptDeveloper);

        Developer developer1 = new Developer();
        Developer developer2 = new JavaDeveloper();
        Developer developer3 = new JavascriptDeveloper();
        test(developer1);
        test(developer2);
        test(developer3);
    }

    public static void test(Developer dev) {
        dev.read();
    }
}
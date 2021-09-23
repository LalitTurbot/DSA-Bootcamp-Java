public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World".length());
        // System.out.println(args);
        System.out.println(args.length);
        if (args.length >= 1) {
            System.out.println(args[0]);
        }

    }
}

// javac Main.java
// java Main lalit
// Hello World
// 11
// 1
// lalit

// javac -d "Path to store .class file(i.e compiled byte code)"
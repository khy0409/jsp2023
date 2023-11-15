package test;

import java.util.Properties;

public class Env {

        public static void main(String[] args) {
                printEnv();
                System.out.println(System.getProperty("user.dir"));
                System.out.println(System.getProperty("sonar.token"));
                System.out.println("---");
        }

        public static void printEnv() {
                Properties properties = System.getProperties();
                for (String key : properties.stringPropertyNames()) {
                        String value = properties.getProperty(key, "");
                        System.out.println(key + ": " + value);
                }
        }

}

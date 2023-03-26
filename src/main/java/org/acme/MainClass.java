package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class MainClass {

    public static void main(String[] args) {
        try {
            Quarkus.run(args);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

package dev.oviedo.driver;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class AppDriver {

    public static void main(String[] args){

        //bringing Javalin app to life:

        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.addStaticFiles("/public", Location.CLASSPATH);
            //config.enableDevLogging();
        }).start(8080);
    }
}

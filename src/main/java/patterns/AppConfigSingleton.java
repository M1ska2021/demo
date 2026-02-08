package org.example.cartoonapi.patterns;

public class AppConfigSingleton {

    private static AppConfigSingleton instance;

    private AppConfigSingleton() {}

    public static synchronized AppConfigSingleton getInstance() {
        if (instance == null) {
            instance = new AppConfigSingleton();
        }
        return instance;
    }

    public String getAppName() {
        return "Cartoon REST API";
    }
}

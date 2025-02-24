package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:properties/${environment}.properties",
        "classpath:properties/local.properties",
})

public interface WebDriverConfig extends Config {

    @Key("browser.name")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("browser.windowSize")
    @DefaultValue("1920x1080")
    String getBrowserWindowSize();

    @Key("browser.isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remote.user")
    String getRemoteUser();

    @Key("remote.password")
    String getRemotePassword();

    @Key("remote.url")
    @DefaultValue("selenoid.autotests.cloud")
    String getRemoteUrl();
}

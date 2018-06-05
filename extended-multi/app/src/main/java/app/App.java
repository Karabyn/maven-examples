package app;

import config.ConfigService;
import org.apache.commons.lang3.StringUtils;
import util.Util;

public class App {

    public String greet(String name) {
        StringUtils.trim("dummy");
        return Util.join("Hello ", name);
    }

    public boolean store(String name) {
        ConfigService cs = new ConfigService();
        cs.getConfig("datastore");
        return true;
    }
}

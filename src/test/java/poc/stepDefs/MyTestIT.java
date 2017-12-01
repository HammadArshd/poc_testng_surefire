package poc.stepDefs;

import org.testng.annotations.Test;

public class MyTestIT {

    @Test
    public void pytr(){
        System.out.println("Running from Simplest Skeleton : pytr");
        System.out.println("Plugin Name: " + System.getProperty("PluginName"));
    }
}

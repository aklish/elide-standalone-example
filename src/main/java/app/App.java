package app;

import com.yahoo.elide.standalone.ElideStandalone;
import com.yahoo.elide.standalone.config.ElideStandaloneSettings;

public class App {
    public static void main(String[] args) throws Exception {
        ElideStandalone elide = new ElideStandalone(new ElideStandaloneSettings() {
            public String getModelPackageName() {

                    //This needs to be changed to the package where your models live.
                    return "models";
            }

        });

        elide.start();
    }
}

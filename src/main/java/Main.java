import org.apache.log4j.Logger;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.get;
import static spark.Spark.post;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String args[]) {

        get("/", (request, response) -> {
            return new ModelAndView(null, "root.ftl");
        }, new FreeMarkerEngine());

        post("/", ((request, response) -> {
            LOG.info("------> " + request.body());

            return new ModelAndView(null, "root.ftl");
        }), new FreeMarkerEngine());

    }
}

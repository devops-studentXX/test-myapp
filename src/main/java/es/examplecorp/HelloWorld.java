package es.examplecorp;
import spark.servlet.SparkApplication;

import static spark.Spark.*;

public class HelloWorld implements SparkApplication {
    @Override
    public void init() {
        get("/",(req,res) -> "hello DevOps");
    }
}
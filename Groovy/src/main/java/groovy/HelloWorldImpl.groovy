package groovy

/**
 * Created by suye on 2017/1/16.
 */
class HelloWorldImpl implements HelloWorldService{

    void hello(String str) {
        println "Hello " + str;
    }
}

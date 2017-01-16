package groovy;

import groovy.service.HelloWorldService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by suye on 2017/1/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/conf/applicationContext.xml" })
public class GroovyTest {
    @Resource(name="helloWorld")
    private HelloWorldService helloWorldGroovy;


    @Test
    public void testGroovy(){
        helloWorldGroovy.hello("World!");

        Assert.assertTrue(true);
    }
}

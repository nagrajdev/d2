package n;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import  n.Main;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Main.class, webEnvironment=WebEnvironment.RANDOM_PORT)
public class MainTest {

    @Inject
    private TestRestTemplate testRestTemplate;

    @Test
    public void testHelloWorld() {
        ResponseEntity<String> actualResponse = testRestTemplate.getForEntity("/", String.class);
        assertThat(actualResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(actualResponse.getBody()).isEqualTo("Hello, world!");
    }

}

package n;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class MyController
{

    @GetMapping
    public String getGreeting()
    {
        return "Hello, world!";
    }

}

package pub.ron.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        RestTemplate restTemplate = new RestTemplate();
        return "success";
    }
}

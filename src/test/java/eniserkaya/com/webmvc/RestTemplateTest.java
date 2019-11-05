package eniserkaya.com.webmvc;

import org.junit.Test;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;


public class RestTemplateTest {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    public void getAllPosts(){
        RestTemplate restTemplate = new RestTemplate();

        URI uriComponentsBuilder = UriComponentsBuilder
                .fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();

        RequestEntity requestEntity = RequestEntity.get(uriComponentsBuilder).build();
        ResponseEntity<List> objects = restTemplate.exchange(requestEntity,List.class);
        System.out.print(objects.getBody().toString());
    }

    @Test
    public void makePost(){
        RestTemplate restTemplate = new RestTemplate();

        URI uriComponentsBuilder = UriComponentsBuilder
                .fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .queryParam("title","title ornek")
                .queryParam("body","body ornek")
                .queryParam("userId",1)
                .build()
                .toUri();

        RequestEntity requestEntity = RequestEntity.post(uriComponentsBuilder).build();
        ResponseEntity<Object> objects = restTemplate.exchange(requestEntity,Object.class);
        System.out.print(objects.getBody().toString());
    }
}

package in.aboutaakash.feignexample.repo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.aboutaakash.feignexample.dto.Post;

@FeignClient(value = "placeholder", url = "https://jsonplaceholder.typicode.com/")
public interface FeignClientRepository {
	
	 @RequestMapping(method = RequestMethod.GET, value = "/posts")
	    List<Post> getPosts();

}

package in.aboutaakash.feignexample.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aboutaakash.feignexample.dto.Post;
import in.aboutaakash.feignexample.repo.FeignClientRepository;

@RestController
@RequestMapping("/products")
public class FeignResource {
	
	@Autowired
	private FeignClientRepository feignClientRepository;
	
	 @GetMapping("/posts")
	    public List<Post> listProducts(){
	        return feignClientRepository.getPosts();
	    }

}

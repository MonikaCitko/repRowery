package Contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Rower;



@RestController
public class RowerController {
	
	private final RowerRepository rowerRepository;
	public RowerController(RowerRepository rowerRepository) {
		super();
		this.rowerRepository = rowerRepository;
	}

	
	@Autowired
	@GetMapping("/rowery")

	List<Rower> all() {
		  return rowerRepository.findAll();
	}

	

}

package Contollers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import Model.Rower;



	@Component
interface RowerRepository extends JpaRepository<Rower,Long>{

}

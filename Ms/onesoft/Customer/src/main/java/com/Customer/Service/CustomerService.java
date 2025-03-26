
package com.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Customer.Dao.CustomerDao;
import com.Customer.Entity.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao cd;
	
	@Autowired
	RestTemplate rt;
	
	public String postAll(List<Customer> a) {
		return cd.postAll(a);
	}

	public List<Customer> getAll() {
		return cd.getAll();
	}

	public String PostBranch(List<Customer> a) {
		String url= "http://localhost:8080/Bank/getbranchbyIFSC/";//get a branch using IFSC code
		a.forEach(x->{
			String ifsc = x.getIfsc_code();
			ResponseEntity<String> res = rt.exchange(url+ifsc, HttpMethod.GET,null,
					new ParameterizedTypeReference<String>() {});
			String branch = res.getBody();
			x.setBranch(branch);
		});
		return cd.PostBranch(a);
		
	}

	

}

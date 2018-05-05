package pl.coderslab.warsztaty6.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tweeter_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private boolean enabled;

	@NotEmpty
	@Email
	private String email;
	
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Tweet> tweets = new ArrayList<>();
	
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Comment> comments = new ArrayList<>();
	
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Message> messages = new ArrayList<>();
	
}

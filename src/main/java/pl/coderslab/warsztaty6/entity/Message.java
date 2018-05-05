package pl.coderslab.warsztaty6.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tweeter_message")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Size(max = 140)
	private String message;
	
	private boolean readed;
	
	@ManyToOne
	@NotEmpty
	private User sender;
	
	@ManyToOne
	@NotEmpty
	private User receiver;
	
}

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "tableBean")
@ViewScoped
public class TestBean {

	

	/**
	 * Constructor
	 */
	public TestBean() {

	}
	
	String text = "Hello";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
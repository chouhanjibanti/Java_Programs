package StreamApi;

import java.util.Optional;

public class OptionalClass {

	
	public static void main(String[] args) {
		
		String str = null;
//	    Optional<String> name = Optional.ofNullable(str);
	    
	    Optional<String> name = Optional.of("john");

//		Optional<String> name = Optional.empty();
	    
	    System.out.println("Name :"+name.get());	
	    
//	    if(name.isPresent()) {
//		    System.out.println("Name :"+name.get());
// 
//	    }else {
//		    System.out.println("value is not present");
//
//	    }
		
		String result = name.orElse("default name");
		System.out.println(result);
//	    
	    
	    
	}
}

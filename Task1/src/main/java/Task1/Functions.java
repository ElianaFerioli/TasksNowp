package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Functions {
	
	public static String sort(List<String> subjectParam, List<String> predicateParam, List<String> objectParam) {
		StringBuilder sorted_sentence = new StringBuilder("");
		List<String> subject = new ArrayList<String>(subjectParam);
		List<String> predicate = new ArrayList<String>(predicateParam);
		List<String> object = new ArrayList<String>(objectParam);
        Collections.sort(subject, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(predicate, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(object, String.CASE_INSENSITIVE_ORDER);
        
        subject.forEach((subj) -> {
        	
            predicate.forEach((pred) -> {
                object.forEach((obj) -> {
                	sorted_sentence.append(subj + " " + pred + " " + obj + ". ");
                });
            });
        });
        
        sorted_sentence.setLength(sorted_sentence.length() - 1);
		return sorted_sentence.toString();
    }

}

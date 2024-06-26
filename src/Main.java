import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    // create object from scanner to read input from user
        Scanner input = new Scanner(System.in);
        // define all stop words in language
        Set<String>stop_words = new HashSet<>(Arrays.asList(
                "a", "about", "above", "after", "again", "against", "all", "am", "an", "and", "any", "are", "aren't", "as",
                "at", "be", "because", "been", "before", "being", "below", "between", "both", "but", "by", "can't", "cannot",
                "could", "couldn't", "did", "didn't", "do", "does", "doesn't", "doing", "don't", "down", "during", "each",
                "few", "for", "from", "further", "had", "hadn't", "has", "hasn't", "have", "haven't", "having", "he", "he'd",
                "he'll", "he's", "her", "here", "here's", "hers", "herself", "him", "himself", "his", "how", "how's", "i",
                "i'd", "i'll", "i'm", "i've", "if", "in", "into", "is", "isn't", "it", "it's", "its", "itself", "let's", "me",
                "more", "most", "mustn't", "my", "myself", "no", "nor", "not", "of", "off", "on", "once", "only", "or",
                "other", "ought", "our", "ours", "ourselves", "out", "over", "own", "same", "shan't", "she", "she'd", "she'll",
                "she's", "should", "shouldn't", "so", "some", "such", "than", "that", "that's", "the", "their", "theirs",
                "them", "themselves", "then", "there", "there's", "these", "they", "they'd", "they'll", "they're", "they've",
                "this", "those", "through", "to", "too", "under", "until", "up", "very", "was", "wasn't", "we", "we'd", "we'll",
                "we're", "we've", "were", "weren't", "what", "what's", "when", "when's", "where", "where's", "which", "while",
                "who", "who's", "whom", "why", "why's", "with", "won't", "would", "wouldn't", "you", "you'd", "you'll", "you're",
                "you've", "your", "yours", "yourself", "yourselves"
        ));
        // create object from Hashmap type to store a word and number of repeated in the statement
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Please insert your statement to processing : ");
        //read  from user the statment
        String statment = input.nextLine();

        String[] result = statment.split(" ");
        /*    // need to found another solution  by ysing Collection and Stream  classes   ?????
//       List<String> list = Stream.of(stopWords)
//               .map(result::)
//               .collect(Collectors.toList());
//
//        List<String> list = Stream.of(result)
//
//                .filter(word-> !word.contains(words)).collect(Collectors.toList());
//        System.out.println(list);
*/
        //loop for the array after split user statement
        for (String s : result) {
            // check if this word isn't  in  stop words list
            if (!stop_words.contains(s))
                map.put(s, map.getOrDefault(s,0) + 1);

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
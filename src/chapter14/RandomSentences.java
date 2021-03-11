package chapter14;
//14.5 (Random Sentences) Write an application that uses random-number generation to create
//        sentences. Use four arrays of strings called article , noun , verb and preposition . Create a sentence
//        by selecting a word at random from each array in the following order: article , noun , verb , preposition ,
//       article and noun . As each word is picked, concatenate it to the previous words in the sentence.
//        The words should be separated by spaces. When the final sentence is output, it should start with a
//        capital letter and end with a period. The application should generate and display 20 sentences.
//        The article array should contain the articles "the" , "a" , "one" , "some" and "any" ; the noun
//        array should contain the nouns "boy" , "girl" , "dog" , "town" and "car" ; the verb array should con-
//        tain the verbs "drove" , "jumped" , "ran" , "walked" and "skipped" ; the preposition array should
//        contain the prepositions "to" , "from" , "over" , "under" and "on" .

import java.security.SecureRandom;

public class RandomSentences {

    String[] article = {"the", "a", "one", "some", "any"};
    String[] noun = {"boy", "girl", "dog", "town", "car"};
    String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    String[] preposition = {"to", "from", "over", "under", "on"};

    StringBuilder sentence = new StringBuilder();

    public String generateRandomWordFrom(String[] partOfSpeechArray) {
        SecureRandom secureRandom = new SecureRandom();
        int word = secureRandom.nextInt(partOfSpeechArray.length);
        return partOfSpeechArray[word];
    }


    public String generateSentence() {
        sentence.append(generateRandomWordFrom(article));
        sentence.append(" ");
        sentence.append(generateRandomWordFrom(noun));
        sentence.append(" ");
        sentence.append(generateRandomWordFrom(verb));
        sentence.append(" ");
        sentence.append(generateRandomWordFrom(preposition));
        sentence.append(".");
        sentence.append("\r");

        return sentence.toString();
    }

    public void twentyRandomSentenceGenerator() {
        int count = 1;
        int limit = 20;
        do {
            System.out.println (generateSentence());
            count++;
        } while (count <= limit);
    }

}

package chapter14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomSentencesTest {
    RandomSentences sentencesGenerator;

    String[] article;
    String[] noun;
    String[] verb;
    String[] preposition;

    @BeforeEach
    void setUp() {

        sentencesGenerator = new RandomSentences();
        article = new String[]{"the", "a", "one", "some", "any"};
        noun = new String[]{"boy", "girl", "dog", "town", "car"};
        verb = new String[]{"drove", "jumped", "ran", "walked", "skipped"};
        preposition = new String[]{"to", "from", "over", "under", "on"};
    }

    @AfterEach
    void tearDown() {
        sentencesGenerator = null;
        article = null;
        noun = null;
        verb = null;
        preposition = null;
    }

    @Test
    void testRandomWordGenerationMethodFromAnyStringArrayRangingFromArticleNounVerbPreposition() {
        String article1 = sentencesGenerator.generateRandomWordFrom(article);
        String article2 = sentencesGenerator.generateRandomWordFrom(article);
        assertNotEquals(article1, article2);


        String noun1 = sentencesGenerator.generateRandomWordFrom(noun);
        String noun2 = sentencesGenerator.generateRandomWordFrom(noun);
        assertNotEquals(noun1, noun2);


        String verb1 = sentencesGenerator.generateRandomWordFrom(verb);
        String verb2 = sentencesGenerator.generateRandomWordFrom(verb);
        assertNotEquals(verb1, verb2);


        String preposition1 = sentencesGenerator.generateRandomWordFrom(preposition);
        String preposition2 = sentencesGenerator.generateRandomWordFrom(preposition);
        assertNotEquals(preposition1, preposition2);

    }

    @Test
    void testStringBuilderConcatenationUsingAppendMethodToGenerateSentenceDelimiterBySpace() {
        String s1 = sentencesGenerator.generateSentence();
        String s2 = sentencesGenerator.generateSentence();
        System.out.println(s1);
        System.out.println(s2);
        assertNotEquals(s2, s1);
    }


    @Test
    void main() {
        sentencesGenerator.twentyRandomSentenceGenerator();
    }


}
package Entry;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DairyTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testDiaryEntryIsSet(){

        //given

        Dairy diary = new Dairy(5);
        //when
        int numberOfDiaryEntries = diary.getNumberOfDiaryEntries();

        //assert
        assertEquals(0, numberOfDiaryEntries);
    }


    @Test
    void testDiaryEntryIsNotNull(){

        //given

        Dairy diary;

        //when
        diary = new Dairy(10);

        //assert
        List<Entry> entries = diary.getEntries();

        assertNotNull(entries);


    }
    @Test
    void testDairyEntryCanBeEntered(){
        //given
        Dairy diary = new Dairy(5);
        Entry firstEntry = new Entry("My Break Up Story");
        firstEntry.setEntryBody("It just happened");
        //when
        diary.addNewEntry(firstEntry);
        //assert
        assertEquals(firstEntry, diary.getEntries().get(0));

    }

    @Test
    void diaryCanTakeTwoEntriesTest(){
        //given
        Dairy diary = new Dairy(5);
        Entry firstEntry = new Entry("My Break Up Story");
        firstEntry.setEntryBody("It just happened");
         diary.addNewEntry(firstEntry);
         Entry secondEntry = new Entry("My Graduation Party");
        secondEntry.setEntryBody("It just new");

        //when
        diary.addNewEntry(secondEntry);


        //assert
        List<Entry> result = diary.getEntries();
        assertEquals(secondEntry, result.get(1));



    }

}
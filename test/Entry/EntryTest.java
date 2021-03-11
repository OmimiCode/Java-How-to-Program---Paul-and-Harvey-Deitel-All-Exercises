package Entry;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
Entry entry;
    @BeforeEach
    void setUp() {
        entry = new Entry("Title");
    }

    @AfterEach
    void tearDown() {
        entry = null;
    }
    @Test
    void TestToCreateAndGenerateTitle(){
        //given
        entry = new Entry("Title");


        //when
        entry.setEntryTitle("New Entry Title");

        //assert
        assertEquals("New Entry Title", entry.getEntryTitle());

    }
    @Test
    void TestDateOfEntryIsCreatedAfterConstruction(){
        //given
    Entry entry;


        //when
        entry = new Entry("Title");

        //assert
        LocalDateTime entryDateAndTime = entry.getEntryDateAndTime();
        assertNotNull(entryDateAndTime);
        //assertlocalDate

        LocalDate date = entryDateAndTime.toLocalDate();
        assertEquals(LocalDate.now(),date);
        System.out.println(entryDateAndTime.toString());

    }
    @Test
    void testEntryBodyIsEditable(){

        //given
        entry = new Entry("Title");

        //when

        entry.setEntryBody("this is the entry body");

        // assert

        String entryBody= entry.getEntryBody();
        assertEquals("this is the entry body", entryBody);
    }

    @Test
    void testViewEntry(){
        Entry entry = new Entry("My Breakup Story");
        entry.setEntryBody(("it just happened"));
        String actual = entry.viewEntry();
        String expected =
                ("title: My Breakup Story" + "\n"
                +"Entry Date: "+LocalDate.now()+ "\n"
                +"Entry Body: it just happened");

        assertEquals(expected,actual);

        actual= entry.toString();
        assertEquals(expected,actual );
    }

}
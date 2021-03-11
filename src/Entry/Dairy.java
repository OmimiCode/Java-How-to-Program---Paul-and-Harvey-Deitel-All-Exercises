package Entry;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
//    private Entry[] entries;

    private List<Entry> entries;
    private int maximumNumberOfEntries;
    public Dairy(int numberOfDiaryEntries) {
        entries = new ArrayList<>();
        maximumNumberOfEntries = numberOfDiaryEntries;
//        entries = new Entry[numberOfDiaryEntries];
    }

    public int getNumberOfDiaryEntries() {
     return entries.size();
    }

//    public Entry[] getEntries() {
//        return entries;
//
//    }


    public List<Entry> getEntries() {
        return entries;
    }

    public int getMaximumNumberOfEntries() {
        return maximumNumberOfEntries;
    }

    public void addNewEntry(Entry entry) {
        if(entries.size()< maximumNumberOfEntries) {
            entries.add(entry);
        }

//        entries[0] = entry;
//        for(int counter=0; counter < entries.length; counter++){
//            if(entries[counter]==null){
//                entries[counter]=entry;
//                break;
//            }
//        }

    }
}

package uk.ac.imperial.io;

import com.esotericsoftware.kryo.io.Input;
import uk.ac.imperial.state.ClassifiedState;
import uk.ac.imperial.state.Record;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/**
 * Class that digests multiple states from an Input stream
 */
public interface MultiStateReader {
    /**
     *
     * @param input
     * @return state transitions in the input file
     */
    Collection<Record> readRecords(Input input) throws IOException;

    /**
     *
     * @param input
     * @return state mappings in the state file
     */
    Map<Integer, ClassifiedState> readStates(Input input);
}

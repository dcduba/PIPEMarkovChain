package uk.ac.imperial.io;

import com.esotericsoftware.kryo.io.Output;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import uk.ac.imperial.state.ClassifiedState;
import uk.ac.imperial.utils.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class StateIOProcessorTest {

    @Mock
    private Output output;

    @Mock
    private Output stateOutput;

    @Mock
    private StateWriter writer;

    @Mock
    private ClassifiedState state;

    private Map<Integer, Pair<Double, Collection<String>>> successors;

    private StateIOProcessor processor;

    @Before
    public void setUp() {
        successors = new HashMap<>();
        successors.put(2, new Pair<Double, Collection<String>>(1.4, new ArrayList<String>()));
        processor = new StateIOProcessor(writer, output, stateOutput);
    }

    @Test
    public void writesToStateWriter() {
        processor.processTransitions(1, successors);
        verify(writer).writeTransitions(1, successors, output);
    }

    @Test
    public void writesStateToWriter() {
        processor.processState(state, 1);
        verify(writer).writeState(state, 1, stateOutput);
    }

}
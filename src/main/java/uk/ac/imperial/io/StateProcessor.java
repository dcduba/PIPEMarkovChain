package uk.ac.imperial.io;

import uk.ac.imperial.state.ClassifiedState;
import uk.ac.imperial.utils.Pair;
import java.util.Collection;

import java.util.Map;

/**
 * This interface will process state transitions in whatever way
 * the underlying implementation likes
 */
public interface StateProcessor {

    /**
     *
     * Process transitions from state to successor rates. Processing happens in
     * integer form since the name of the state is not needed
     *
     * @param stateId unique id for state
     * @param successorData unique id for successors to the rate at which they are enterd
     */
    void processTransitions(int stateId, Map<Integer, Pair<Double, Collection<String>>> successorData);

    /**
     *
     * Process the assigning of an id to a state
     *
     * @param state
     * @param stateId
     */
    void processState(ClassifiedState state, int stateId);

}

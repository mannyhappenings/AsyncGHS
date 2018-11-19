package ghs.message;

import edu.princeton.cs.algs4.Edge;

/**
 * Represents an initiate message, broadcast by the leader of the component to all processes in its component to start
 * searching for the MWOE.
 */
public class Initiate extends Message {
    /**
     * Level of the sender's component
     */
    private Integer level;

    /**
     * Core edge weight of the sender's component
     */
    private Edge coreEdge;

    /**
     * ID of leader of sender's component
     */
    private Integer leader;

    public Initiate(Integer sender, Integer receiver, Integer level, Edge coreEdge, Integer leader) {
        super(sender, receiver);
        this.level = level;
        this.coreEdge = coreEdge;
        this.leader = leader;
    }

    public Integer getLevel() {
        return level;
    }

    public Edge getCoreEdge() {
        return coreEdge;
    }

    public Integer getLeader() {
        return leader;
    }

    @Override
    public String toString() {
        return "Initiate{" +
                this.getSender() +
                " ===> " + this.getReceiver() +
                ", level=" + level +
                ", coreEdge=" + coreEdge +
                ", leader=" + leader +
                '}';
    }
}

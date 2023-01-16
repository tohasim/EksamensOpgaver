package Opgaver.Opgave17;

public class Candidate {
    private String name, party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes){
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }
    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getParty() {
        return party;
    }

    @Override
    public String toString() {
        return String.format("navn: %s, parti: %s", name, party);
    }
}

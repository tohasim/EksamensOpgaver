package Opgave17;

import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;

public class Election {
    private Candidate[] candidates;

    public Election(){
        Candidate cand1 = new Candidate("Kandidat1","Parti1", 1);
        Candidate cand2 = new Candidate("Kandidat2","Parti2", 10);
        Candidate cand3 = new Candidate("Kandidat3","Parti3", 12);
        Candidate cand4 = new Candidate("Kandidat4","Parti1", 18);
        Candidate cand5 = new Candidate("Kandidat5","Parti3", 0);
        Candidate cand6 = new Candidate("Kandidat6","Parti4", 9);
        candidates = new Candidate[]{cand1, cand2, cand3, cand4, cand5, cand6};
    }

    public int getTotalVotes(){
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> returnList = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party))
                returnList.add(candidate);
        }
        return returnList;
    }

    public static void main(String[] args){
        Election election = new Election();
        System.out.printf("TOTAL VOTES: %d \n" +
                "Kandidater i Parti1: %s", election.getTotalVotes(), election.getCandidatesFromParty("Parti1"));
    }
}

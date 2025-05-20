import java.util.*;

class IceAssociation {
    private List<Membership> memberships;

    public IceAssociation() {
        this.memberships = new ArrayList<>();
    }

    public void addMembership(Membership membership) {
        this.memberships.add(membership);
    }

    public double getTotalProfitPerYear() {
        double total = 0;
        for (Membership membership : memberships) {
            total += membership.getMembershipFee();
        }
        return total;
    }

    public Membership getOldestMember() {
        Membership oldest = memberships.get(0);
        for (Membership membership : memberships) {
            if (membership.getPerson().getDateOfBirth().isBefore(oldest.getPerson().getDateOfBirth())) {
                oldest = membership;
            }
        }
        return oldest;
    }

    public Membership getYoungestMember() {
        Membership youngest = memberships.get(0);
        for (Membership membership : memberships) {
            if (membership.getPerson().getDateOfBirth().isAfter(youngest.getPerson().getDateOfBirth())) {
                youngest = membership;
            }
        }
        return youngest;
    }

    public Membership getLongestRunningMembership() {
        Membership longestRunning = memberships.get(0);
        for (Membership membership : memberships) {
            if (membership.getRegistrationDate().isBefore(longestRunning.getRegistrationDate())) {
                longestRunning = membership;
            }
        }
        return longestRunning;
    }
}

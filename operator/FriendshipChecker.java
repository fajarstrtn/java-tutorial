
class Friend {
}

class CloseFriend extends Friend {
}

class MutualFriend extends Friend implements Reachable {
}

interface Reachable {
}

public class FriendshipChecker {

    public static void main(String[] args) {
        Friend john = new CloseFriend();
        Friend jane = new MutualFriend();

        System.out.println("Is John instanceof Friend? " + (john instanceof Friend));               // Output: Is John instanceof Friend? true
        System.out.println("Is John instanceof MutualFriend? " + (john instanceof MutualFriend));   // Output: Is John instanceof MutualFriend? false
        System.out.println("Is Jane instanceof Friend? " + (jane instanceof Friend));               // Output: Is Jane instanceof Friend? true
        System.out.println("Is Jane instanceof MutualFriend? " + (jane instanceof MutualFriend));   // Output: Is Jane instanceof MutualFriend? true
        System.out.println("Is Jane instanceof Reachable? " + (jane instanceof Reachable));         // Output: Is Jane instanceof Reachable? true
    }

}

public class FlourPacker {
    // bigCount stands for 5 kg bags of flour, smallCount are 1kg bags and goal is the goal amount.
    // We must be able to get the exact amount of goal flour from full bags,
    // so 2 bigCount and 9 goal is false, but 2 bigCount, 4 smallCount and 9 goal is true.
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        // returns false if any value is negative
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // returns false if the total amount of flour is less than the goal
        if ((bigCount*5 + smallCount) < goal)
            return false;
        while (goal >= 5) {
            // uses a bigCount bag (5kg) from the goal and reruns while loop
            if (bigCount > 0) {
                bigCount--;
                goal -= 5;
            }
            // returns true if there are more 1 kg bags than the goal
            if (smallCount >= goal) {
                return true;
            }
        }
        // after there is no way to use 5kg bags, there must be more 1 kg bags than the goal
        if (smallCount > goal || goal == 0) {
            return true;
        } else {
            return false;
        }
    }

}

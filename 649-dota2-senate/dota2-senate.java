class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();

        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        // Step 1: Fill queues
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.offer(i);
            } else {
                dQueue.offer(i);
            }
        }

        // Step 2: Simulation
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rIndex = rQueue.poll();
            int dIndex = dQueue.poll();

            if (rIndex < dIndex) {
                // R bans D
                rQueue.offer(rIndex + n);
            } else {
                // D bans R
                dQueue.offer(dIndex + n);
            }
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";
        
    }
}
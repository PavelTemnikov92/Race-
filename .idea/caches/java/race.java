class Race {
    private String currentLeader;
    private int leaderDistance;
    private static final int time = 24;

    public Race() {
        currentLeader = "";
        leaderDistance = 0;
    }
    public void checkNewLeader(Car car) {
        int newDistance = car.getSpeed() * time;

        if (newDistance > leaderDistance) {
            currentLeader = car.getName();
            leaderDistance = newDistance;
        }
    }

    public String getCurrentLeader() {
        return currentLeader;
    }
    public int getLeaderDistance() {
        return leaderDistance;
    }
}
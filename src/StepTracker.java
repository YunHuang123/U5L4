public class StepTracker {
    private int min;
    private int activeDayTrack;
    private int dayTrack;
    private int stepTrack;

    public StepTracker(int m)
    {
        min = m;
        activeDayTrack = 0;
        dayTrack = 0;
        stepTrack = 0;
    }

    public void addDailySteps(int steps)
    {
        stepTrack += steps;
        dayTrack ++;
        if (steps >= min)
        {
            activeDayTrack ++;
        }
    }

    public int activeDays()
    {
        return activeDayTrack;
    }

    public Double averageSteps()
    {
        if (dayTrack > 0)
        {
            return (double)stepTrack / dayTrack;
        }
        else
        {
            return 0.0;
        }
    }
}

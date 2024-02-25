package week4.training01.Task;

import java.time.LocalTime;

public class Task {
    private String jobId;
    private String jobName;
    private LocalTime startTime;
    private LocalTime endTime;
    // Constructor
    public Task(String jobId, String jobName, LocalTime startTime, LocalTime endTime) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Task() {
        super();
    }
    // Getters and Setters

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "MaCV = '" + jobId + '\'' +
                ", TenCV = '" + jobName + '\'' +
                ", ThoiGianBatDau = " + startTime +
                ", ThoiGianKetThuc = " + endTime +
                '}';
    }
}

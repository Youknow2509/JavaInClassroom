package week4.training01.Example;

import week4.training01.Task.Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex {
    private static List<Task> readTasksFromFile(String filename) {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    String jobId = parts[0].trim();
                    String jobName = parts[1].trim();
                    LocalTime startTime = LocalTime.parse(parts[2].trim());
                    LocalTime endTime = LocalTime.parse(parts[3].trim());
                    tasks.add(new Task(jobId, jobName, startTime, endTime));
                } else {
                    System.err.println("Dinh dang loi: " + line);
                }
            }
        } catch (IOException | ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
        return tasks;
    }

    private static void printTasks(List<Task> tasks) {
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    private static void findGapBetweenTasks(List<Task> tasks) {

        LocalTime earliestStartTime = tasks.get(0).getStartTime();
        LocalTime latestEndTime = tasks.get(0).getEndTime();
        // Tim thoi gian bat dau som nhat va thoi gian ket thuc muon nhat
        for (Task task : tasks) {
            if (task.getStartTime().isBefore(earliestStartTime)) {
                earliestStartTime = task.getStartTime();
            }
            if (task.getEndTime().isAfter(latestEndTime)) {
                latestEndTime = task.getEndTime();
            }
        }
        // Sap xep cac cong viec theo thoi gian bat dau
        Collections.sort(tasks, (t1, t2) ->
                t1.getStartTime().compareTo(t2.getStartTime())
        );
        // Tim khoang thoi gian rong giua cac cong viec
        long maxGap = 0;
        LocalTime previousEndTime = earliestStartTime;
        for (Task task : tasks) {
            long gap = java.time.Duration.between(previousEndTime, task.getStartTime()).toMinutes();
            if (gap > maxGap) {
                maxGap = gap;
            }
            previousEndTime = task.getEndTime();
        }
        System.out.println("Thoi gian tre lon nhat giua hai cong viec la: " + maxGap + " phut.");
    }
    public static void main(String[] args) {
        // Doc danh sach cong viec tu file
        List<Task> tasks = readTasksFromFile("week4/training01/data.txt");
        if (tasks != null && !tasks.isEmpty()) {
            // Hien thi danh sach cong viec
            printTasks(tasks);
            // Tim khoang thoi gian rong giua cac cong viec
            findGapBetweenTasks(tasks);
        } else {
            System.out.println("Khong tim thay cong viec nao");
        }
    }
}

package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExample
{
    private static final ExecutorService peopleToExecuteTasks = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException
    {
        House house = new House(new Bedroom());

        List<Future<String>> future =
                house.getHouseTasks().stream()
                        .map(task -> peopleToExecuteTasks.submit(() -> {
                                    try {
                                        return task.execute();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    return null;
                                })
                        ).collect(Collectors.toCollection(CopyOnWriteArrayList::new));

        while (true)
        {
            int tasksNotFinished = 0;

            for (Future<?> fut : future)
            {
                if (fut.isDone())
                {
                    try
                    {
                        System.out.println("You finished " + fut.get());
                        future.remove(fut);
                    }
                    catch (InterruptedException | ExecutionException e)
                    {
                        e.printStackTrace();
                    }
                }
                else
                {
                    tasksNotFinished++;
                }
            }
            if (future.stream().allMatch(Future::isDone))
            {
                break;
            }

            System.out.println("Not finished tasks -> " + tasksNotFinished);
            Thread.sleep(500);
        }

        peopleToExecuteTasks.shutdown();
    }
}

class House {
    private final List<Room> room;

    House(Room... room)
    {
        this.room = Arrays.asList(room);
    }

    List<Task> getHouseTasks()
    {
        return this.room.stream().map(Room::getRoomTasks)
                .reduce(new ArrayList<>(), (pivo, tasks) -> {
                    pivo.addAll(tasks);
                    return pivo;
                });
    }
}

interface Task
{
    String execute() throws InterruptedException;
}

abstract class Room
{
    abstract List<Task> getRoomTasks();
}

class Bedroom extends Room
{
    @Override
    List<Task> getRoomTasks() {

        return Arrays.asList(
                this::makeTheBed,
                this::toSweepBedroom,
                this::toDoTheDishes
        );
    }

    private String toDoTheDishes() throws InterruptedException
    {
        Thread.sleep(5000);
        return "to do the dishes";
    }

    private String toSweepBedroom() throws InterruptedException
    {
        Thread.sleep(7000);
        return "to sweep the bedroom";
    }

    private String makeTheBed() throws InterruptedException
    {
        Thread.sleep(10000);
        return "to make the bed";
    }
}
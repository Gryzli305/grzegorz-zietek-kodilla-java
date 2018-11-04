package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPING = "SHOPING";

    public final Task makeTask(final String taskClass, String taskName, String colorOrWhereOrWhatToBuy, String whatToPaintOrUsingOrQuanitity) {
        switch (taskClass) {

            case DRIVING:
                return new DrivingTask(taskName, colorOrWhereOrWhatToBuy, whatToPaintOrUsingOrQuanitity);

            case PAINTING:
                return new PaintingTask(taskName, colorOrWhereOrWhatToBuy, whatToPaintOrUsingOrQuanitity);

            case SHOPING:
                return new ShoppingTask(taskName, colorOrWhereOrWhatToBuy, Double.parseDouble(whatToPaintOrUsingOrQuanitity));

            default:
                return null;
        }
    }
}

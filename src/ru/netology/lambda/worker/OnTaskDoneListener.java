package ru.netology.lambda.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}

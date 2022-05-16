package ru.netology.lambda.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}

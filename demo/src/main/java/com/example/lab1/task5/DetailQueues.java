package com.example.lab1.task5;

import java.util.concurrent.LinkedBlockingQueue;

public class DetailQueues {
    public static LinkedBlockingQueue<Detail> detailsToCollect = new LinkedBlockingQueue<>();
    public static LinkedBlockingQueue<Detail> detailsToCheck = new LinkedBlockingQueue<>();
}

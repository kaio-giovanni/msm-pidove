package com.example.msmpidove.queues;

public class UserQueues {

    public static final String CREATE_USER = "queue/user/create";

    public static final String UPDATE_USER = "queue/user/update";

    public static final String DELETE_USER_BY_ID = "queue/user/delete/id";

    public static final String FIND_USER_BY_ID = "queue/user/find/id";

    public static final String FIND_ALL_USERS = "queue/user/find/all";

    private UserQueues() {
        // Do nothing
    }

}
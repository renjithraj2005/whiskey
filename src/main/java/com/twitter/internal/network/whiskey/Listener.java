package com.twitter.internal.network.whiskey;

import java.util.concurrent.Executor;

public interface Listener<T> {
    public void onComplete(T result);
    public void onError(Throwable throwable);
    public Executor getExecutor();
}

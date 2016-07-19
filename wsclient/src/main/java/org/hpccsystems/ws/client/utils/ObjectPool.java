package org.hpccsystems.ws.client.utils;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T>
{
    private long expirationTime;

    private Hashtable<T, Long> locked, unlocked;

    public ObjectPool(long expirationTime)
    {
        this.expirationTime = expirationTime;
        locked = new Hashtable<T, Long>();
        unlocked = new Hashtable<T, Long>();
    }

    public ObjectPool()
    {
        this(60000); // default 1 minute
    }

    protected abstract T create();

    public abstract boolean validate(T object);

    public abstract void expire(T object);

    public synchronized T checkOut()
    {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0)
        {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements())
            {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expirationTime) //create new one if expired
                {
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                }
                else
                {
                    if (validate(t)) // found good one
                    {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return (t);
                    }
                    else // did not pass validate, create new one
                    {
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        // no objects available, create a new one
        t = create();
        locked.put(t, now);
        return (t);
    }

    public synchronized void checkIn(T t)
    {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}

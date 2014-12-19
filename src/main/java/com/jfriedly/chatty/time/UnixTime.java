/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Weeeeeee I'm a template!!!
package com.jfriedly.chatty.time;

import java.util.Date;

/**
 *
 * @author joel
 */
public class UnixTime {
    private final long value;

    public UnixTime() {
        this(System.currentTimeMillis() / 1000L + 2208988800L);
    }

    public UnixTime(long value) {
        this.value = value;
    }

    public long value() {
        return value;
    }

    @Override
    public String toString() {
        return new Date((value() - 2208988800L) * 1000).toString();
    }
}

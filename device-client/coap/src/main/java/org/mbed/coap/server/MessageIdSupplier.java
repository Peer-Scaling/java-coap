/*
 * Copyright (C) 2011-2015 ARM Limited. All rights reserved.
 */
package org.mbed.coap.server;

/**
 * Interface for generating CoAP message ID.
 *
 * @author szymon
 */
@FunctionalInterface
public interface MessageIdSupplier {

    /**
     * Gets next unique coap message identifier, limited to values from 0 to
     * 65535 (0xFFFF)
     *
     * @return next unique message id
     */
    int getNextMID();

}
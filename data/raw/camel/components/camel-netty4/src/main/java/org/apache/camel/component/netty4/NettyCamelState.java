/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.netty4;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;

/**
 * Stores state for {@link NettyProducer} when sending messages.
 * <p/>
 * This allows the {@link org.apache.camel.component.netty4.handlers.ClientChannelHandler} to access
 * this state, which is needed so we can get hold of the current {@link Exchange} and the
 * {@link AsyncCallback} so we can continue routing the message in the Camel routing engine.
 */
public final class NettyCamelState {

    private final Exchange exchange;
    private final AsyncCallback callback;

    public NettyCamelState(AsyncCallback callback, Exchange exchange) {
        this.callback = callback;
        this.exchange = exchange;
    }

    public AsyncCallback getCallback() {
        return callback;
    }

    public Exchange getExchange() {
        return exchange;
    }
}

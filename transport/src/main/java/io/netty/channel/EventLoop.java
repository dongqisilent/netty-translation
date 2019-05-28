/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel;

import io.netty.util.concurrent.OrderedEventExecutor;

/**
 * EventLoop是一个特殊的{@link io.netty.util.concurrent.EventExecutor},
 * 它只有单个线程，且是事件循环的运行模式。
 *
 * {@link EventLoop}将会处理注册到它上面的{@link Channel}的所有IO操作。
 *
 * 一个{@link EventLoop}在其生命周期中，只会绑定在同一个线程上。
 *
 * 它继承EventLoopGroup的必要性是因为它可以代表EventLoopGroup绑定到Bootstrap。
 *
 * Will handle all the I/O operations for a {@link Channel} once registered.
 *
 * One {@link EventLoop} instance will usually handle more than one {@link Channel} but this may depend on
 * implementation details and internals.
 *
 */
public interface EventLoop extends OrderedEventExecutor, EventLoopGroup {

    @Override
    EventLoopGroup parent();

}

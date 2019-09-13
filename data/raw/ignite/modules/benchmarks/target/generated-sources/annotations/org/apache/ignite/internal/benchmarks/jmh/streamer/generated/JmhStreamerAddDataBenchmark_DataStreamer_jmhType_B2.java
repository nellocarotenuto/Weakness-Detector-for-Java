package org.apache.ignite.internal.benchmarks.jmh.streamer.generated;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2 extends JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B1 {
    public volatile int setupTrialMutex;
    public volatile int tearTrialMutex;
    public final static AtomicIntegerFieldUpdater<JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2> setupTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2.class, "setupTrialMutex");
    public final static AtomicIntegerFieldUpdater<JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2> tearTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2.class, "tearTrialMutex");

    public volatile int setupIterationMutex;
    public volatile int tearIterationMutex;
    public final static AtomicIntegerFieldUpdater<JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2> setupIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2.class, "setupIterationMutex");
    public final static AtomicIntegerFieldUpdater<JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2> tearIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2.class, "tearIterationMutex");

    public volatile int setupInvocationMutex;
    public volatile int tearInvocationMutex;
    public final static AtomicIntegerFieldUpdater<JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2> setupInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2.class, "setupInvocationMutex");
    public final static AtomicIntegerFieldUpdater<JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2> tearInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(JmhStreamerAddDataBenchmark_DataStreamer_jmhType_B2.class, "tearInvocationMutex");

    public volatile boolean readyTrial;
    public volatile boolean readyIteration;
    public volatile boolean readyInvocation;
}

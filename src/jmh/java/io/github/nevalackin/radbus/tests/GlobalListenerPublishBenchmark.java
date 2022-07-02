package io.github.nevalackin.radbus.tests;

import io.github.nevalackin.radbus.PubSub;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.AverageTime)
@Measurement(iterations = 5, time = 1)
@Fork(1)
@Warmup(iterations = 2, time = 1)
public class GlobalListenerPublishBenchmark {

    private PubSub<String> messageBus;

    @Setup
    public void setup() {
        this.messageBus = PubSub.newInstance(System.err::println);
        this.messageBus.subscribe(String.class, message -> {});
    }

    @Benchmark
    public void benchmark() {
        for (int i = 0; i < 1_000_000; i++) {
            this.messageBus.publish("");
        }
    }
}

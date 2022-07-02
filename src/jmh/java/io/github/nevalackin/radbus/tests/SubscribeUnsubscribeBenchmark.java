package io.github.nevalackin.radbus.tests;

import io.github.nevalackin.radbus.PubSub;
import io.github.nevalackin.radbus.tests.subscribers.ExampleSubscriber;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Measurement(iterations = 5, time = 1)
@Fork(1)
@Warmup(iterations = 2, time = 1)
public class SubscribeUnsubscribeBenchmark {

    private PubSub<String> messageBus;
    private ExampleSubscriber subscriber;

    @Setup
    public void setup() {
        this.messageBus = PubSub.newInstance(System.err::println);
        this.subscriber = new ExampleSubscriber();
    }

    @Benchmark
    public void benchmark() {
        this.messageBus.subscribe(this.subscriber);
        this.messageBus.unsubscribe(this.subscriber);
    }
}
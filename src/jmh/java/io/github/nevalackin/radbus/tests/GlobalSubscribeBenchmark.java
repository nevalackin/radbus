package io.github.nevalackin.radbus.tests;

import io.github.nevalackin.radbus.PubSub;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Measurement(iterations = 5, time = 1)
@Fork(1)
@Warmup(iterations = 2, time = 1)
public class GlobalSubscribeBenchmark {

    private PubSub<String> messageBus;

    @Setup
    public void setup() {
        this.messageBus = PubSub.newInstance(System.err::println);
    }
    
    @Benchmark
    public void benchmark() {
        this.messageBus.subscribe(String.class, message -> {});
    }
}
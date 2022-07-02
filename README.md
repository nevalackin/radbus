# radbus

A faster, simpler, dependency-less pub-sub event bus.

## Get It
Get it via [JitPack](https://jitpack.io/):
#### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>io.github.nevalackin</groupId>
        <artifactId>radbus</artifactId>
        <version>1.0.0</version>
    </dependency> 
</dependencies>
```
#### Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
```groovy
dependencies {
    implementation 'io.github.nevalackin:radbus:1.0.0'
}
```
or via the prebuilt artifacts on the [releases page](https://github.com/nevalackin/radbus/releases/latest).

## Benchmark Results

Results were obtained using the JMH benchmarking framework, the benchmark code is available in
the [jmh module](src/jmh/java/io/github/nevalackin/radbus/tests).

| Benchmark                                                                                                            | Mode | Cnt | Score     | Error       | Units |
|----------------------------------------------------------------------------------------------------------------------|------|-----|-----------|-------------|-------|
| [GlobalListenerPublishBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/GlobalListenerPublishBenchmark.java) | avgt | 5   | 5.672     | ± 0.155     | ms/op |
| [GlobalSubscribeBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/GlobalSubscribeBenchmark.java)             | avgt | 5   | 559.399   | ± 3270.556  | ns/op |
| [NoListenerPublishBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/NoListenerPublishBenchmark.java)         | avgt | 5   | 2.138     | ± 0.080     | ms/op |
| [PublishBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/PublishBenchmark.java)                             | avgt | 5   | 5.802     | ± 0.066     | ms/op |
| [SubscribeBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/SubscribeBenchmark.java)                         | avgt | 5   | 55020.698 | ± 19232.058 | ns/op |
| [SubscribeUnsubscribeBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/SubscribeUnsubscribeBenchmark.java)   | avgt | 5   | 45866.610 | ± 331.688   | ns/op |
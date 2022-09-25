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

Results were obtained using the JMH benchmarking framework with OpenJDK 17, the benchmark code is available in
the [jmh module](src/jmh/java/io/github/nevalackin/radbus/tests).

| Benchmark                                                                                                            | Mode | Cnt | Score     | Error      | Units |
|----------------------------------------------------------------------------------------------------------------------|------|-----|-----------|------------|-------|
| [GlobalListenerPublishBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/GlobalListenerPublishBenchmark.java) | avgt | 5   | 4.622     | ± 0.245    | ms/op |
| [GlobalSubscribeBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/GlobalSubscribeBenchmark.java)             | avgt | 5   | 61.489    |            | ns/op |
| [NoListenerPublishBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/NoListenerPublishBenchmark.java)         | avgt | 5   | 1.101     | ± 0.022    | ms/op |
| [PublishBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/PublishBenchmark.java)                             | avgt | 5   | 4.757     | ± 0.072    | ms/op |
| [SubscribeBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/SubscribeBenchmark.java)                         | avgt | 5   | 37122.753 | ± 5428.944 | ns/op |
| [SubscribeUnsubscribeBenchmark](src/jmh/java/io/github/nevalackin/radbus/tests/SubscribeUnsubscribeBenchmark.java)   | avgt | 5   | 35792.825 | ± 4918.771 | ns/op |

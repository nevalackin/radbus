package io.github.nevalackin.radbus;

/**
 * @author nevalackin
 * @since 1.0.0
 */
@FunctionalInterface
public interface Listener<Event> {

    void invoke(Event event);
}